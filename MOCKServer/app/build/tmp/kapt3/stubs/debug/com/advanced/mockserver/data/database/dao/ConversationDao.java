package com.advanced.mockserver.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import com.advanced.mockserver.Conversation;
import com.advanced.mockserver.utils.Constants;
import java.sql.Timestamp;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/28/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\'J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/advanced/mockserver/data/database/dao/ConversationDao;", "", "deleteConversationById", "", "conversationId", "", "getAllConversations", "Landroidx/lifecycle/LiveData;", "", "Lcom/advanced/mockserver/Conversation;", "getConversationById", "getRemoteAllConversations", "insert", "conversation", "updateConversation", "lastMessage", "", "timestamp", "app_debug"})
@androidx.room.Dao
public abstract interface ConversationDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.Conversation conversation);
    
    @androidx.room.Query(value = "SELECT * FROM conversations")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.Conversation>> getAllConversations();
    
    @androidx.room.Query(value = "SELECT * FROM conversations")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.advanced.mockserver.Conversation> getRemoteAllConversations();
    
    @androidx.room.Query(value = "SELECT * FROM conversations WHERE conversationId = :conversationId")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.advanced.mockserver.Conversation> getConversationById(long conversationId);
    
    @androidx.room.Query(value = "UPDATE conversations SET lastMessage = :lastMessage, timestamp =:timestamp WHERE conversationId = :conversationId")
    public abstract void updateConversation(long conversationId, @org.jetbrains.annotations.NotNull
    java.lang.String lastMessage, @org.jetbrains.annotations.NotNull
    java.lang.String timestamp);
    
    @androidx.room.Query(value = "DELETE FROM conversations WHERE conversationId = :conversationId")
    public abstract void deleteConversationById(long conversationId);
}