package com.example.remindme

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.widget.GridLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ListView
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private val reminders = ArrayList<Reminder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.listView)
        val editText = findViewById<EditText>(R.id.editText)
        val editTimesPerDay = findViewById<EditText>(R.id.editTimesPerDay)
        val addButton = findViewById<Button>(R.id.addButton)

        val adapter = ReminderAdapter(this, reminders)
        listView.adapter = adapter

        addButton.setOnClickListener {
            showHabitSuggestions(editText) // Modificado para llamar a showHabitSuggestions
        }
    }

    private fun showHabitSuggestions(editText: EditText) {
        val habitSuggestions = arrayOf("Caminar 30 minutos", "Beber 2 litros de agua", "Leer 20 páginas")
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Sugerencias de Hábitos")
        builder.setItems(habitSuggestions) { _, which ->
            val selectedHabit = habitSuggestions[which]
            editText.setText(selectedHabit)
            // Puedes poner aquí más lógica si quieres pre-rellenar más campos
        }
        builder.show()
    }
}
