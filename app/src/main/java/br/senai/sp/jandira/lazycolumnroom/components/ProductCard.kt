package br.senai.sp.jandira.lazycolumnroom.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lazycolumnroom.model.Product

//comando para criar uma função de forma rápida = comp + apertar return
@Composable
fun ProductCard(it: Product) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        backgroundColor = Color.Magenta) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = "${it.id} - ${it.productName}",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = it.productDescription,
                fontSize = 12.sp
            )
            Text(
                text = "$${it.productPrice}",
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End,
                color = Color.Green
            )
        }
    }
}