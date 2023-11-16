package com.nicomahnic.roomfirebasexml

import android.app.Application
import com.nicomahnic.data.feature_users.di.RoomModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RoomFirebaseXmlApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@RoomFirebaseXmlApp)
            modules(listOf(
                RoomModule.modules
            ))
        }
    }
}