package fredericosabino.android.sample.data.remote.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MovieRaw(
    @Json(name = "id") val id: String?,
    @Json(name = "posterPath") val posterPath: String?,
    @Json(name = "title") val title: String?
)
