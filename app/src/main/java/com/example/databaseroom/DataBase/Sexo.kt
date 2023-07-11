package com.example.databaseroom.DataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "Sexo", indices = [Index(value = ["tipo"], unique = true)])
data class Sexo(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "tipo")
    var tipo: String
)
