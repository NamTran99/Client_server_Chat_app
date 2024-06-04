package com.advanced.mockclient.databinding;
import com.advanced.mockclient.R;
import com.advanced.mockclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemConversationBindingImpl extends ItemConversationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_conversation, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemConversationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemConversationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textLassMessage.setTag(null);
        this.textNameUser.setTag(null);
        this.textTimestamp.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.conversation == variableId) {
            setConversation((com.advanced.mockserver.Conversation) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setConversation(@Nullable com.advanced.mockserver.Conversation Conversation) {
        this.mConversation = Conversation;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.conversation);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.advanced.mockserver.Conversation conversation = mConversation;
        java.lang.String conversationSenderName = null;
        java.lang.String conversationTimestamp = null;
        java.lang.String conversationLastMessage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (conversation != null) {
                    // read conversation.senderName
                    conversationSenderName = conversation.getSenderName();
                    // read conversation.timestamp
                    conversationTimestamp = conversation.getTimestamp();
                    // read conversation.lastMessage
                    conversationLastMessage = conversation.getLastMessage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textLassMessage, conversationLastMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNameUser, conversationSenderName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTimestamp, conversationTimestamp);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): conversation
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}