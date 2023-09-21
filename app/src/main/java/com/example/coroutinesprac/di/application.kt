package com.example.coroutinesprac.di

import android.app.Application
import android.util.Log
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class Application:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@Application)
            modules(appModule)
        }
        Log.d("MyApp", "Koin started successfully") // Add this log statement

    }
}