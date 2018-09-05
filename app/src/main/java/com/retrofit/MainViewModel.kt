package com.retrofit

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel

class MainViewModel(application: Application) : AndroidViewModel(application) {
    fun start() {
        sampleText.set("DONE")
    }

    var sampleText = ObservableField<String>()
}