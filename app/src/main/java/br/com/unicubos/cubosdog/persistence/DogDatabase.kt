package br.com.unicubos.cubosdog.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    version = DogDatabase.VERSION,
    entities = [DogEntity::class]
)
abstract class DogDatabase : RoomDatabase() {

    companion object {
        private const val DATABASE_NAME = "dog.db"
        const val VERSION = 1
        lateinit var instance: DogDatabase

        fun inicialize(applicationContext: Context) {
            instance = Room.databaseBuilder(
                applicationContext,
                DogDatabase::class.java,
                DATABASE_NAME
            ).apply {
                allowMainThreadQueries()
            }.build()
        }
    }

    abstract fun dogDao() : DogDao

}