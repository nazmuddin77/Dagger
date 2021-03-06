// Code generated by dagger-compiler.  Do not edit.
package com.antonioleiva.daggerexample.app;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<App>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code App} and its
 * dependencies.
 *
 * Being a {@code Provider<App>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<App>} and handling injection
 * of annotated fields.
 */
public final class App$$InjectAdapter extends Binding<App>
    implements Provider<App>, MembersInjector<App> {
  private Binding<com.antonioleiva.daggerexample.app.domain.AnalyticsManager> analyticsManager;

  public App$$InjectAdapter() {
    super("com.antonioleiva.daggerexample.app.App", "members/com.antonioleiva.daggerexample.app.App", NOT_SINGLETON, App.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    analyticsManager = (Binding<com.antonioleiva.daggerexample.app.domain.AnalyticsManager>) linker.requestBinding("com.antonioleiva.daggerexample.app.domain.AnalyticsManager", App.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(analyticsManager);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<App>}.
   */
  @Override
  public App get() {
    App result = new App();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<App>}.
   */
  @Override
  public void injectMembers(App object) {
    object.analyticsManager = analyticsManager.get();
  }

}
