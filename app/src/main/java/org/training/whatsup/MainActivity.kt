package org.training.whatsup

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.training.whatsup.ui.theme.WhatsUpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            WhatsUpTheme {
//                Surface(modifier = Modifier.wrapContentSize(),
//                    color = MaterialTheme.colorScheme.background) {
//                    Greeting(
//                        name = "Andriod"
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Andriod",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        Toast.makeText(this, "Welcome to WhatsUp", Toast.LENGTH_LONG).show()
    }
}

@Composable
fun MainScreenWithBottomNavBar() {
    Scaffold(
        bottomBar = {
            NavigationBar {
                WhatsUpNavItemInfo().getAllNavItems().forEachIndexed {
                    index,
                    itemInfo -> NavigationBarItem(
                        selected = false,
                        onClick = { /* TODO */ },
                        icon = {
                            Icon(imageVector = itemInfo.icon, contentDescription = itemInfo.label)
                        },
                        label = {
                            Text(text = itemInfo.label)
                        }
                    ) // end itemInfo
                }
            }
        }
    ) {
        paddingValues -> Column(
            modifier = Modifier.padding(paddingValues)
        ) { }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WhatsUpTheme {
        MainScreenWithBottomNavBar()
    }
}