package com.nicomahnic.roomfirebasexml

import android.app.Application
import com.nicomahnic.data.feature_users.di.RoomModule
import com.nicomahnic.data.feature_users.di.UserRoomModule
import com.nicomahnic.domain.di.UserUseCasesModule
import com.nicomahnic.presentation.di.ViewModelModule
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
                RoomModule.modules,
                UserRoomModule.modules,
                UserUseCasesModule.modules,
                ViewModelModule.modules
            ))
        }
    }
}