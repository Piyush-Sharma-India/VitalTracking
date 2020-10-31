package com.android.example.myapplication.databinding;
import com.android.example.myapplication.R;
import com.android.example.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VitalListFragmentBindingImpl extends VitalListFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VitalListFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private VitalListFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.noDataTextView.setTag(null);
        this.progressBar.setTag(null);
        this.vitalList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.android.example.myapplication.vital.VitalListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.android.example.myapplication.vital.VitalListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelVitalList((androidx.lifecycle.LiveData<java.util.List<com.android.example.myapplication.data.Vital>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVitalList(androidx.lifecycle.LiveData<java.util.List<com.android.example.myapplication.data.Vital>> ViewModelVitalList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        int viewModelDataLoadingViewGONEViewVISIBLE = 0;
        boolean viewModelDataLoadingViewModelVitalListEmpty = false;
        int viewModelDataLoadingViewModelVitalListEmptyViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelDataLoading = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDataLoadingGetValue = false;
        androidx.lifecycle.LiveData<java.util.List<com.android.example.myapplication.data.Vital>> viewModelVitalList = null;
        int viewModelDataLoadingViewVISIBLEViewGONE = 0;
        boolean viewModelVitalListEmpty = false;
        java.util.List<com.android.example.myapplication.data.Vital> viewModelVitalListGetValue = null;
        com.android.example.myapplication.vital.VitalListViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelDataLoadingGetValue = null;
        boolean ViewModelDataLoading1 = false;

        if ((dirtyFlags & 0xfL) != 0) {



                if (viewModel != null) {
                    // read viewModel.dataLoading
                    viewModelDataLoading = viewModel.getDataLoading();
                    // read viewModel.vitalList
                    viewModelVitalList = viewModel.getVitalList();
                }
                updateLiveDataRegistration(0, viewModelDataLoading);
                updateLiveDataRegistration(1, viewModelVitalList);


                if (viewModelDataLoading != null) {
                    // read viewModel.dataLoading.getValue()
                    viewModelDataLoadingGetValue = viewModelDataLoading.getValue();
                }
                if (viewModelVitalList != null) {
                    // read viewModel.vitalList.getValue()
                    viewModelVitalListGetValue = viewModelVitalList.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDataLoadingGetValue);
            if((dirtyFlags & 0xdL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelDataLoadingGetValue) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x100L;
                }
            }
                if (viewModelVitalListGetValue != null) {
                    // read viewModel.vitalList.getValue().empty
                    viewModelVitalListEmpty = viewModelVitalListGetValue.isEmpty();
                }

            if ((dirtyFlags & 0xdL) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
                    viewModelDataLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelDataLoadingGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                    viewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue())
                ViewModelDataLoading1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelDataLoadingGetValue;


                // read (!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue())) & (viewModel.vitalList.getValue().empty)
                viewModelDataLoadingViewModelVitalListEmpty = (ViewModelDataLoading1) & (viewModelVitalListEmpty);
            if((dirtyFlags & 0xfL) != 0) {
                if(viewModelDataLoadingViewModelVitalListEmpty) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read (!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue())) & (viewModel.vitalList.getValue().empty) ? View.VISIBLE : View.GONE
                viewModelDataLoadingViewModelVitalListEmptyViewVISIBLEViewGONE = ((viewModelDataLoadingViewModelVitalListEmpty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            this.noDataTextView.setVisibility(viewModelDataLoadingViewModelVitalListEmptyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelDataLoadingViewVISIBLEViewGONE);
            this.vitalList.setVisibility(viewModelDataLoadingViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.android.example.myapplication.vital.VitalListBindingAdaptersKt.setItems(this.vitalList, viewModelVitalListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.dataLoading
        flag 1 (0x2L): viewModel.vitalList
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): (!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue())) & (viewModel.vitalList.getValue().empty) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): (!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue())) & (viewModel.vitalList.getValue().empty) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}