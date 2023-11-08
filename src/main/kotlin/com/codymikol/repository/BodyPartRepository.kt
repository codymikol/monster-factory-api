package com.codymikol.repository

import com.codymikol.data.MonsterPart
import com.codymikol.data.MonsterParts

object BodyPartRepository {

    fun getBodyParts(
        part: String? = null,
        category: String? = null,
        creature: String? = null,
    ): List<MonsterPart> {

        val monsters = MonsterParts.data

        val filtered = monsters.filter {
            (part == null || part == it.segment.name) &&
                    (category == null || it.category.name == category) &&
                    (creature == null || it.creature.name == creature)
        }

        return filtered

    }

}