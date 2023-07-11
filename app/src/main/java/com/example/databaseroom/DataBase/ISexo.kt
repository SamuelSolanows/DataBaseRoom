package com.example.databaseroom.DataBase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.IGNORE
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query

@Dao
interface ISexo {
    @Insert(onConflict = REPLACE)
    suspend fun Insertar(Sexo: Sexo)

    @Query("SELECT * FROM SEXO")
    suspend fun Get(): List<Sexo>
}