package com.example.myfirstapp.jetpackcompose.C_12Scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyScreen () {
    Scaffold(
        topBar = { AppTopbar() },
        bottomBar = { AppBottomBar() },
        floatingActionButton = { FAB() }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
                .padding(vertical = 16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            for(i in 1..15){
                MyScreenContent()
            }
        }
//        LazyColumn(
//            modifier = Modifier.fillMaxSize()
//                .padding(innerPadding)
//                .padding(vertical = 16.dp),
//            verticalArrangement = Arrangement.spacedBy(16.dp)
//        ) {
//            items(15) {
//                MyScreenContent()
//            }
//        }
    }
}