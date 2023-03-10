package com.example.composetutorial.neco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composetutorial.R
import com.example.composetutorial.ui.theme.Gray700

//Шаблон
class LazyRowTut : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loadUI()
        }
    }
}

@Composable
private fun loadUI() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(Gray700)
    ) {
        itemsIndexed(
            listOf(
                ItemRowModel(R.drawable.android, "Android", "Sample"),
                ItemRowModel(R.drawable.blue_dog, "Blue dog", "Sample"),
                ItemRowModel(R.drawable.helghan, "Helghan", "Sample"),
                ItemRowModel(R.drawable.pavel, "Pasha", "Sample"),
                ItemRowModel(R.drawable.short_dog, "FRoG", "Sample"),
                ItemRowModel(R.drawable.android, "Android", "Sample"),
                ItemRowModel(R.drawable.blue_dog, "Blue dog", "Sample"),
                ItemRowModel(R.drawable.helghan, "Helghan", "Sample"),
                ItemRowModel(R.drawable.pavel, "Pasha", "Sample"),
                ItemRowModel(R.drawable.short_dog, "FRoG", "Sample"),
                ItemRowModel(R.drawable.android, "Android", "Sample"),
                ItemRowModel(R.drawable.blue_dog, "Blue dog", "Sample"),
                ItemRowModel(R.drawable.helghan, "Helghan", "Sample"),
                ItemRowModel(R.drawable.pavel, "Pasha", "Sample"),
                ItemRowModel(R.drawable.short_dog, "FRoG", "Sample"),
                ItemRowModel(R.drawable.android, "Android", "Sample"),
                ItemRowModel(R.drawable.blue_dog, "Blue dog", "Sample"),
                ItemRowModel(R.drawable.helghan, "Helghan", "Sample"),
                ItemRowModel(R.drawable.pavel, "Pasha", "Sample"),
                ItemRowModel(R.drawable.short_dog, "FRoG", "Sample"),
            )
        ) { _, item ->
            ComposableFuncForLazyColumn(item = item)
        }
    }
}