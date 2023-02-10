package com.tbegames.and.top_speed_drag_racing.toooo

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.tbegames.and.top_speed_drag_racing.appppipip.CountryCodeJSgt2gtgtgtgt
import com.tbegames.and.top_speed_drag_racing.appppipip.CountryRepogtgtgtgtgt
import com.tbegames.and.top_speed_drag_racing.appppipip.DevRepogtgtgtgt5
import com.tbegames.and.top_speed_drag_racing.appppipip.GeoDevgtgtt6ggt
import com.tbegames.and.top_speed_drag_racing.maaan.MaMaMaClass.Companion.apppppppps
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class Bhfbrrfrf(
    private val gtgtjojgti: CountryRepogtgtgtgtgt,
    private val frrkjbkjgtngtjngt: DevRepogtgtgtgt5,
    private val cdcvdgd: SharedPreferences,
    val apappap: Application
) : ViewModel() {


    private val gtgtggt = MutableLiveData<GeoDevgtgtt6ggt>()
    val ggtgtgtgtthyhy: LiveData<GeoDevgtgtt6ggt>
        get() = gtgtggt


    private val gtyhhyhyhyhju = MutableLiveData<String>()
    val gthyhyhy: LiveData<String>
        get() = gtyhhyhyhyhju

    private val hykok = MutableLiveData<String>()
    val ggtokktgok: LiveData<String>
        get() = hykok

    suspend fun vfbjhhgthgthuhgtddd() {
        val ressss = gtgtjojgti.gtgt2gtgt5tg().body()!!
        fr5rf5rf5.postValue(ressss)
        hju55595()
    }

    suspend fun hju55595() {
        val ressss = frrkjbkjgtngtjngt.g2gt5tg5tg5().body()
        gtgtggt.postValue(ressss!!)
    }



    private val gttggt5gt5tg = MutableLiveData<CountryCodeJSgt2gtgtgtgt>()
    val data: LiveData<CountryCodeJSgt2gtgtgtgt>
        get() = gttggt5gt5tg


    private val fr5rf5rf5 = MutableLiveData<CountryCodeJSgt2gtgtgtgt>()
    val gtnjjgigitj: LiveData<CountryCodeJSgt2gtgtgtgt>
        get() = fr5rf5rf5


    private val _mainIddededdeeded = MutableLiveData<String?>()
    val frrfrffrfrrf: LiveData<String?>
        get() = _mainIddededdeeded


    fun vfbhfrhgrfyrfgfgrfddd(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(apppppppps, gtjtgigtjgtjgtjijgtijgtjig, apappap)
        AppsFlyerLib.getInstance().start(cont)
    }


    fun gtjjgtgtjjgtijgtjigt() {
        val vbghgthgthhgt = AdvertisingIdClient(apappap)
        vbghgthgthhgt.start()
        val gjjgtijigtjjgtjgt = vbghgthgthhgt.info.id.toString()
        _mainIddededdeeded.postValue(gjjgtijigtjjgtjgt)
    }

    fun ggtjigtiuhgt(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val deepDataaaaaaaaa = data.targetUri?.host.toString()
                cdcvdgd.edit().putString("deepSt", deepDataaaaaaaaa).apply()
            }
        }
    }

    private val gtjtgigtjgtjgtjijgtijgtjig = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val ggtgtgtgtgt = data?.get("campaign").toString()
            gtyhhyhyhyhju.postValue(ggtgtgtgtgt)

            val hyhjuujjujuju = Bundle()

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }



    init {
        viewModelScope.launch(Dispatchers.IO) {
            gtjjgtgtjjgtijgtjigt()
        }
        viewModelScope.launch(Dispatchers.Main) {
            vfbjhhgthgthuhgtddd()
        }
    }

}

