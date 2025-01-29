package org.training.whatsup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.training.whatsup.ui.theme.WhatsUpTheme

@Composable
fun NearMeScreen() {
    WhatsUpTheme {
        Surface (
            modifier = Modifier.fillMaxSize().padding(4.dp),
            color = MaterialTheme.colorScheme.background
        ) {
            Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Column Content
                Text(text = "Events Near Me")
            } //end Column
        } //end Surface
    } //end Theme
} //end NearMeScreen

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NearMeScreenPreview() {
    NearMeScreen()
}