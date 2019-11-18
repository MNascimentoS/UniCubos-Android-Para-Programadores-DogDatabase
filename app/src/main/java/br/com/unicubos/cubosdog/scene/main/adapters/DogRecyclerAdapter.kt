package br.com.unicubos.cubosdog.scene.main.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.unicubos.cubosdog.R
import kotlinx.android.synthetic.main.item_dog.view.*

class DogRecyclerAdapter : RecyclerView.Adapter<DogRecyclerAdapter.DogViewHolder>() {

    private val dogList = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        return DogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_dog, parent, false))
    }

    override fun getItemCount(): Int = dogList.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        with(holder.itemView) {
            dogName?.text = dogList[position]
        }
    }

    fun addDogList(list: List<String>) {
        dogList.addAll(list)
        notifyDataSetChanged()
    }

    inner class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}