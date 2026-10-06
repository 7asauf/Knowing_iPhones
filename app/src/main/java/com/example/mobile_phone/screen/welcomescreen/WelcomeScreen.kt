package com.example.mobile_phone.screen.welcomescreen

import android.R.attr.text
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.painterResource
import com.example.mobile_phone.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.ui.text.style.TextAlign

@Preview(showBackground = true)
@Composable
fun WelcomeScreen() {

    Box(

        modifier = Modifier.fillMaxSize().background(color = Color.DarkGray)
    ){

        Image(
            painter = painterResource(R.drawable.welcome_phone),
            contentDescription = "Welcome Image",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.72f),
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter
        )



        Column(
            modifier = Modifier.fillMaxSize().padding(bottom = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = "Know your iPhone. Truly.",
                color = Color.White,
                fontWeight = FontWeight.Black,
                fontSize = 24.sp
            )

            Spacer(
                modifier = Modifier.height(15.dp)
            )

            Text(
                text = "Learn about what to do with your iPhone.",
                color = Color.LightGray,
                fontWeight = FontWeight.Light,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )


            Spacer(
                modifier = Modifier.height(15.dp)
            )

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth ( 0.6f),
            ) {
                Text(
                    text = "Get Started"
                )

            }
        }




    }

}