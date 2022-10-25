package com.ffescara.belajarandroid1

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val warnaUngu = 0xFFc791c7

        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
            ) {
                Image(painter = painterResource(id = R.drawable.portrait_zoro), contentDescription = "Gambar Sana")
                Surface(
                    color = Color.Yellow,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Hallo David",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp,16.dp,16.dp,4.dp),
                        //color = Color.Red
                        //color = Color(0xFFc791c7) //pake hex
                        color = Color(warnaUngu),
                        textAlign = TextAlign.Center
                    )
                }
                Surface(
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Guys disini",
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,4.dp),
                        textAlign = TextAlign.Center
                    )
                }
                Surface(
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Selamat datang di channel GadgetIn",
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,4.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}