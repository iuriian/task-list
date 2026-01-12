package com.iuriian.tasklist.view.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.iuriian.tasklist.view.screens.CreateTaskScreen
import com.iuriian.tasklist.view.screens.HomeScreen

@Composable
fun AppGraphRouter(navCtrl: NavHostController) {
    NavHost(navController = navCtrl, startDestination = AppRoutes.Home) {
        composable<AppRoutes.Home> {
            HomeScreen(
                onNewTaskClick = {
                    navCtrl.navigate(AppRoutes.CreateTask)
                },
            )
        }
        composable<AppRoutes.CreateTask> {
            CreateTaskScreen(
                onCreateTaskClick = {},
                onBack = {
                    navCtrl.popBackStack()
                },
            )
        }
    }
}
