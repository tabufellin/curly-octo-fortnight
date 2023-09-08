package com.example.remindme
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.remindme.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.board)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = listOf(
            com.example.remindme.ListItem("Reminder #1"),
            com.example.remindme.ListItem("Reminder #2"),
            com.example.remindme.ListItem("Reminder #3"),

            // Add more items as needed
        )

        val adapter = com.example.remindme.ListAdapter(itemList, object : com.example.remindme.ListAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                // Handle item click here
                Toast.makeText(applicationContext, "Item clicked at position $position", Toast.LENGTH_SHORT).show()
            }
        })

        recyclerView.adapter = adapter

        // Find the button by its ID
        val startFormButton = findViewById<Button>(R.id.startFormButton)

        // Set a click listener for the button
        startFormButton.setOnClickListener {
            // Create an intent to navigate to the form activity
            val intent = Intent(this, FormActivity::class.java)

            // Start the form activity
            startActivity(intent)
        }

    }
}
