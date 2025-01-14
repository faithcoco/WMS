// Generated by data binding compiler. Do not edit!
package com.lkrh.storescontrol.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.lkrh.storescontrol.R;
import com.lkrh.storescontrol.view.declaration.UnqualifiedListActivity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySupplementListBinding extends ViewDataBinding {
  @NonNull
  public final View lTitle;

  @NonNull
  public final RecyclerView rvList;

  @Bindable
  protected UnqualifiedListActivity.FunctionAdapter mAdapter;

  protected ActivitySupplementListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, View lTitle, RecyclerView rvList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.lTitle = lTitle;
    this.rvList = rvList;
  }

  public abstract void setAdapter(@Nullable UnqualifiedListActivity.FunctionAdapter adapter);

  @Nullable
  public UnqualifiedListActivity.FunctionAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static ActivitySupplementListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_supplement_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySupplementListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySupplementListBinding>inflateInternal(inflater, R.layout.activity_supplement_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySupplementListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_supplement_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySupplementListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySupplementListBinding>inflateInternal(inflater, R.layout.activity_supplement_list, null, false, component);
  }

  public static ActivitySupplementListBinding bind(@NonNull View view) {
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
  public static ActivitySupplementListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySupplementListBinding)bind(component, view, R.layout.activity_supplement_list);
  }
}
