package com.android.segunfrancis.movieapp_koinretrofitandmvvm

import android.content.Context
import com.squareup.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import okhttp3.Call
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val picassoModule = module {
    single {
        val downloader = okHttp3Downloader(get ())
        picasso(androidContext(), downloader)
    }
}

private fun okHttp3Downloader(callFactory: Call.Factory) = OkHttp3Downloader(callFactory)

private fun picasso(context: Context, downloader: OkHttp3Downloader) =
    Picasso.Builder(context)
        .downloader(downloader)
        .loggingEnabled(true)
        .build()