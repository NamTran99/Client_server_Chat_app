package com.advanced.mockclient.databinding;
import com.advanced.mockclient.R;
import com.advanced.mockclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.advanced.mockclient.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraint_heading, 3);
        sViewsWithIds.put(R.id.frame_image, 4);
        sViewsWithIds.put(R.id.image_contact, 5);
        sViewsWithIds.put(R.id.text_name_user, 6);
        sViewsWithIds.put(R.id.text_title, 7);
        sViewsWithIds.put(R.id.frame_search, 8);
        sViewsWithIds.put(R.id.image_search, 9);
        sViewsWithIds.put(R.id.linear_selected, 10);
        sViewsWithIds.put(R.id.text_title_home, 11);
        sViewsWithIds.put(R.id.recycle_view_users, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.FrameLayout) bindings[8]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[5]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textConversations.setTag(null);
        this.textFriends.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.advanced.mockclient.generated.callback.OnClickListener(this, 2);
        mCallback4 = new com.advanced.mockclient.generated.callback.OnClickListener(this, 1);
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
        if (BR.homeFragment == variableId) {
            setHomeFragment((com.advanced.mockserver.ui.home.HomeFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.advanced.mockserver.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeFragment(@Nullable com.advanced.mockserver.ui.home.HomeFragment HomeFragment) {
        this.mHomeFragment = HomeFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.homeFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.advanced.mockserver.ui.home.HomeViewModel ViewModel) {
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
        com.advanced.mockserver.ui.home.HomeFragment homeFragment = mHomeFragment;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.textConversations.setOnClickListener(mCallback4);
            this.textFriends.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // homeFragment != null
                boolean homeFragmentJavaLangObjectNull = false;
                // homeFragment
                com.advanced.mockserver.ui.home.HomeFragment homeFragment = mHomeFragment;



                homeFragmentJavaLangObjectNull = (homeFragment) != (null);
                if (homeFragmentJavaLangObjectNull) {


                    homeFragment.onFriendClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // homeFragment != null
                boolean homeFragmentJavaLangObjectNull = false;
                // homeFragment
                com.advanced.mockserver.ui.home.HomeFragment homeFragment = mHomeFragment;



                homeFragmentJavaLangObjectNull = (homeFragment) != (null);
                if (homeFragmentJavaLangObjectNull) {


                    homeFragment.onRecentConversationClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeFragment
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}