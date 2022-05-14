/*
* Copyright (C) 2022 Stanislav Georgiev
* https://github.com/slaviboy
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.slaviboy.iconscompose

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.onSizeChanged
import com.slaviboy.svgpathcompose.SvgPath

@Composable
fun Icon(
    modifier: Modifier = Modifier,
    iconType: IconType = IconType.HomeRR(),
    color: Color = Color.Transparent,
    brush: Brush = Brush.horizontalGradient(
        0f to (if (color == Color.Transparent) Color.White else color),
        1f to (if (color == Color.Transparent) Color.White else color)
    ),
    alpha: Float = 1.0f
) {
    var svgPath by remember {
        mutableStateOf(SvgPath(iconType.pathData, 0f, 0f))
    }
    var path by remember {
        mutableStateOf(Path())
    }

    Canvas(
        modifier = modifier
            .onSizeChanged {
                svgPath = SvgPath(iconType.pathData, it.width.toFloat(), it.height.toFloat())
                path = svgPath.generatePath(path)
            }
    ) {
        drawPath(
            path = path,
            brush = brush,
            alpha = alpha
        )
    }
}