package com.nicomahnic.roomfirebasexml

import android.app.Application
import org.koin.core.context.startKoin

class RoomFirebaseXmlApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {

        }
    }
}