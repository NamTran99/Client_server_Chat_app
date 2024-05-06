package com.advanced.mockserver.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import com.advanced.mockserver.User;
import com.advanced.mockserver.utils.Constants;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/27/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/advanced/mockserver/data/database/dao/UserDao;", "", "deleteUserById", "", "userId", "", "getAllUsers", "Landroidx/lifecycle/LiveData;", "", "Lcom/advanced/mockserver/User;", "getRemoteAllUsers", "getUserById", "insertUser", "user", "app_debug"})
@androidx.room.Dao
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUser(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.User user);
    
    @androidx.room.Query(value = "DELETE FROM users WHERE id = :userId")
    public abstract void deleteUserById(long userId);
    
    @androidx.room.Query(value = "SELECT * FROM users")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.User>> getAllUsers();
    
    @androidx.room.Query(value = "SELECT * FROM users")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.advanced.mockserver.User> getRemoteAllUsers();
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE id = :userId")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.advanced.mockserver.User> getUserById(long userId);
}