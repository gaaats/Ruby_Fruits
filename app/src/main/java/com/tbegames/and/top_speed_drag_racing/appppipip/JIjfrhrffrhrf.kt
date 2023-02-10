package com.tbegames.and.top_speed_drag_racing.appppipip

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface HostInterfaceeee {
    @GET("lolka.json")
    suspend fun tgt2tg2gt5gt5(): Response<GeoDevgtgtt6ggt>
}

@Keep
data class GeoDevgtgtt6ggt(
    @SerializedName("country")
    val gtnjngtjgtnjgt: String,
    @SerializedName("vebvebvebveb")
    val frjorfifrhfrh: String,
    @SerializedName("numberatorcheckator")
    val grfgtjgtjigtji: String,
)