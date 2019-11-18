package br.com.unicubos.cubosdog.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DogDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDog(dog: DogEntity)

    @Query("SELECT * FROM `dog`")
    fun getDogs() : List<DogEntity>?

}