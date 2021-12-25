package com.timmitof.exampractice.models

import java.io.Serializable

data class NewsList(
    val categoryId: Int,
    val image: String,
    val titleNews: String,
    val description: String ?= null
): Serializable
