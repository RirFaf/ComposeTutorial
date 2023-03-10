package com.example.composetutorial.neco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composetutorial.R

class ModifiersStates : ComponentActivity() {
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
    //Работа с изменениями состояний.
    //Если мы хотим активного изменения переменных (например инкремнентацию),
    //то нам необходимо объявлять их след. образом
    var counter = remember {
        mutableStateOf(0)
    }
    var color = remember {
        mutableStateOf(Color.White)
    }
    //Аналог CardView
    //В Compose играет роль порядок модификаторов
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            //Отслеживание событий с элементом
            .pointerInput(Unit) {
                //Пример события
//                detectDragGesturesAfterLongPress { change, dragAmount ->
//                    Log.d("MyLog", "Long press: $dragAmount")
//                    Log.d("MyLog", "Change: $change")
//                }
//                detectTapGestures {
//                    Log.d("MyLog", "Tap:$it")
//                }
            },
        shape = RoundedCornerShape(16.dp),
        elevation = 6.dp
    ) {
        //Обычный контейнер, для которого можно устанавливать расположение элементов внутри его
        Box(modifier = Modifier
            .background(color.value)
            .clickable {
                when(counter.value++){
                    9->color.value = Color.Yellow
                    19->color.value = Color.Cyan
                }
            }) {
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
                    Text(text = counter.value.toString())
                }
            }
        }
    }
}