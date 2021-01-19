package com.example.indicaapp.vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.indicaapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.contenedorFragmentos,FragmentoMenu.newInstance("FG","DESDE ACTIVITY")).commit()

    }
}