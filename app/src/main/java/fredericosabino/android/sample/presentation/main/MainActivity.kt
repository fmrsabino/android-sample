package fredericosabino.android.sample.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fredericosabino.android.sample.SampleApplication
import fredericosabino.android.sample.data.remote.TheMovieDatabaseService
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //TODO proper architecture
    @Inject
    lateinit var theMovieDatabaseService: TheMovieDatabaseService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleApplication.component(this).inject(this)
    }

    override fun onStart() {
        super.onStart()
        MainScope().launch {
            val response = theMovieDatabaseService.popularMovies()

            println(response)
        }
    }
}
