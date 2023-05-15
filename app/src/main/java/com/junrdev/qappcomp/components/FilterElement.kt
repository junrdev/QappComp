package com.junrdev.qappcomp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FilterElement(modifier: Modifier = Modifier, filterText: String, onclick: () -> Unit={}) {

    Surface(
        modifier = modifier
            .padding(12.dp)
            .clickable { onclick() },
        shape = CircleShape.copy(CornerSize(10.dp)),
        shadowElevation = 5.dp
    ) {
        Text(
            text = filterText, modifier = Modifier
                .padding(12.dp),
            style = TextStyle(textAlign = TextAlign.Center, fontFamily = FontFamily.SansSerif, fontSize = 15.sp)
        )
    }
}
