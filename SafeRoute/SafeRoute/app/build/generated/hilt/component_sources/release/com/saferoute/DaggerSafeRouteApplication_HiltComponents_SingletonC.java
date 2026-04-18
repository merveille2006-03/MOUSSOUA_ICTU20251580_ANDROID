package com.saferoute;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.saferoute.data.local.dao.EmergencyContactDao;
import com.saferoute.data.local.dao.FallEventDao;
import com.saferoute.data.local.dao.SOSAlertDao;
import com.saferoute.data.local.dao.SafeZoneDao;
import com.saferoute.data.local.database.SafeRouteDatabase;
import com.saferoute.data.repository.AlertRepositoryImpl;
import com.saferoute.data.repository.EmergencyContactRepositoryImpl;
import com.saferoute.data.repository.FallDetectionRepositoryImpl;
import com.saferoute.data.repository.LocationRepositoryImpl;
import com.saferoute.data.repository.SafeZoneRepositoryImpl;
import com.saferoute.data.repository.SettingsRepositoryImpl;
import com.saferoute.di.DatabaseModule;
import com.saferoute.di.DatabaseModule_ProvideDatabaseFactory;
import com.saferoute.di.DatabaseModule_ProvideEmergencyContactDaoFactory;
import com.saferoute.di.DatabaseModule_ProvideFallEventDaoFactory;
import com.saferoute.di.DatabaseModule_ProvideSOSAlertDaoFactory;
import com.saferoute.di.DatabaseModule_ProvideSafeZoneDaoFactory;
import com.saferoute.di.LocationModule;
import com.saferoute.di.LocationModule_ProvideFusedLocationClientFactory;
import com.saferoute.presentation.MainActivity;
import com.saferoute.presentation.viewmodels.AlertHistoryViewModel;
import com.saferoute.presentation.viewmodels.AlertHistoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.saferoute.presentation.viewmodels.AuthViewModel;
import com.saferoute.presentation.viewmodels.AuthViewModel_HiltModules_KeyModule_ProvideFactory;
import com.saferoute.presentation.viewmodels.ContactsViewModel;
import com.saferoute.presentation.viewmodels.ContactsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.saferoute.presentation.viewmodels.FallHistoryViewModel;
import com.saferoute.presentation.viewmodels.FallHistoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.saferoute.presentation.viewmodels.MainViewModel;
import com.saferoute.presentation.viewmodels.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.saferoute.presentation.viewmodels.SafeZonesViewModel;
import com.saferoute.presentation.viewmodels.SafeZonesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.saferoute.presentation.viewmodels.SettingsViewModel;
import com.saferoute.presentation.viewmodels.SettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.saferoute.service.BluetoothService;
import com.saferoute.service.BootReceiver;
import com.saferoute.service.BootReceiver_MembersInjector;
import com.saferoute.service.FallDetectionService;
import com.saferoute.service.FallDetectionService_MembersInjector;
import com.saferoute.service.LocationTrackingService;
import com.saferoute.service.LocationTrackingService_MembersInjector;
import com.saferoute.service.SOSAlertService;
import com.saferoute.service.SOSAlertService_MembersInjector;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerSafeRouteApplication_HiltComponents_SingletonC {
  private DaggerSafeRouteApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder locationModule(LocationModule locationModule) {
      Preconditions.checkNotNull(locationModule);
      return this;
    }

    public SafeRouteApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements SafeRouteApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public SafeRouteApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements SafeRouteApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public SafeRouteApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements SafeRouteApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public SafeRouteApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements SafeRouteApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public SafeRouteApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements SafeRouteApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public SafeRouteApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements SafeRouteApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public SafeRouteApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements SafeRouteApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public SafeRouteApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends SafeRouteApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends SafeRouteApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends SafeRouteApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends SafeRouteApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(7).add(AlertHistoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(AuthViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ContactsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(FallHistoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SafeZonesViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends SafeRouteApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AlertHistoryViewModel> alertHistoryViewModelProvider;

    private Provider<AuthViewModel> authViewModelProvider;

    private Provider<ContactsViewModel> contactsViewModelProvider;

    private Provider<FallHistoryViewModel> fallHistoryViewModelProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private Provider<SafeZonesViewModel> safeZonesViewModelProvider;

    private Provider<SettingsViewModel> settingsViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.alertHistoryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.authViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.contactsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.fallHistoryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.mainViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.safeZonesViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.settingsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(7).put("com.saferoute.presentation.viewmodels.AlertHistoryViewModel", ((Provider) alertHistoryViewModelProvider)).put("com.saferoute.presentation.viewmodels.AuthViewModel", ((Provider) authViewModelProvider)).put("com.saferoute.presentation.viewmodels.ContactsViewModel", ((Provider) contactsViewModelProvider)).put("com.saferoute.presentation.viewmodels.FallHistoryViewModel", ((Provider) fallHistoryViewModelProvider)).put("com.saferoute.presentation.viewmodels.MainViewModel", ((Provider) mainViewModelProvider)).put("com.saferoute.presentation.viewmodels.SafeZonesViewModel", ((Provider) safeZonesViewModelProvider)).put("com.saferoute.presentation.viewmodels.SettingsViewModel", ((Provider) settingsViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.saferoute.presentation.viewmodels.AlertHistoryViewModel 
          return (T) new AlertHistoryViewModel(singletonCImpl.alertRepositoryImplProvider.get());

          case 1: // com.saferoute.presentation.viewmodels.AuthViewModel 
          return (T) new AuthViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule));

          case 2: // com.saferoute.presentation.viewmodels.ContactsViewModel 
          return (T) new ContactsViewModel(singletonCImpl.emergencyContactRepositoryImplProvider.get());

          case 3: // com.saferoute.presentation.viewmodels.FallHistoryViewModel 
          return (T) new FallHistoryViewModel(singletonCImpl.fallDetectionRepositoryImplProvider.get());

          case 4: // com.saferoute.presentation.viewmodels.MainViewModel 
          return (T) new MainViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule), singletonCImpl.settingsRepositoryImplProvider.get(), singletonCImpl.locationRepositoryImplProvider.get(), singletonCImpl.fallDetectionRepositoryImplProvider.get(), singletonCImpl.safeZoneRepositoryImplProvider.get(), singletonCImpl.alertRepositoryImplProvider.get(), singletonCImpl.emergencyContactRepositoryImplProvider.get());

          case 5: // com.saferoute.presentation.viewmodels.SafeZonesViewModel 
          return (T) new SafeZonesViewModel(singletonCImpl.safeZoneRepositoryImplProvider.get(), singletonCImpl.locationRepositoryImplProvider.get());

          case 6: // com.saferoute.presentation.viewmodels.SettingsViewModel 
          return (T) new SettingsViewModel(singletonCImpl.settingsRepositoryImplProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends SafeRouteApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends SafeRouteApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }

    @Override
    public void injectBluetoothService(BluetoothService bluetoothService) {
    }

    @Override
    public void injectFallDetectionService(FallDetectionService fallDetectionService) {
      injectFallDetectionService2(fallDetectionService);
    }

    @Override
    public void injectLocationTrackingService(LocationTrackingService locationTrackingService) {
      injectLocationTrackingService2(locationTrackingService);
    }

    @Override
    public void injectSOSAlertService(SOSAlertService sOSAlertService) {
      injectSOSAlertService2(sOSAlertService);
    }

    private FallDetectionService injectFallDetectionService2(FallDetectionService instance) {
      FallDetectionService_MembersInjector.injectFallDetectionRepository(instance, singletonCImpl.fallDetectionRepositoryImplProvider.get());
      FallDetectionService_MembersInjector.injectLocationRepository(instance, singletonCImpl.locationRepositoryImplProvider.get());
      FallDetectionService_MembersInjector.injectAlertRepository(instance, singletonCImpl.alertRepositoryImplProvider.get());
      return instance;
    }

    private LocationTrackingService injectLocationTrackingService2(
        LocationTrackingService instance) {
      LocationTrackingService_MembersInjector.injectLocationRepository(instance, singletonCImpl.locationRepositoryImplProvider.get());
      LocationTrackingService_MembersInjector.injectSafeZoneRepository(instance, singletonCImpl.safeZoneRepositoryImplProvider.get());
      LocationTrackingService_MembersInjector.injectAlertRepository(instance, singletonCImpl.alertRepositoryImplProvider.get());
      LocationTrackingService_MembersInjector.injectSettingsRepository(instance, singletonCImpl.settingsRepositoryImplProvider.get());
      return instance;
    }

    private SOSAlertService injectSOSAlertService2(SOSAlertService instance) {
      SOSAlertService_MembersInjector.injectAlertRepository(instance, singletonCImpl.alertRepositoryImplProvider.get());
      SOSAlertService_MembersInjector.injectLocationRepository(instance, singletonCImpl.locationRepositoryImplProvider.get());
      return instance;
    }
  }

  private static final class SingletonCImpl extends SafeRouteApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<SettingsRepositoryImpl> settingsRepositoryImplProvider;

    private Provider<SafeRouteDatabase> provideDatabaseProvider;

    private Provider<EmergencyContactRepositoryImpl> emergencyContactRepositoryImplProvider;

    private Provider<AlertRepositoryImpl> alertRepositoryImplProvider;

    private Provider<FallDetectionRepositoryImpl> fallDetectionRepositoryImplProvider;

    private Provider<FusedLocationProviderClient> provideFusedLocationClientProvider;

    private Provider<LocationRepositoryImpl> locationRepositoryImplProvider;

    private Provider<SafeZoneRepositoryImpl> safeZoneRepositoryImplProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    private SOSAlertDao sOSAlertDao() {
      return DatabaseModule_ProvideSOSAlertDaoFactory.provideSOSAlertDao(provideDatabaseProvider.get());
    }

    private EmergencyContactDao emergencyContactDao() {
      return DatabaseModule_ProvideEmergencyContactDaoFactory.provideEmergencyContactDao(provideDatabaseProvider.get());
    }

    private FallEventDao fallEventDao() {
      return DatabaseModule_ProvideFallEventDaoFactory.provideFallEventDao(provideDatabaseProvider.get());
    }

    private SafeZoneDao safeZoneDao() {
      return DatabaseModule_ProvideSafeZoneDaoFactory.provideSafeZoneDao(provideDatabaseProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.settingsRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<SettingsRepositoryImpl>(singletonCImpl, 0));
      this.provideDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<SafeRouteDatabase>(singletonCImpl, 2));
      this.emergencyContactRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<EmergencyContactRepositoryImpl>(singletonCImpl, 3));
      this.alertRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<AlertRepositoryImpl>(singletonCImpl, 1));
      this.fallDetectionRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<FallDetectionRepositoryImpl>(singletonCImpl, 4));
      this.provideFusedLocationClientProvider = DoubleCheck.provider(new SwitchingProvider<FusedLocationProviderClient>(singletonCImpl, 6));
      this.locationRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<LocationRepositoryImpl>(singletonCImpl, 5));
      this.safeZoneRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<SafeZoneRepositoryImpl>(singletonCImpl, 7));
    }

    @Override
    public void injectSafeRouteApplication(SafeRouteApplication safeRouteApplication) {
    }

    @Override
    public void injectBootReceiver(BootReceiver bootReceiver) {
      injectBootReceiver2(bootReceiver);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private BootReceiver injectBootReceiver2(BootReceiver instance) {
      BootReceiver_MembersInjector.injectSettingsRepository(instance, settingsRepositoryImplProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.saferoute.data.repository.SettingsRepositoryImpl 
          return (T) new SettingsRepositoryImpl(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 1: // com.saferoute.data.repository.AlertRepositoryImpl 
          return (T) new AlertRepositoryImpl(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.sOSAlertDao(), singletonCImpl.emergencyContactRepositoryImplProvider.get());

          case 2: // com.saferoute.data.local.database.SafeRouteDatabase 
          return (T) DatabaseModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 3: // com.saferoute.data.repository.EmergencyContactRepositoryImpl 
          return (T) new EmergencyContactRepositoryImpl(singletonCImpl.emergencyContactDao());

          case 4: // com.saferoute.data.repository.FallDetectionRepositoryImpl 
          return (T) new FallDetectionRepositoryImpl(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.fallEventDao());

          case 5: // com.saferoute.data.repository.LocationRepositoryImpl 
          return (T) new LocationRepositoryImpl(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideFusedLocationClientProvider.get());

          case 6: // com.google.android.gms.location.FusedLocationProviderClient 
          return (T) LocationModule_ProvideFusedLocationClientFactory.provideFusedLocationClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 7: // com.saferoute.data.repository.SafeZoneRepositoryImpl 
          return (T) new SafeZoneRepositoryImpl(singletonCImpl.safeZoneDao());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
