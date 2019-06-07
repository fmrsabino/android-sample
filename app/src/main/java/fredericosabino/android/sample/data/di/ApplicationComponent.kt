package fredericosabino.android.sample.data.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import fredericosabino.android.sample.SampleApplication
import fredericosabino.android.sample.data.qualifiers.ApplicationContext

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: SampleApplication)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance @ApplicationContext applicationContext: Context): ApplicationComponent
    }
}
