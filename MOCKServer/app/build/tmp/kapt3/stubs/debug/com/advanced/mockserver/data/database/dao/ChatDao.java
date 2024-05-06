package com.advanced.mockserver.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import com.advanced.mockserver.ChatMessage;
import com.advanced.mockserver.utils.Constants;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/28/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/advanced/mockserver/data/database/dao/ChatDao;", "", "getAllChats", "Landroidx/lifecycle/LiveData;", "", "Lcom/advanced/mockserver/ChatMessage;", "getChatInConversation", "conversationId", "", "getRemoteAllChats", "insert", "", "chatMessage", "app_debug"})
@androidx.room.Dao
public abstract interface ChatDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.ChatMessage chatMessage);
    
    @androidx.room.Query(value = "SELECT * FROM chats")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.ChatMessage>> getAllChats();
    
    @androidx.room.Query(value = "SELECT * FROM chats")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.advanced.mockserver.ChatMessage> getRemoteAllChats();
    
    @androidx.room.Query(value = "SELECT * FROM chats WHERE conversationId = :conversationId")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.ChatMessage>> getChatInConversation(long conversationId);
}