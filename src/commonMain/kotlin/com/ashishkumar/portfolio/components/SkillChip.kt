package com.ashishkumar.portfolio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.padding
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.web.css.CSSUnit
import com.varabyte.kobweb.compose.web.css.backgroundColor
import com.varabyte.kobweb.compose.web.css.borderRadius
import com.varabyte.kobweb.compose.web.css.color
import com.varabyte.kobweb.compose.web.css.fontSize
import com.varabyte.kobweb.compose.web.css.fontWeight
import com.varabyte.kobweb.compose.web.css.padding
import com.varabyte.kobweb.compose.web.css.px
import org.jetbrains.compose.web.css.b
import org.jetbrains.compose.web.css.textAlign
import com.ashishkumar.portfolio.style.AppColors

@Composable
fun SkillChip(
    skill: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFF3DDC84).copy(alpha = 0.15f))
            .padding(horizontal = 14.dp, vertical = 6.dp)
    ) {
        androidx.compose.foundation.layout.Row(
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            androidx.compose.foundation.layout.Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color(0xFF3DDC84))
                    .padding(horizontal = 4.dp, vertical = 0.dp)
            ) {}
            androidx.compose.foundation.layout.Spacer(
                modifier = Modifier.padding(end = 8.dp)
            )
            androidx.compose.foundation.layout.Box {
                androidx.compose.foundation.layout.Row {
                    androidx.compose.foundation.layout.Box {}
                }
            }
        }
    }
}

@Composable
fun SkillChipText(
    skill: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFF3DDC84).copy(alpha = 0.15f))
            .padding(horizontal = 14.dp, vertical = 8.dp)
    ) {
        androidx.compose.foundation.layout.Row(
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            androidx.compose.material3.Text(
                text = skill,
                color = Color(0xFF3DDC84),
                fontSize = androidx.compose.ui.unit.TextUnit(14f, androidx.compose.ui.unit.TextUnitType.Sp),
                fontWeight = androidx.compose.ui.text.font.FontWeight(500)
            )
        }
    }
}
