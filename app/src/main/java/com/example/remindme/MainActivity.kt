package com.example.remindme

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.widget.GridLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ListView

class MainActivity : ComponentActivity() {

    private val reminders = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.listView)
        val editText = findViewById<EditText>(R.id.editText)
        val addButton = findViewById<Button>(R.id.addButton)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, reminders)
        listView.adapter = adapter

        addButton.setOnClickListener {
            val reminderText = editText.text.toString()
            if (reminderText.isNotEmpty()) {
                reminders.add(reminderText)
                adapter.notifyDataSetChanged()
                editText.text.clear()
            }
        }

    }
}