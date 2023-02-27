package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LazyColumnTut : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loadUI()
        }
    }
}

@Composable
private fun loadUI() {
    //Для того, чтобы сохранять в памяти только используемые на экране элементы (как в Recycler View)
    //Используется LazyColumn
//    Box() {
//        LazyColumn(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//                .fillMaxSize()
//            //verticalScroll не нужен, т.к. он уже предусмотрен
//        ) {
//            items(count = 100) {
//                Text(
//                    text = "Item #$it",
//                    fontSize = 30.sp,
//                    modifier = Modifier.padding(vertical = 10.dp)
//                )
//            }
//        }
//    }
    Box() {
        //Если мы хотим загрузить объекты класса (в нашем случае просто строки), используем:
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
            //verticalScroll не нужен, т.к. он уже предусмотрен
        ) {
            itemsIndexed(
                listOf("String 1", "String two", "String III", " LastString")
                        //Если мы не хотим использовать переменную в такой конструкции (index, item  в нашем случае),
            //мы можем заменить её на нижнее подчёркивание
            ) { _, item ->
                Text(
                    text = item,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(vertical = 10.dp)
                )
            }
        }
    }
}
