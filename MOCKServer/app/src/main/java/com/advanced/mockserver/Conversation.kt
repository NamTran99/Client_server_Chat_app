package com.advanced.mockserver

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.advanced.mockserver.utils.Constants
import kotlinx.parcelize.Parcelize

  
@Parcelize
@Entity(tableName = Constants.TABLE_CONVERSATIONS)
data class Conversation(
    @PrimaryKey(autoGenerate = true)
    val conversationId: Long = 0,
    val senderId: Long,
    @DrawableRes val senderImage: Int,
    val senderName: String,
    val receiverId: Long,
    val receiverImage: String,
    val receiverName: String,
    val lastMessage: String,
    val timestamp: String
): Parcelable