package com.advanced.mockserver.data.database.repository;

import androidx.lifecycle.LiveData;
import com.advanced.mockserver.data.database.dao.ChatDao;
import com.advanced.mockserver.ChatMessage;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/28/2023.
 */
@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/advanced/mockserver/data/database/repository/ChatRepository;", "", "chatDao", "Lcom/advanced/mockserver/data/database/dao/ChatDao;", "(Lcom/advanced/mockserver/data/database/dao/ChatDao;)V", "getChatInConversation", "Landroidx/lifecycle/LiveData;", "", "Lcom/advanced/mockserver/ChatMessage;", "conversationId", "", "insertChat", "Lkotlinx/coroutines/flow/Flow;", "", "chatMessage", "app_debug"})
public final class ChatRepository {
    @org.jetbrains.annotations.NotNull
    private final com.advanced.mockserver.data.database.dao.ChatDao chatDao = null;
    
    @javax.inject.Inject
    public ChatRepository(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.dao.ChatDao chatDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> insertChat(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.ChatMessage chatMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.ChatMessage>> getChatInConversation(long conversationId) {
        return null;
    }
}