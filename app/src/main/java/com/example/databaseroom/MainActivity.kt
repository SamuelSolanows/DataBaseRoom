package com.example.databaseroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.databaseroom.DataBase.DBconexion
import com.example.databaseroom.DataBase.Entitys.SexoEntity
import com.example.databaseroom.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var db: DBconexion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        db = DBconexion.GetDatabase(this)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            Agregar()
        }
    }


    fun Agregar() {
        CoroutineScope(Dispatchers.IO).launch {

            try {
                db.SexoDao().Insertar(SexoEntity(0, binding.txt.text.toString()))
                var lis = db.SexoDao().Get()
                Log.e("Guardado", "guardado: ${lis.size}")
                binding.txt.setText("")
            } catch (e: Exception) {
                Log.e("Error", "Error: ${e.message}")
            }
        }
    }
}