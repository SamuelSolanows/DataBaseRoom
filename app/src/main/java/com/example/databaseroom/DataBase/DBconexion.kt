package com.example.databaseroom.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Sexo::class], version = 1)
abstract class DBconexion : RoomDatabase() {
    abstract fun SexoDao() : ISexo
    companion object {
        @Volatile
        private var INSTANCIA: DBconexion? = null
        fun GetDatabase(context: Context): DBconexion {
            if (INSTANCIA != null) {
                return INSTANCIA!!
            }

            INSTANCIA =
                Room.databaseBuilder(
                    context.applicationContext,
                    DBconexion::class.java,
                    "DBprueba"
                ).build()
            return INSTANCIA!!
        }
    }
}