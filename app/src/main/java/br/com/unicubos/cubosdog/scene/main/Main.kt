package br.com.unicubos.cubosdog.scene.main

import br.com.unicubos.cubosdog.persistence.DogEntity

interface Main {

    interface View {
        fun displayDogList(dogList: List<String>)
    }

    interface Presenter {
        fun presentDogList(dogList: List<DogEntity>)
    }

    interface Interactor {
        fun handleAddDogsOnDb()
        fun handleGetDogsOnDb()
    }

}