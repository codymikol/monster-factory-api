package com.codymikol.repository

import com.codymikol.data.Monster
import com.codymikol.dto.DtoMonster
import com.codymikol.manager.NewMonsterRequest
import java.util.*

object MonsterRepository {

    private val monsters = mutableMapOf<String, Monster>()

    fun getByIdOrNull(id: String) = monsters[id]

    fun create(newMonster: NewMonsterRequest): Monster {

        val id = UUID.randomUUID().toString()

        val monster = Monster(
            id = id,
            name = newMonster.name,
            head = newMonster.head,
            torso = newMonster.torso,
            leg = newMonster.leg,
        )

        monsters[id] = monster

        return monster

    }


}