package com.example.composetutorial

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Для возможности скроллла добавляем след. маодификатор
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
                listItem(name = "Sample", phoneNum = "Sample")
            }
        }
    }
}

@Composable
private fun listItem(name: String, phoneNum: String) {
    //Аналог CardView
    //В Compose играет роль порядок модификаторов
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            //Отслеживание событий с элементом
            .pointerInput(Unit) {
                //Пример события
                detectDragGesturesAfterLongPress { change, dragAmount ->
                    Log.d("MyLog", "Long press: $dragAmount")
                    Log.d("MyLog", "Change: $change")
                }
                detectTapGestures {
                    Log.d("MyLog1", "Tap:$it")
                }
            },
        shape = RoundedCornerShape(16.dp),
        elevation = 6.dp
    ) {
        //Обычный контейнер, для которого можно устанавливать расположение элементов внутри его
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.helghan),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(6.dp)) {
                    Text(text = name)
                    Text(text = phoneNum)
                }
            }
        }
    }
}