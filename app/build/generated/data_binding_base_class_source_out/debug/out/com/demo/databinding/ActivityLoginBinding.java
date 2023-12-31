// Generated by data binding compiler. Do not edit!
package com.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.demo.R;
import com.demo.view.CSButtonMedium16BlueGradient;
import com.demo.view.CSButtonWhite;
import com.demo.view.CSEditextRegular;
import com.demo.view.CSTextViewMedium14Gray;
import com.demo.view.CSTextViewMedium30Black;
import com.demo.view.CSTextViewMediumGray;
import com.demo.view.CSTextViewRegular14Gray;
import com.demo.view.CSTextViewRegular16Gray;
import com.demo.view.CustomTextInputLayoutRegular;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView card;

  @NonNull
  public final ConstraintLayout constraintMain;

  @NonNull
  public final CSEditextRegular edtEmail;

  @NonNull
  public final CSEditextRegular edtPassword;

  @NonNull
  public final Guideline guidelineTop;

  @NonNull
  public final CSTextViewRegular14Gray txtCreateAct;

  @NonNull
  public final CSTextViewMediumGray txtForgotPass;

  @NonNull
  public final CSButtonWhite txtGoogle;

  @NonNull
  public final CSTextViewMedium30Black txtHey;

  @NonNull
  public final CustomTextInputLayoutRegular txtInpLayoutEmail;

  @NonNull
  public final CustomTextInputLayoutRegular txtInpLayoutPassword;

  @NonNull
  public final CSButtonMedium16BlueGradient txtLogin;

  @NonNull
  public final CSTextViewMedium14Gray txtOr;

  @NonNull
  public final CSTextViewRegular16Gray txtWelcome;

  protected ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView card, ConstraintLayout constraintMain, CSEditextRegular edtEmail,
      CSEditextRegular edtPassword, Guideline guidelineTop, CSTextViewRegular14Gray txtCreateAct,
      CSTextViewMediumGray txtForgotPass, CSButtonWhite txtGoogle, CSTextViewMedium30Black txtHey,
      CustomTextInputLayoutRegular txtInpLayoutEmail,
      CustomTextInputLayoutRegular txtInpLayoutPassword, CSButtonMedium16BlueGradient txtLogin,
      CSTextViewMedium14Gray txtOr, CSTextViewRegular16Gray txtWelcome) {
    super(_bindingComponent, _root, _localFieldCount);
    this.card = card;
    this.constraintMain = constraintMain;
    this.edtEmail = edtEmail;
    this.edtPassword = edtPassword;
    this.guidelineTop = guidelineTop;
    this.txtCreateAct = txtCreateAct;
    this.txtForgotPass = txtForgotPass;
    this.txtGoogle = txtGoogle;
    this.txtHey = txtHey;
    this.txtInpLayoutEmail = txtInpLayoutEmail;
    this.txtInpLayoutPassword = txtInpLayoutPassword;
    this.txtLogin = txtLogin;
    this.txtOr = txtOr;
    this.txtWelcome = txtWelcome;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
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
  public static ActivityLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginBinding)bind(component, view, R.layout.activity_login);
  }
}
