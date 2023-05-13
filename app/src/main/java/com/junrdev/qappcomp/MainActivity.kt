package com.junrdev.qappcomp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.junrdev.qappcomp.navigation.AppNavigator
import com.junrdev.qappcomp.ui.theme.Purple40
import com.junrdev.qappcomp.ui.theme.PurpleGrey80
import com.junrdev.qappcomp.ui.theme.QappCompTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QappCompTheme {
                // A surface container using the 'background' color from the theme
                App{
                    AppNavigator()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(content : @Composable ()-> Unit = {}) {

    Scaffold(
        topBar = {
                 TopAppBar(title = { Text(text = "Random Quiz")}, modifier = Modifier.background(PurpleGrey80))
        },
        modifier = Modifier
            .fillMaxSize()
            .background(Purple40)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            content()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QappCompTheme {
        App()
    }
}