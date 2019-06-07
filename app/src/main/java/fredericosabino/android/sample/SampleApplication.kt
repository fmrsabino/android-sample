package fredericosabino.android.sample

import android.app.Application
import android.content.Context
import fredericosabino.android.sample.data.di.ApplicationComponent
import fredericosabino.android.sample.data.di.DaggerApplicationComponent

class SampleApplication : Application() {

    private lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.factory().create(this)
        component.inject(this)
    }

    companion object {
        fun component(context: Context) = (context.applicationContext as SampleApplication).component
    }
}
