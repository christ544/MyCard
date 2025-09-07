package com.example.mycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycard.ui.theme.MyCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            setContent {
                MyCardTheme {
                    Scaffold(
                        modifier = Modifier.fillMaxSize()
                    ) { innerPadding ->
                        MyCard(modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }

    @Composable
    fun MyCard(modifier: Modifier = Modifier) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color(0xFF073042), Color(0xFF3ddc84))
                    )
                ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = stringResource(R.string.descri1),
                    modifier = Modifier.size(400.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))


                Text(
                    text = stringResource(R.string.MonNom),
                    fontSize = 32.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.profession),
                    fontSize = 20.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(32.dp))


                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,

                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically, ) {

                        Icon(Icons.Default.Phone, contentDescription = stringResource(R.string.descri2), tint = Color.White)

                        Spacer(modifier = Modifier.width(16.dp))
                        Text(
                            text = stringResource(R.string.numtel),
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                        Icon(Icons.Default.Email, contentDescription = stringResource(R.string.descri3), tint = Color.White)

                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text= stringResource(R.string.monmail), fontSize = 18.sp, color = Color.White, )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Icon(Icons.Default.Send, contentDescription = stringResource(R.string.descri4), tint = Color.White)

                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text= stringResource(R.string.media), fontSize = 18.sp, color = Color.White, )
                    }
                }

            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun MyCardPreview() {
        MyCardTheme {
            MyCard()
        }
    }
