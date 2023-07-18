package com.example.databaseroom.DataBase.Entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [ForeignKey(
        entity = SexoEntity::class,
        parentColumns = ["id"],
        childColumns = ["idSexo"]
    )]
)
data class UsuarioEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo
    var nombre: String,
    @ColumnInfo
    var idSexo: Int
)
