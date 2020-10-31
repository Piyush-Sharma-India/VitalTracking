// Generated by data binding compiler. Do not edit!
package com.android.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.android.example.myapplication.R;
import com.android.example.myapplication.data.Vital;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class VitalDetailItemBinding extends ViewDataBinding {
  @Bindable
  protected Vital mAlbum;

  protected VitalDetailItemBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setAlbum(@Nullable Vital album);

  @Nullable
  public Vital getAlbum() {
    return mAlbum;
  }

  @NonNull
  public static VitalDetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.vital_detail_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VitalDetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VitalDetailItemBinding>inflateInternal(inflater, R.layout.vital_detail_item, root, attachToRoot, component);
  }

  @NonNull
  public static VitalDetailItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.vital_detail_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VitalDetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VitalDetailItemBinding>inflateInternal(inflater, R.layout.vital_detail_item, null, false, component);
  }

  public static VitalDetailItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static VitalDetailItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (VitalDetailItemBinding)bind(component, view, R.layout.vital_detail_item);
  }
}
