package com.android.example.myapplication;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.android.example.myapplication.databinding.VitalDetailItemBindingImpl;
import com.android.example.myapplication.databinding.VitalItemBindingImpl;
import com.android.example.myapplication.databinding.VitalListFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_VITALDETAILITEM = 1;

  private static final int LAYOUT_VITALITEM = 2;

  private static final int LAYOUT_VITALLISTFRAGMENT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.example.myapplication.R.layout.vital_detail_item, LAYOUT_VITALDETAILITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.example.myapplication.R.layout.vital_item, LAYOUT_VITALITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.example.myapplication.R.layout.vital_list_fragment, LAYOUT_VITALLISTFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_VITALDETAILITEM: {
          if ("layout/vital_detail_item_0".equals(tag)) {
            return new VitalDetailItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for vital_detail_item is invalid. Received: " + tag);
        }
        case  LAYOUT_VITALITEM: {
          if ("layout/vital_item_0".equals(tag)) {
            return new VitalItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for vital_item is invalid. Received: " + tag);
        }
        case  LAYOUT_VITALLISTFRAGMENT: {
          if ("layout/vital_list_fragment_0".equals(tag)) {
            return new VitalListFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for vital_list_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "album");
      sKeys.put(2, "viewModel");
      sKeys.put(3, "vital");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/vital_detail_item_0", com.android.example.myapplication.R.layout.vital_detail_item);
      sKeys.put("layout/vital_item_0", com.android.example.myapplication.R.layout.vital_item);
      sKeys.put("layout/vital_list_fragment_0", com.android.example.myapplication.R.layout.vital_list_fragment);
    }
  }
}
