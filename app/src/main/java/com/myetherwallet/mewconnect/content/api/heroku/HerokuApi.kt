package com.myetherwallet.mewconnect.content.api.heroku

import com.myetherwallet.mewconnect.feature.main.data.TickerData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Created by BArtWell on 16.07.2018.
 */

internal interface HerokuApi {

    @GET("ticker")
    fun getTickerData(@Query("filter") filter: String): Call<TickerData>
}
