package br.com.unicubos.cubosdog.scene.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.unicubos.cubosdog.R
import br.com.unicubos.cubosdog.scene.main.adapters.DogRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Main.View {

    private val interactor: MainInteractor by lazy {
        MainInteractor(MainPresenter(this, resources))
    }
    private lateinit var adapter: DogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = DogRecyclerAdapter()

        recyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView?.adapter = adapter

        interactor.handleAddDogsOnDb()
        interactor.handleGetDogsOnDb()
    }

    override fun displayDogList(dogList: List<String>) {
        adapter.addDogList(dogList)
    }
}
