package com.example.databaseroom.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.databaseroom.DataBase.Dao.ISexo
import com.example.databaseroom.DataBase.Dao.IUsuario
import com.example.databaseroom.DataBase.Entitys.SexoEntity
import com.example.databaseroom.DataBase.Entitys.UsuarioEntity

@Database(entities = [SexoEntity::class,UsuarioEntity::class], version = 1)
abstract class DBconexion : RoomDatabase() {
    abstract fun SexoDao() : ISexo
    abstract fun UsuarioDao():IUsuario
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