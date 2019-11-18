package br.com.unicubos.cubosdog.scene.main

import br.com.unicubos.cubosdog.persistence.DogDatabase
import br.com.unicubos.cubosdog.persistence.DogEntity

class MainInteractor(private val presenter: Main.Presenter) : Main.Interactor {

    override fun handleAddDogsOnDb() {
        val dao = DogDatabase.instance.dogDao()
        dao.insertDog(DogEntity(
            name = "Melissa",
            breed = "Pug"
        ))
        dao.insertDog(DogEntity(
            name = "Paçoca",
            breed = "Vira lata"
        ))
        dao.insertDog(DogEntity(
            name = "Floquinho",
            breed = "Dalmata"
        ))
        dao.insertDog(DogEntity(
            name = "Rex",
            breed = "Pitbull"
        ))

    }

    override fun handleGetDogsOnDb() {
        val dogs = DogDatabase.instance.dogDao().getDogs()
        dogs?.let {
            presenter.presentDogList(it)
        } ?: run {
            //TODO present error
        }
    }

}