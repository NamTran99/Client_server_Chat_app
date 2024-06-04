package com.advanced.mockclient.databinding;
import com.advanced.mockclient.R;
import com.advanced.mockclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentChatBindingImpl extends FragmentChatBinding implements com.advanced.mockclient.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_background, 4);
        sViewsWithIds.put(R.id.view_header, 5);
        sViewsWithIds.put(R.id.view_support_header, 6);
        sViewsWithIds.put(R.id.frame_back, 7);
        sViewsWithIds.put(R.id.frame_info, 8);
        sViewsWithIds.put(R.id.frame_image, 9);
        sViewsWithIds.put(R.id.image_contact, 10);
        sViewsWithIds.put(R.id.text_name_user, 11);
        sViewsWithIds.put(R.id.text_availability, 12);
        sViewsWithIds.put(R.id.recycler_view_chat, 13);
        sViewsWithIds.put(R.id.frame_send, 14);
        sViewsWithIds.put(R.id.input_message, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.ImageView) bindings[1]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.EditText) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[6]
            );
        this.imageBack.setTag(null);
        this.imageInfo.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatImageView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.advanced.mockclient.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.advanced.mockclient.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.advanced.mockclient.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.chatFragment == variableId) {
            setChatFragment((com.advanced.mockserver.ui.chat.ChatFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.advanced.mockserver.ui.chat.ChatViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChatFragment(@Nullable com.advanced.mockserver.ui.chat.ChatFragment ChatFragment) {
        this.mChatFragment = ChatFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.chatFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.advanced.mockserver.ui.chat.ChatViewModel ViewModel) {
        this.mViewModel = ViewModel;
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
        com.advanced.mockserver.ui.chat.ChatFragment chatFragment = mChatFragment;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.imageBack.setOnClickListener(mCallback1);
            this.imageInfo.setOnClickListener(mCallback2);
            this.mboundView3.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // chatFragment != null
                boolean chatFragmentJavaLangObjectNull = false;
                // chatFragment
                com.advanced.mockserver.ui.chat.ChatFragment chatFragment = mChatFragment;



                chatFragmentJavaLangObjectNull = (chatFragment) != (null);
                if (chatFragmentJavaLangObjectNull) {


                    chatFragment.sendMessage();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // chatFragment != null
                boolean chatFragmentJavaLangObjectNull = false;
                // chatFragment
                com.advanced.mockserver.ui.chat.ChatFragment chatFragment = mChatFragment;



                chatFragmentJavaLangObjectNull = (chatFragment) != (null);
                if (chatFragmentJavaLangObjectNull) {


                    chatFragment.backToHome();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // chatFragment != null
                boolean chatFragmentJavaLangObjectNull = false;
                // chatFragment
                com.advanced.mockserver.ui.chat.ChatFragment chatFragment = mChatFragment;



                chatFragmentJavaLangObjectNull = (chatFragment) != (null);
                if (chatFragmentJavaLangObjectNull) {


                    chatFragment.removeConversation();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): chatFragment
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}