package com.advanced.mockserver

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Parcelable
import android.util.Base64
import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.advanced.mockserver.utils.Constants
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = Constants.TABLE_USERS)
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val userName: String,
    val passWord: String,
    val isOnline: Boolean = false,
    val image: String
): Parcelable{
    fun getImageBitMap(): Bitmap? {
        val imageBytes = Base64.decode(image, Base64.DEFAULT)
        return  BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
    }
}