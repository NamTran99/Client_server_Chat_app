package com.advanced.mockserver.ui.chat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.advanced.mockserver.data.database.repository.ChatRepository;
import com.advanced.mockserver.data.database.repository.ConversationRepository;
import com.advanced.mockserver.data.database.repository.UserRepository;
import com.advanced.mockserver.ChatMessage;
import com.advanced.mockserver.User;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/28/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0011\u001a\u00020\u000eJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\fJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/advanced/mockserver/ui/chat/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "chatRepository", "Lcom/advanced/mockserver/data/database/repository/ChatRepository;", "userRepository", "Lcom/advanced/mockserver/data/database/repository/UserRepository;", "conversationRepository", "Lcom/advanced/mockserver/data/database/repository/ConversationRepository;", "(Lcom/advanced/mockserver/data/database/repository/ChatRepository;Lcom/advanced/mockserver/data/database/repository/UserRepository;Lcom/advanced/mockserver/data/database/repository/ConversationRepository;)V", "getChatInConversation", "Landroidx/lifecycle/LiveData;", "", "Lcom/advanced/mockserver/ChatMessage;", "conversationId", "", "getUserById", "Lcom/advanced/mockserver/User;", "userId", "insertChatMessage", "Lkotlinx/coroutines/flow/Flow;", "", "chatMessage", "removeConversation", "updateConversation", "message", "", "timestamp", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ChatViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.advanced.mockserver.data.database.repository.ChatRepository chatRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.advanced.mockserver.data.database.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.advanced.mockserver.data.database.repository.ConversationRepository conversationRepository = null;
    
    @javax.inject.Inject
    public ChatViewModel(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.repository.ChatRepository chatRepository, @org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    com.advanced.mockserver.data.database.repository.ConversationRepository conversationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.advanced.mockserver.User> getUserById(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> updateConversation(long conversationId, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> removeConversation(long conversationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> insertChatMessage(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.ChatMessage chatMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.advanced.mockserver.ChatMessage>> getChatInConversation(long conversationId) {
        return null;
    }
}