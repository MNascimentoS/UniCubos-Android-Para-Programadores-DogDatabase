package br.com.unicubos.cubosdog.persistence

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dog")
data class DogEntity(
    @PrimaryKey
    val name: String,
    val breed: String
)