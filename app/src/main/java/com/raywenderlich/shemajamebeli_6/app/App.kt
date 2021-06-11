package com.raywenderlich.shemajamebeli_6.app

import android.app.Application
import com.raywenderlich.shemajamebeli_6.storage.DataService

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        DataService.initialize(this)
    }

}