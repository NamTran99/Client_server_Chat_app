package com.advanced.mockserver.ui.chat.message;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.advanced.mockserver.ChatMessage;
import com.advanced.mockserver.databinding.ItemReceivedMessageBinding;
import com.advanced.mockserver.databinding.ItemSentMessageBinding;
import com.advanced.mockserver.utils.Constants;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/28/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0014\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/advanced/mockserver/ui/chat/message/MessageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "senderId", "", "receivedImage", "", "(JI)V", "chatMessages", "", "Lcom/advanced/mockserver/ChatMessage;", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newList", "ReceivedViewHolder", "SentViewHolder", "app_debug"})
public final class MessageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final long senderId = 0L;
    private final int receivedImage = 0;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.advanced.mockserver.ChatMessage> chatMessages;
    
    public MessageAdapter(long senderId, int receivedImage) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.advanced.mockserver.ChatMessage> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/advanced/mockserver/ui/chat/message/MessageAdapter$ReceivedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "receivedBinding", "Lcom/advanced/mockserver/databinding/ItemReceivedMessageBinding;", "(Lcom/advanced/mockserver/ui/chat/message/MessageAdapter;Lcom/advanced/mockserver/databinding/ItemReceivedMessageBinding;)V", "bind", "", "chatMessage", "Lcom/advanced/mockserver/ChatMessage;", "app_debug"})
    public final class ReceivedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.advanced.mockserver.databinding.ItemReceivedMessageBinding receivedBinding = null;
        
        public ReceivedViewHolder(@org.jetbrains.annotations.NotNull
        com.advanced.mockserver.databinding.ItemReceivedMessageBinding receivedBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.advanced.mockserver.ChatMessage chatMessage) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/advanced/mockserver/ui/chat/message/MessageAdapter$SentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "sentBinding", "Lcom/advanced/mockserver/databinding/ItemSentMessageBinding;", "(Lcom/advanced/mockserver/ui/chat/message/MessageAdapter;Lcom/advanced/mockserver/databinding/ItemSentMessageBinding;)V", "bind", "", "chatMessage", "Lcom/advanced/mockserver/ChatMessage;", "app_debug"})
    public final class SentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.advanced.mockserver.databinding.ItemSentMessageBinding sentBinding = null;
        
        public SentViewHolder(@org.jetbrains.annotations.NotNull
        com.advanced.mockserver.databinding.ItemSentMessageBinding sentBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.advanced.mockserver.ChatMessage chatMessage) {
        }
    }
}