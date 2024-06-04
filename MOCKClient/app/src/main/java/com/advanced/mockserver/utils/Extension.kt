package com.advanced.mockserver.utils

import com.advanced.mockclient.R

fun convertNameToImageResource(name: String): Int{
    return when(name){
        "Mai Trang" -> R.drawable.image_mai_trang
        "Minh Quân" -> R.drawable.image_minh_quan
        "Ngọc Lan" -> R.drawable.image_ngoc_lan
        "Nam Tran" -> R.drawable.image_nam_tran
        else -> R.drawable.image_nam_tran
    }
}