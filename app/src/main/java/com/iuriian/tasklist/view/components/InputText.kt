package com.iuriian.tasklist.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun InputText(
    modifier: Modifier = Modifier,
    label: String,
    onValueChange: (String) -> Unit,
) {
    val inputValue by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        label = {
            Text(
                text = label,
            )
        },
        onValueChange = {
            onValueChange(it)
        },
        value = inputValue,
    )
}
