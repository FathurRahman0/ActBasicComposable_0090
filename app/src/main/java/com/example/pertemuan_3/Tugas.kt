package com.example.pertemuan_3

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val EmasLembut = Color(0xFFFFD166)
private val PutihBersih = Color(0xFFF8F9FA)
private val KoralHangat = Color(0xFFFF6B6B)
private val BayanganTeks = Shadow(
    color = Color.Black.copy(alpha = 0.6f),
    offset = Offset(2f, 2f),
    blurRadius = 8f
)

@Composable
fun TugasLogin(modifier: Modifier) {
    val latar = painterResource(id = R.drawable.foto_porche)
    val logo = painterResource(id = R.drawable.logo_umy)
    val gambar = painterResource(id = R.drawable.foto_spongebobs)
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        //Gambar latar (digelapkan sedikit agar teks lebih terbaca)
        Image(
            painter = latar,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.tint(
                color = Color.Black.copy(alpha = 0.35f),
                blendMode = BlendMode.Darken
            ),
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Judul
            Text(
                text = "Login",
                fontSize = 36.sp,
                color = EmasLembut,
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 4.sp,
                style = TextStyle(shadow = BayanganTeks)
            )
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = PutihBersih.copy(alpha = 0.9f),
                letterSpacing = 1.sp,
                style = TextStyle(shadow = BayanganTeks)
            )
            Spacer(modifier = Modifier.height(75.dp))
            //Logo
            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier
                    .size(90.dp)
                    .shadow(elevation = 12.dp, shape = CircleShape)
            )
            Spacer(modifier = Modifier.height(10.dp))
            //Identitas
            Text(
                text = "Nama",
                fontSize = 16.sp,
                color = KoralHangat,
                fontWeight = FontWeight.Bold,
                letterSpacing = 2.sp,
                style = TextStyle(shadow = BayanganTeks)
            )
            Text(
                text = "Fathur Rahman",
                fontSize = 18.sp,
                color = PutihBersih,
                fontWeight = FontWeight.SemiBold,
                style = TextStyle(shadow = BayanganTeks)
            )
            Text(
                text = "20240140090",
                fontSize = 24.sp,
                color = EmasLembut,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                letterSpacing = 3.sp,
                style = TextStyle(shadow = BayanganTeks)
            )
            Spacer(modifier = Modifier.height(20.dp))
            //Foto bulat
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(230.dp)
                    .shadow(elevation = 16.dp, shape = CircleShape)
                    .clip(CircleShape)
                    .border(
                        width = 5.dp,
                        brush = Brush.sweepGradient(
                            listOf(EmasLembut, PutihBersih, EmasLembut)
                        ),
                        shape = CircleShape
                    )
            )
        }
    }
}