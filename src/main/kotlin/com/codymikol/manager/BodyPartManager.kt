package com.codymikol.manager

import com.codymikol.dto.DtoMonsterPart
import com.codymikol.repository.BodyPartRepository

object BodyPartManager {
    fun getAllBodyParts(
        part: String? = null,
        category: String? = null,
        creature: String? = null,
    ): List<DtoMonsterPart> {
        return BodyPartRepository
            .getBodyParts(part, category, creature)
            .map { it.asDto() }
    }

}