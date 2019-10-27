package com.android.segunfrancis.movieapp_koinretrofitandmvvm

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyCustomApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyCustomApp)
            modules(listOf(retrofitModule, picassoModule, movieModule))
        }
    }
}