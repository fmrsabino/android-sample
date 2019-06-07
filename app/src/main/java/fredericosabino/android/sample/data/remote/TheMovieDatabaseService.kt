package fredericosabino.android.sample.data.remote

import fredericosabino.android.sample.data.remote.entities.MovieRaw
import fredericosabino.android.sample.data.remote.entities.PaginatedResponse
import retrofit2.http.GET

interface TheMovieDatabaseService {

    @GET("movie/popular")
    suspend fun popularMovies(): PaginatedResponse<MovieRaw>

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
    }
}
