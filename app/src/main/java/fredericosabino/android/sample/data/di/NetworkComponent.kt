package fredericosabino.android.sample.data.di

import dagger.Component
import fredericosabino.android.sample.data.remote.TheMovieDatabaseService

@Component(modules = [NetworkModule::class])
interface NetworkComponent {

    fun theMovieDatabaseService(): TheMovieDatabaseService

    @Component.Factory
    interface Factory {
        fun create(): NetworkComponent
    }
}
