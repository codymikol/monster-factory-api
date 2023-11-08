package com.codymikol.data

import com.codymikol.dto.DtoMonster

data class Monster(
    val id: String,
    val name: String,
    val head: String,
    val torso: String,
    val leg: String,
) {

    fun asDto() = DtoMonster(
        id = this@Monster.id,
        name = this@Monster.name,
        leg = this@Monster.leg,
        torso = this@Monster.torso,
        head = this@Monster.head,
    )

}