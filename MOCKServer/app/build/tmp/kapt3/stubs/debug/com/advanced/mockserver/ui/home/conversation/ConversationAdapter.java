package com.advanced.mockserver.ui.home.conversation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.advanced.mockserver.R;
import com.advanced.mockserver.Conversation;
import com.advanced.mockserver.databinding.ItemConversationBinding;
import com.advanced.mockserver.ui.home.HomeFragment;
import com.advanced.mockserver.utils.Constants;

/**
 * *
 * Created by HoangRyan aka LilDua on 10/29/2023.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/advanced/mockserver/ui/home/conversation/ConversationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/advanced/mockserver/ui/home/conversation/ConversationAdapter$ViewHolder;", "homeFragment", "Lcom/advanced/mockserver/ui/home/HomeFragment;", "navController", "Landroidx/navigation/NavController;", "(Lcom/advanced/mockserver/ui/home/HomeFragment;Landroidx/navigation/NavController;)V", "conversations", "", "Lcom/advanced/mockserver/Conversation;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newList", "ViewHolder", "app_debug"})
public final class ConversationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.advanced.mockserver.ui.home.conversation.ConversationAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.advanced.mockserver.ui.home.HomeFragment homeFragment = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavController navController = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.advanced.mockserver.Conversation> conversations;
    
    public ConversationAdapter(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.ui.home.HomeFragment homeFragment, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.advanced.mockserver.ui.home.conversation.ConversationAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.advanced.mockserver.ui.home.conversation.ConversationAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.advanced.mockserver.Conversation> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/advanced/mockserver/ui/home/conversation/ConversationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/advanced/mockserver/databinding/ItemConversationBinding;", "(Lcom/advanced/mockserver/ui/home/conversation/ConversationAdapter;Lcom/advanced/mockserver/databinding/ItemConversationBinding;)V", "bind", "", "conversation", "Lcom/advanced/mockserver/Conversation;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.advanced.mockserver.databinding.ItemConversationBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.advanced.mockserver.databinding.ItemConversationBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.advanced.mockserver.Conversation conversation) {
        }
    }
}