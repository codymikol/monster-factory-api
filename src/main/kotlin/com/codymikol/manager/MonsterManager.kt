package com.codymikol.manager

import arrow.core.raise.either
import arrow.core.raise.ensure
import arrow.core.raise.ensureNotNull
import com.codymikol.data.MonsterPart
import com.codymikol.data.MonsterParts
import com.codymikol.enums.Segment
import com.codymikol.repository.MonsterRepository
import io.ktor.http.*
import kotlinx.serialization.Serializable

@Serializable
data class NewMonsterRequest(
    val name: String,
    val leg: String,
    val torso: String,
    val head: String,
)

data class MonsterHttpError(
    val message: String,
    val code: HttpStatusCode,
)

object MonsterManager {

    private fun validateMonsterNotBoring(leg: MonsterPart, torso: MonsterPart, head: MonsterPart) = either {
        ensure(setOf(leg.creature, torso.creature, head.creature).size > 1) {
            MonsterHttpError(
                message = "This monster is very boring, it just looks like a regular old ${head.creature.name.lowercase()}...",
                code = HttpStatusCode.BadRequest,
            )
        }
    }

    private fun validatePartExists(id: String) = either {
        ensureNotNull(MonsterParts.data.firstOrNull { it.id == id }) {
            MonsterHttpError(
                message = "No monster part with id [${id}] was found.",
                code = HttpStatusCode.BadRequest,
            )
        }
    }

    private fun validatePartIsSegment(part: MonsterPart, segment: Segment) = either {
        ensure(part.segment == segment) {
            MonsterHttpError(
                message = "Invalid part ${part.id} was not of segment ${segment.name}, but instead ${part.segment.name}.",
                code = HttpStatusCode.BadRequest,
            )
        }
    }

    fun createMonster(request: NewMonsterRequest) = either {

        val leg = validatePartExists(request.leg).bind()
        val torso = validatePartExists(request.torso).bind()
        val head = validatePartExists(request.head).bind()

        validatePartIsSegment(leg, Segment.LEGS).bind()
        validatePartIsSegment(torso, Segment.TORSO).bind()
        validatePartIsSegment(head, Segment.HEAD).bind()

        validateMonsterNotBoring(leg, torso, head).bind()

        val monster = MonsterRepository.create(request)

        monster

    }

}