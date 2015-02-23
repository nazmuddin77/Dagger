// Code generated by dagger-compiler.  Do not edit.
package com.antonioleiva.daggerexample.app.ui.login;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<LoginActivity>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code LoginActivity} and its
 * dependencies.
 *
 * Being a {@code Provider<LoginActivity>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<LoginActivity>} and handling injection
 * of annotated fields.
 */
public final class LoginActivity$$InjectAdapter extends Binding<LoginActivity>
    implements Provider<LoginActivity>, MembersInjector<LoginActivity> {
  private Binding<LoginPresenter> presenter;
  private Binding<com.antonioleiva.daggerexample.app.ui.common.BaseActivity> supertype;

  public LoginActivity$$InjectAdapter() {
    super("com.antonioleiva.daggerexample.app.ui.login.LoginActivity", "members/com.antonioleiva.daggerexample.app.ui.login.LoginActivity", NOT_SINGLETON, LoginActivity.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    presenter = (Binding<LoginPresenter>) linker.requestBinding("com.antonioleiva.daggerexample.app.ui.login.LoginPresenter", LoginActivity.class, getClass().getClassLoader());
    supertype = (Binding<com.antonioleiva.daggerexample.app.ui.common.BaseActivity>) linker.requestBinding("members/com.antonioleiva.daggerexample.app.ui.common.BaseActivity", LoginActivity.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(presenter);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<LoginActivity>}.
   */
  @Override
  public LoginActivity get() {
    LoginActivity result = new LoginActivity();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<LoginActivity>}.
   */
  @Override
  public void injectMembers(LoginActivity object) {
    object.presenter = presenter.get();
    supertype.injectMembers(object);
  }

}