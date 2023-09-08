package com.example.remindme

import android.os.Bundle
import androidx.activity.ComponentActivity

class FormActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        // Handle form submission and reminder creation here
        // You can use the UI elements defined in activity_form.xml
        // Example: Save the reminder to a database or perform any desired actions
    }
}
