package com.tbegames.and.top_speed_drag_racing.maaan

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tbegames.and.top_speed_drag_racing.otthter.appModulefrrffrrf
import com.tbegames.and.top_speed_drag_racing.otthter.hyjuujujujuj2
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class MaMaMaClass:Application() {

    companion object {
        const val apppppppps = "VukVr4m7ZhfBjBpidggJ5X"
        const val traaaaacker = "11951287204738628248"
        var aps_idddddd: String? = "main_id"
        var instIdfrfrf: String? = "instID"
        const val ONESIGNAL_APP_IDrrffrrf = "3102285a-a6db-4227-9b77-988286a1243c"
        const val paaaaaaackhyhyhyhy = "com.tbegames.and.top_speed_drag_racing"



    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_IDrrffrrf)

        val frrfrfrffrrf = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settingssssssss = getSharedPreferences("PREFS_NAME", 0)

        val trackerConfigfrfrfrffr = MyTracker.getTrackerConfig()

        val instIDsdddd = MyTracker.getInstanceId(this)
        trackerConfigfrfrfrffr.isTrackingLaunchEnabled = true


        if (settingssssssss.getBoolean("my_first_time", true)) {

            frrfrfrffrrf.edit().putString(instIdfrfrf, instIDsdddd).apply()
            settingssssssss.edit().putBoolean("my_first_time", false).apply()
        } else {

        }
        MyTracker.initTracker(traaaaacker, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MaMaMaClass)
            modules(
                listOf(
                    hyjuujujujuj2, appModulefrrffrrf
                )
            )
        }
    }
}