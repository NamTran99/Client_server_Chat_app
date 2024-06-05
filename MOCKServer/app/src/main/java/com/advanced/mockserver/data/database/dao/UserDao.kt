package com.advanced.mockserver.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.advanced.mockserver.User
import com.advanced.mockserver.utils.Constants

 
@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    @Query("DELETE FROM ${Constants.TABLE_USERS} WHERE ${Constants.COLUMN_ID} = :userId")
    fun deleteUserById(userId: Long)

    @Query("SELECT * FROM ${Constants.TABLE_USERS}")
    fun getAllUsers(): LiveData<List<User>>

    @Query("SELECT * FROM ${Constants.TABLE_USERS}")
    fun getRemoteAllUsers(): List<User>

    @Query("SELECT * FROM ${Constants.TABLE_USERS} WHERE ${Constants.COLUMN_ID} = :userId")
    fun getUserById(userId: Long): LiveData<User>

    @Query("UPDATE ${Constants.TABLE_USERS} SET ${Constants.STATUS_ID} = :isOnline  WHERE ${Constants.COLUMN_USER_NAME} = :userName AND ${Constants.COLUMN_PASSWORD} = :passWord")
    fun loginUser(userName: String, passWord: String,  isOnline: Boolean =  true): Int
}