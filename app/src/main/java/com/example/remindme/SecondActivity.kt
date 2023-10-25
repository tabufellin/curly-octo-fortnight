package com.example.remindme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.remindme.ui.theme.RemindMeTheme
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch



class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RemindMeTheme {

    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current

    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") {
            MenuScreen(navController = navController)
        }
        composable("nuevo_habito") {
            NuevoHabitoScreen()
        }
        composable("calendario") {
            CalendarioScreen()
        }
        composable("ver_habitos") {
            VerHabitosScreen()
        }
    }

                SecondScreenContent()
            }
        }
    }
}



package com.example.remindme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.remindme.ui.theme.RemindMeTheme
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch



class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RemindMeTheme {

    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current

    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") {
            MenuScreen(navController = navController)
        }
        composable("nuevo_habito") {
            NuevoHabitoScreen()
        }
        composable("calendario") {
            CalendarioScreen()
        }
        composable("ver_habitos") {
            VerHabitosScreen()
        }
    }

                MenuScreen()
            }
        }
    }
}


@Composable
fun SecondScreenContent() {
    Surface(
        modifier = Modifier.fillMaxSize().background(Color(0xFF0000FF)),

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Remind Me", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                // Aquí puedes añadir cualquier acción que quieras que ocurra al hacer clic en el botón, si es necesario.
            }) {
                Text(text = "Añadir meta")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    RemindMeTheme {
        SecondScreenContent()
    }
}
