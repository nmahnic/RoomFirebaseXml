package com.nicomahnic.roomfirebasexml

import android.app.Application
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

            ))
        }
    }
}