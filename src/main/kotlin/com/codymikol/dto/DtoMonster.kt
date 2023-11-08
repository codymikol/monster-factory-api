package com.codymikol.dto

import kotlinx.serialization.Serializable

@Serializable
data class DtoMonster(
    val id: String,
    val name: String,
    val leg: String,
    val torso: String,
    val head: String,
)