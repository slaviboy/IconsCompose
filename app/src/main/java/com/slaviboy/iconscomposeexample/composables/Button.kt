package com.slaviboy.iconscomposeexample.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.slaviboy.iconscompose.Icon
import com.slaviboy.iconscompose.IconType

@Composable
fun ButtonExample() {
    Button(
        modifier = Modifier
            .width(150.dp)
            .height(40.dp),
        shape = RoundedCornerShape(50.dp),
        onClick = {
        },
        contentPadding = PaddingValues(
            start = 5.dp,
            end = 5.dp
        ),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFF0762f5),
            contentColor = Color.White
        )
    ) {
        Icon(
            modifier = Modifier
                .width(15.dp)
                .height(15.dp),
            iconType = IconType.HomeRR(),
        )
        Spacer(Modifier.width(10.dp))
        Text(
            text = "Home",
            fontSize = 15.sp
        )
    }
}