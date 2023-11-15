package com.example.navigationwithdata

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HalamanForm(
    onSubmitButtonClicked: (MutableList<String>) -> Unit
){
    var namaTxt by remember { mutableStateOf("")}
    var alamatTxt by remember { mutableStateOf("")}
    var tlpnTxt by remember { mutableStateOf("")}

    var listData: MutableList<String> = mutableListOf(namaTxt,alamatTxt,tlpnTxt)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ){

    }

}