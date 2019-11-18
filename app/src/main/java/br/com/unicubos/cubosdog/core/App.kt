package br.com.unicubos.cubosdog.core

import android.app.Application
import br.com.unicubos.cubosdog.persistence.DogDatabase

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DogDatabase.inicialize(applicationContext)
    }

}