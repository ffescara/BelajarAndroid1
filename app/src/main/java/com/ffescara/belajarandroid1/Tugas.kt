package com.ffescara.belajarandroid1

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.*

class Tugas : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column() {
                Row(Modifier.weight(1f)) {
                    Column(Modifier.weight(1f)) {
                        Bingkai(name = "SANA", grup = "TWICE", gambar = 0, warna = Color.Red)
                    }
                    Column(Modifier.weight(1f)) {
                        Bingkai(name = "MOMO", grup = "TWICE", gambar = 1, warna = Color.Green)
                    }
                    Column(Modifier.weight(1f)) {
                        Bingkai(name = "TZUYU", grup = "TWICE", gambar = 2, warna = Color.Yellow)
                    }
                }
                Row(Modifier.weight(1f)) {
                    Column(Modifier.weight(1f)) {
                        Bingkai(name = "JIHYO", grup = "TWICE", gambar = 3, warna = Color(0xFFff852b))
                    }
                    Column(Modifier.weight(1f)) {
                        Bingkai(name = "NAYEON", grup = "TWICE", gambar = 4, warna = Color(0xFFc791c7))
                    }
                    Column(Modifier.weight(1f)) {
                        Bingkai(name = "DAHYUN", grup = "TWICE", gambar = 5, warna = Color(0xFF93831d))
                    }
                }
            }
        }
    }
}

@SuppressLint("ResourceType")
@Composable
fun Bingkai(name: String, grup: String, gambar: Int, warna: Color) {
    val images = intArrayOf(
        R.drawable.sana,
        R.drawable.momo,
        R.drawable.tzuyu,
        R.drawable.jihyo,
        R.drawable.nayeon,
        R.drawable.dahyun,
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(warna)
    ) {
        Image(
            painter = painterResource(id = images[gambar]),
            contentDescription = "Gambar $name",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Text(text = "$name", modifier = Modifier.padding(0.dp,15.dp,0.dp,0.dp))
        Text(text = "$grup", fontSize = 12.sp)
    }
}