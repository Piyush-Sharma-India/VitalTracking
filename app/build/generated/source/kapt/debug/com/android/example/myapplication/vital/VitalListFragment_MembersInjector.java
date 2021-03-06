// Generated by Dagger (https://dagger.dev).
package com.android.example.myapplication.vital;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VitalListFragment_MembersInjector implements MembersInjector<VitalListFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public VitalListFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<VitalListFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new VitalListFragment_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(VitalListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.android.example.myapplication.vital.VitalListFragment.viewModelFactory")
  public static void injectViewModelFactory(VitalListFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
