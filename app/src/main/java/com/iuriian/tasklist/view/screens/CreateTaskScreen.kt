package com.iuriian.tasklist.view.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iuriian.tasklist.ui.theme.TaskListTheme
import com.iuriian.tasklist.view.components.DefaultButton
import com.iuriian.tasklist.view.components.InputText
import com.iuriian.tasklist.view.components.ScreenContainer
import com.iuriian.tasklist.view.components.ToolbarNavigation

@Composable
fun CreateTaskScreen(
    modifier: Modifier = Modifier,
    onCreateTaskClick: () -> Unit,
    onBack: () -> Unit,
) {
    ScreenContainer(
        toolbarNavigation =
            ToolbarNavigation(
                icon = Icons.AutoMirrored.Default.ArrowBack,
                navigate = onBack,
            ),
    ) {
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                InputText(
                    label = "Nome",
                    onValueChange = {},
                )
            }

            DefaultButton(label = "CRIAR TAREFA", onClick = onCreateTaskClick)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateTaskPreview() {
    TaskListTheme {
        Surface(
            modifier = Modifier.padding(16.dp),
        ) {
            CreateTaskScreen(
                onCreateTaskClick = {},
                onBack = {},
            )
        }
    }
}
