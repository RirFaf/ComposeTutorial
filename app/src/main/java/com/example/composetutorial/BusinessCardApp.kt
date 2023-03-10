package com.example.composetutorial

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.Gray500
import com.example.composetutorial.ui.theme.Gray700
import com.example.composetutorial.ui.theme.Teal100
import java.util.function.IntConsumer

class BusinessCardApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loadUI()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun loadUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Gray500)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
//                .background(Color.Red)
                .padding(vertical = 120.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
//                    .background(Gray500)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_person_24),
                    contentDescription = "Local description",
                    tint = Teal100
                )
                Text(
                    text = "John Doe",
                    fontSize = 60.sp,
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = "SMM manager",
                    fontSize = 25.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Gray500)
                .padding(vertical = 120.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 76.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_phone_24),
                        contentDescription = "Local description",
                        tint = Teal100
                    )
                    Text(text = "+7-(902)-355-12-72")
                }
                Row() {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_center_focus_weak_24),
                        contentDescription = "Local description",
                        tint = Teal100
                    )
                    Text(text = "@ig_account")
                }
                Row() {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_email_24),
                        contentDescription = "Local description",
                        tint = Teal100
                    )
                    Text(text = "email@domain.com")
                }
            }
        }
    }
}