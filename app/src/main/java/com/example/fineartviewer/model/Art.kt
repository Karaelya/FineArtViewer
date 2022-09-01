package com.example.fineartviewer.model

import androidx.annotation.DrawableRes

data class Art(
    @DrawableRes val imageResourceId: Int,
    val title: String,
    val medium: String,
    val size: String
)