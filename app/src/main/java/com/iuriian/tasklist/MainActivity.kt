package com.iuriian.tasklist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.iuriian.tasklist.ui.theme.TaskListTheme
import com.iuriian.tasklist.view.routes.AppGraphRouter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskListTheme {
                AppGraphRouter(navCtrl = rememberNavController())
            }
        }
    }
}
