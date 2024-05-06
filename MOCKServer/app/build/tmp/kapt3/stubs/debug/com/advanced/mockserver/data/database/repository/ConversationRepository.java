package com.advanced.mockserver.data.database.repository;

import androidx.lifecycle.LiveData;
import com.advanced.mockserver.data.database.dao.ConversationDao;
import com.advanced.mockserver.Conversation;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import java.sql.Timestamp;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/28/2023.
 */
@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\rJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/advanced/mockserver/data/database/repository/ConversationRepository;", "", "conversationDao", "Lcom/advanced/mockserver/data/database/dao/ConversationDao;", "(Lcom/advanced/mockserver/data/database/dao/ConversationDao;)V", "deleteConversationById", "Lkotlinx/coroutines/flow/Flow;", "", "conversationId", "", "getAllConversation", "Landroidx/lifecycle/LiveData;", "", "Lcom/advanced/mockserver/Conversation;", "insertConversation", "conversation", "updateConversation", "lastMessage", "", "timestamp", "app_debug"})
public final class ConversationRepository {
    @org.jetbrains.annotations.NotNull
    private final com.advanced.mockserver.data.database.dao.ConversationDao conversationDao = null;
    
    @javax.inject.Inject
    public ConversationRepository(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.dao.ConversationDao conversationDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> insertConversation(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.Conversation conversation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.Conversation>> getAllConversation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> updateConversation(long conversationId, @org.jetbrains.annotations.NotNull
    java.lang.String lastMessage, @org.jetbrains.annotations.NotNull
    java.lang.String timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> deleteConversationById(long conversationId) {
        return null;
    }
}