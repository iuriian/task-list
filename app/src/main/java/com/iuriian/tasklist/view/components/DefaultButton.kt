package com.iuriian.tasklist.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DefaultButton(
    modifier: Modifier = Modifier,
    label: String,
    onClick: () -> Unit = {},
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
    ) {
        Text(
            text = label,
        )
    }
}
