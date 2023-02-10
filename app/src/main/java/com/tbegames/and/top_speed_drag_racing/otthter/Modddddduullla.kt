package com.tbegames.and.top_speed_drag_racing.otthter

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tbegames.and.top_speed_drag_racing.appppipip.frrfhfrhufhrhrfh
import com.tbegames.and.top_speed_drag_racing.appppipip.CountryRepogtgtgtgtgt
import com.tbegames.and.top_speed_drag_racing.appppipip.DevRepogtgtgtgt5
import com.tbegames.and.top_speed_drag_racing.appppipip.HostInterfaceeee
import com.tbegames.and.top_speed_drag_racing.toooo.YGydgegdegedgged
import com.tbegames.and.top_speed_drag_racing.toooo.Bhfbrrfrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModulefrrffrrf = module {

    single  <HostInterfaceeee> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HostInterfaceeee::class.java)
    }

    single <frrfhfrhufhrhrfh> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(frrfhfrhufhrhrfh::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://rubyfruits.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        CountryRepogtgtgtgtgt(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        DevRepogtgtgtgt5(get(named("HostInter")))
    }
    single{
        provideGsonfrrfrffrrfrfrfrf()
    }
    single (named("SharedPreferences")) {
        juujjuujuj2uj2(androidApplication())
    }
}

fun juujjuujuj2uj2(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


val hyjuujujujuj2 = module {
    viewModel (named("MainModel")){
        Bhfbrrfrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        YGydgegdegedgged(get())
    }
}


fun provideGsonfrrfrffrrfrfrfrf(): Gson {
    return GsonBuilder().create()
}
