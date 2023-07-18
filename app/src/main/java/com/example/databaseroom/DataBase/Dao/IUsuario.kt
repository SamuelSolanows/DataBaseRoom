package com.example.databaseroom.DataBase.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.databaseroom.DataBase.Entitys.UsuarioEntity

@Dao
interface IUsuario {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun Insertar(usuarioEntity: UsuarioEntity)

    @Query("SELECT * FROM UsuarioEntity")
    fun Get(): List<UsuarioEntity>
}