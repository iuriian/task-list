package com.iuriian.tasklist.view.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iuriian.tasklist.ui.theme.TaskListTheme
import com.iuriian.tasklist.view.components.DefaultButton
import com.iuriian.tasklist.view.components.InputText

@Composable
fun CreateTaskScreen(modifier: Modifier = Modifier) {
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

        DefaultButton(label = "CRIAR TAREFA", onClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun CreateTaskPreview() {
    TaskListTheme {
        Surface(
            modifier = Modifier.padding(16.dp),
        ) {
            CreateTaskScreen()
        }
    }
}
