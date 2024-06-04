package com.advanced.mockserver

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val id: Long = 0,
    val name: String,
    val passWord: String,
    val userName: String,
    @DrawableRes val image: Int
): Parcelable