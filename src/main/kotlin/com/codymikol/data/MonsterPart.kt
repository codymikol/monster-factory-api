package com.codymikol.data

import com.codymikol.dto.DtoMonsterPart
import com.codymikol.enums.Category
import com.codymikol.enums.Creature
import com.codymikol.enums.Segment
import java.util.*

private fun String.titlecase() = replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

data class MonsterPart(
    val src: String,
    val id: String,
    val category: Category,
    val creature: Creature,
    val segment: Segment,
) {
    fun asDto(): DtoMonsterPart = DtoMonsterPart(
        name = "${this.creature.name.lowercase().titlecase()} ${this.segment.name.lowercase().titlecase()}",
        id = this.id,
        creature = this.creature.name,
        segment = this.segment.name,
        category = this.category.name,
        src = this.src,
    )

}