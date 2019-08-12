package com.abhinav.abhinav_practice_mvvm_coroutines.databinding;
import com.abhinav.abhinav_practice_mvvm_coroutines.R;
import com.abhinav.abhinav_practice_mvvm_coroutines.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignupBindingImpl extends ActivitySignupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_view_logo, 7);
        sViewsWithIds.put(R.id.linearLayout1, 8);
        sViewsWithIds.put(R.id.linearLayout2, 9);
        sViewsWithIds.put(R.id.progress_bar, 10);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.EditText mboundView4;
    @NonNull
    private final android.widget.Button mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewmodelOnSignupButtonClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewmodelOnLoginAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.name
            //         is viewmodel.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.name
            java.lang.String viewmodelName = null;
            // viewmodel
            com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {




                viewmodel.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.email
            //         is viewmodel.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.email
            java.lang.String viewmodelEmail = null;
            // viewmodel
            com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {




                viewmodel.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.password
            //         is viewmodel.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel
            com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel viewmodel = mViewmodel;
            // viewmodel.password
            java.lang.String viewmodelPassword = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {




                viewmodel.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.passwordconfirm
            //         is viewmodel.setPasswordconfirm((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel.passwordconfirm
            java.lang.String viewmodelPasswordconfirm = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel
            com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {




                viewmodel.setPasswordconfirm(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivitySignupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivitySignupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.ProgressBar) bindings[10]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
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
        java.lang.String viewmodelPasswordconfirm = null;
        java.lang.String viewmodelEmail = null;
        android.view.View.OnClickListener viewmodelOnSignupButtonClickAndroidViewViewOnClickListener = null;
        java.lang.String viewmodelName = null;
        java.lang.String viewmodelPassword = null;
        android.view.View.OnClickListener viewmodelOnLoginAndroidViewViewOnClickListener = null;
        com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.passwordconfirm
                    viewmodelPasswordconfirm = viewmodel.getPasswordconfirm();
                    // read viewmodel.email
                    viewmodelEmail = viewmodel.getEmail();
                    // read viewmodel::onSignupButtonClick
                    viewmodelOnSignupButtonClickAndroidViewViewOnClickListener = (((mViewmodelOnSignupButtonClickAndroidViewViewOnClickListener == null) ? (mViewmodelOnSignupButtonClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewmodelOnSignupButtonClickAndroidViewViewOnClickListener).setValue(viewmodel));
                    // read viewmodel.name
                    viewmodelName = viewmodel.getName();
                    // read viewmodel.password
                    viewmodelPassword = viewmodel.getPassword();
                    // read viewmodel::onLogin
                    viewmodelOnLoginAndroidViewViewOnClickListener = (((mViewmodelOnLoginAndroidViewViewOnClickListener == null) ? (mViewmodelOnLoginAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewmodelOnLoginAndroidViewViewOnClickListener).setValue(viewmodel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewmodelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewmodelPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelPasswordconfirm);
            this.mboundView5.setOnClickListener(viewmodelOnSignupButtonClickAndroidViewViewOnClickListener);
            this.mboundView6.setOnClickListener(viewmodelOnLoginAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel value;
        public OnClickListenerImpl setValue(com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onSignupButtonClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel value;
        public OnClickListenerImpl1 setValue(com.abhinav.abhinav_practice_mvvm_coroutines.ui.auth.AuthViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onLogin(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}