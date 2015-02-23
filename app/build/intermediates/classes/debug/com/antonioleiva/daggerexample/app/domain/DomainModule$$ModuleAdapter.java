// Code generated by dagger-compiler.  Do not edit.
package com.antonioleiva.daggerexample.app.domain;

import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class DomainModule$$ModuleAdapter extends ModuleAdapter<DomainModule> {
  private static final String[] INJECTS = { };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public DomainModule$$ModuleAdapter() {
    super(com.antonioleiva.daggerexample.app.domain.DomainModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, false /*complete*/, true /*library*/);
  }

  @Override
  public DomainModule newModule() {
    return new com.antonioleiva.daggerexample.app.domain.DomainModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, DomainModule module) {
    bindings.contributeProvidesBinding("com.antonioleiva.daggerexample.app.domain.AnalyticsManager", new ProvideAnalyticsManagerProvidesAdapter(module));
  }

  /**
   * A {@code Binding<com.antonioleiva.daggerexample.app.domain.AnalyticsManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code com.antonioleiva.daggerexample.app.domain.AnalyticsManager} and its
   * dependencies.
   *
   * Being a {@code Provider<com.antonioleiva.daggerexample.app.domain.AnalyticsManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideAnalyticsManagerProvidesAdapter extends ProvidesBinding<AnalyticsManager>
      implements Provider<AnalyticsManager> {
    private final DomainModule module;
    private Binding<android.app.Application> app;

    public ProvideAnalyticsManagerProvidesAdapter(DomainModule module) {
      super("com.antonioleiva.daggerexample.app.domain.AnalyticsManager", IS_SINGLETON, "com.antonioleiva.daggerexample.app.domain.DomainModule", "provideAnalyticsManager");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      app = (Binding<android.app.Application>) linker.requestBinding("android.app.Application", DomainModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(app);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.antonioleiva.daggerexample.app.domain.AnalyticsManager>}.
     */
    @Override
    public AnalyticsManager get() {
      return module.provideAnalyticsManager(app.get());
    }
  }
}
