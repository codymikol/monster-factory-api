package com.codymikol.dto

import kotlinx.serialization.Serializable

@Serializable
data class DtoMonsterPart(
    val name: String,
    val id: String,
    val creature: String,
    val segment: String,
    val category: String,
    val src: String,
)