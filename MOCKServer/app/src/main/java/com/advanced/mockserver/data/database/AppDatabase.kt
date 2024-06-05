package com.advanced.mockserver.data.database

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.advanced.mockserver.ChatMessage
import com.advanced.mockserver.Conversation
import com.advanced.mockserver.R
import com.advanced.mockserver.User
import com.advanced.mockserver.data.database.dao.ChatDao
import com.advanced.mockserver.data.database.dao.ConversationDao
import com.advanced.mockserver.data.database.dao.UserDao
import com.advanced.mockserver.di.ChatApplication
import com.advanced.mockserver.utils.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.io.ByteArrayOutputStream
import java.security.AccessController.getContext
import javax.inject.Provider


@Database(
    entities = [User::class, Conversation::class, ChatMessage::class],
    version = Constants.DATABASE_VERSION
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun conversationDao(): ConversationDao
    abstract fun chatDao(): ChatDao


    companion object {
        @Synchronized
        fun getDatabase(context: Context, userDao: Provider<UserDao>): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext, // Use applicationContext
                AppDatabase::class.java,
                Constants.DATABASE_NAME
            ).addCallback(object : RoomDatabase.Callback(){
                private val applicationScope = CoroutineScope(SupervisorJob())

                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    applicationScope.launch(Dispatchers.IO) {
                        populateDatabase()
                    }
                }

                private suspend fun populateDatabase() {
                    populateUsers()
                }

                private suspend fun populateUsers() {
                    val users = listOf(
                        User(id = 1, name = "Ngọc Lan", image = convertToBitMap(R.drawable.image_ngoc_lan), userName = "ngoclan", passWord = "Hoanghon99"),
                        User(id = 2, name = "Nam Trần", image = convertToBitMap(R.drawable.image_nam_tran),userName = "ngoclan1", passWord = "Hoanghon99"),
                        User(id = 3, name = "Mai Trang", image = convertToBitMap(R.drawable.image_mai_trang), userName = "ngoclan2", passWord = "Hoanghon99"),
                        User(id = 4, name = "Minh Quân", image = convertToBitMap(R.drawable.image_minh_quan), userName = "ngoclan3", passWord = "Hoanghon99"),
                    )
                    for(user in users){
                        userDao.get().insertUser(user)
                    }
                }
            }).build()
        }
    }
}
 fun convertToBitMap(resource: Int): String {
     val bm =  BitmapFactory.decodeResource(ChatApplication.instance.resources,resource)
     val baos = ByteArrayOutputStream()
     bm.compress(Bitmap.CompressFormat.JPEG, 100, baos)
     val b = baos.toByteArray()
     return Base64.encodeToString(b, Base64.DEFAULT)
}
