package br.com.unicubos.cubosdog.scene.main

import android.content.res.Resources
import br.com.unicubos.cubosdog.persistence.DogEntity

class MainPresenter(private val view: Main.View, private val resources: Resources) : Main.Presenter {

    override fun presentDogList(dogList: List<DogEntity>) {
        view.displayDogList(dogList.map {
            it.name
        })
    }

}