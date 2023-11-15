package com.example.navigationwithdata.ui.compenent

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.navigationwithdata.R

@Composable
fun FormatLabelHarga(subtotal: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.subtotal_price, subtotal),
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}

@Composable
fun FormatDataPemesanan(
    namaPemesanan: String,
    alamatPemesan: String,
    phonePemesan: String,
){
    Text(
        text = stringResource(R.string.nama),
    )
    Text(namaPemesanan)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))


    Text(
        text = stringResource(R.string.alamat),
    )
    Text(alamatPemesan)
    Divider()
    Spacer(modifier = Modifier.padding(10.dp))


    Text(
        text = stringResource(R.string.nomor),
    )
    Text(phonePemesan)
    Divider()


}