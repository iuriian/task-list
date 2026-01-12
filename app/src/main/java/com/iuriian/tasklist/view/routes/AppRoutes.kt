package com.iuriian.tasklist.view.routes

import kotlinx.serialization.Serializable

interface AppRoutes {
    @Serializable
    data object Home : AppRoutes

    @Serializable
    data object CreateTask : AppRoutes
}
