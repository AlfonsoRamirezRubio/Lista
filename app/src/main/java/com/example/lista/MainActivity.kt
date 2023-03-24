package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var Lugar: TextView
    val Lugarsitos = arrayOf("Tequila", "Magdalena", "Estancia puente gediondo", "Guadalajara", "Exatlan",
        "Sayula", "Vallarta", "Amatitan", "Zacoalco", "Chetumal",
        "Hojozarco", "Hostotipaquillo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Lugar = findViewById(R.id.txtlugar)
        val ListView: ListView = findViewById(R.id.listview_Lugarsitos)

        val adaptador = ArrayAdapter(this, R.layout.list_item, Lugarsitos)

        ListView.adapter = adaptador

        ListView.onItemClickListener = object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val item = ListView.getItemAtPosition(p2) as String
                Log.e("Valor Lista", item)
                Toast.makeText(applicationContext, "El valor es $item", Toast.LENGTH_LONG).show()
                Lugar.text = item
            }
        }

    }
}

