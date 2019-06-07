package fredericosabino.android.sample.data.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import fredericosabino.android.sample.SampleApplication
import fredericosabino.android.sample.data.qualifiers.ApplicationContext
import fredericosabino.android.sample.presentation.main.MainActivity

@Component(modules = [ApplicationModule::class], dependencies = [NetworkComponent::class])
interface ApplicationComponent {

    fun inject(application: SampleApplication)

    // TODO different scope
    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance @ApplicationContext applicationContext: Context,
            networkComponent: NetworkComponent = DaggerNetworkComponent.factory().create()
        ): ApplicationComponent
    }
}
