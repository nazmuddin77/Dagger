// Code generated by dagger-compiler.  Do not edit.
package com.antonioleiva.daggerexample.app.ui.main;

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
public final class MainModule$$ModuleAdapter extends ModuleAdapter<MainModule> {
  private static final String[] INJECTS = { "members/com.antonioleiva.daggerexample.app.ui.main.MainActivity", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public MainModule$$ModuleAdapter() {
    super(com.antonioleiva.daggerexample.app.ui.main.MainModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, MainModule module) {
    bindings.contributeProvidesBinding("com.antonioleiva.daggerexample.app.ui.main.MainView", new ProvideViewProvidesAdapter(module));
    bindings.contributeProvidesBinding("com.antonioleiva.daggerexample.app.ui.main.MainPresenter", new ProvidePresenterProvidesAdapter(module));
  }

  /**
   * A {@code Binding<com.antonioleiva.daggerexample.app.ui.main.MainView>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.antonioleiva.daggerexample.app.ui.main.MainView>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideViewProvidesAdapter extends ProvidesBinding<MainView>
      implements Provider<MainView> {
    private final MainModule module;

    public ProvideViewProvidesAdapter(MainModule module) {
      super("com.antonioleiva.daggerexample.app.ui.main.MainView", IS_SINGLETON, "com.antonioleiva.daggerexample.app.ui.main.MainModule", "provideView");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.antonioleiva.daggerexample.app.ui.main.MainView>}.
     */
    @Override
    public MainView get() {
      return module.provideView();
    }
  }

  /**
   * A {@code Binding<com.antonioleiva.daggerexample.app.ui.main.MainPresenter>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code com.antonioleiva.daggerexample.app.ui.main.MainPresenter} and its
   * dependencies.
   *
   * Being a {@code Provider<com.antonioleiva.daggerexample.app.ui.main.MainPresenter>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidePresenterProvidesAdapter extends ProvidesBinding<MainPresenter>
      implements Provider<MainPresenter> {
    private final MainModule module;
    private Binding<MainView> mainView;
    private Binding<com.antonioleiva.daggerexample.app.interactors.FindItemsInteractor> findItemsInteractor;

    public ProvidePresenterProvidesAdapter(MainModule module) {
      super("com.antonioleiva.daggerexample.app.ui.main.MainPresenter", IS_SINGLETON, "com.antonioleiva.daggerexample.app.ui.main.MainModule", "providePresenter");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      mainView = (Binding<MainView>) linker.requestBinding("com.antonioleiva.daggerexample.app.ui.main.MainView", MainModule.class, getClass().getClassLoader());
      findItemsInteractor = (Binding<com.antonioleiva.daggerexample.app.interactors.FindItemsInteractor>) linker.requestBinding("com.antonioleiva.daggerexample.app.interactors.FindItemsInteractor", MainModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(mainView);
      getBindings.add(findItemsInteractor);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.antonioleiva.daggerexample.app.ui.main.MainPresenter>}.
     */
    @Override
    public MainPresenter get() {
      return module.providePresenter(mainView.get(), findItemsInteractor.get());
    }
  }
}
