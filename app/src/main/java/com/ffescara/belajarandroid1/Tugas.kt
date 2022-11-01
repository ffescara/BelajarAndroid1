package com.ffescara.belajarandroid1

import android.annotation.SuppressLint
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Tugas : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(Modifier.weight(1f)) {
                    Bingkai(name = getString(R.string.Sana),
                        grup = getString(R.string.Twice),
                        gambar = R.drawable.sana,
                        warna = Color.Red,
                        mod = Modifier.weight(1f)
                    )
                    Bingkai(name = getString(R.string.Momo),
                        grup = getString(R.string.Twice),
                        gambar = R.drawable.momo,
                        warna = Color.Green,
                        mod = Modifier.weight(1f)
                    )
                    Bingkai(name = getString(R.string.Tzuyu),
                        grup = getString(R.string.Twice),
                        gambar = R.drawable.tzuyu,
                        warna = Color.Yellow,
                        mod = Modifier.weight(1f)
                    )
                }
                Row(Modifier.weight(1f)) {
                    Bingkai(name = getString(R.string.Jihyo),
                        grup = getString(R.string.Twice),
                        gambar = R.drawable.jihyo,
                        warna = Color(0xFFff852b),
                        mod = Modifier.weight(1f)
                    )
                    Bingkai(name = getString(R.string.Nayeon),
                        grup = getString(R.string.Twice),
                        gambar = R.drawable.nayeon,
                        warna = Color(0xFFc791c7),
                        mod = Modifier.weight(1f)
                    )
                    Bingkai(name = getString(R.string.Dahyun),
                        grup = getString(R.string.Twice),
                        gambar = R.drawable.dahyun,
                        warna = Color(0xFF93831d),
                        mod = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@SuppressLint("ResourceType")
@Composable
fun Bingkai(name: String, grup: String, gambar: Int, warna: Color, mod: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = mod
            .fillMaxSize()
            .background(warna)
    ) {
        Image(
            painter = painterResource(id = gambar),
            contentDescription = "Gambar $name",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(
                    BorderStroke(width = 2.dp,color = Color.White),
                    CircleShape
                )
        )
        Text(text = "$name", modifier = Modifier.padding(0.dp, 15.dp, 0.dp, 0.dp))
        Text(text = "$grup", fontSize = 12.sp)
    }
}