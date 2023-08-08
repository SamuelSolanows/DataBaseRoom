package com.example.databaseroom.DataBase.Entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = [Index(value = ["nombre"],
    unique = true)])
data class SexoEntity(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    @ColumnInfo(name ="nombre")
    var nombre:String
)