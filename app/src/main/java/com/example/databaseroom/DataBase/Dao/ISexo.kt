package com.example.databaseroom.DataBase.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.IGNORE
import androidx.room.Query
import com.example.databaseroom.DataBase.Entitys.SexoEntity

@Dao
interface ISexo {
    @Insert(onConflict = IGNORE)
    suspend fun Insertar(sexoEntity: SexoEntity)
    @Query("SELECT * FROM SexoEntity")
    fun Get():List<SexoEntity>
    @Delete
    fun Eliminar(sexoEntity: SexoEntity)
}