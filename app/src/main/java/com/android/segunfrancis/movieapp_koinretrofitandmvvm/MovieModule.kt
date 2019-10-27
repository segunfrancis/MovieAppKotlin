package com.android.segunfrancis.movieapp_koinretrofitandmvvm

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val movieModule = module {
    viewModel {
        MovieViewModel(get())
    }
}