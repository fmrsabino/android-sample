package fredericosabino.android.sample.data.remote.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PaginatedResponse<T>(
    @Json(name = "page") val page: Int?,
    @Json(name = "response") val response: List<T>?,
    @Json(name = "total_pages") val totalPages: Int?
)
