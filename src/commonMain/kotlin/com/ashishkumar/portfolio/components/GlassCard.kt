package com.ashishkumar.portfolio.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifier.then
import com.varabyte.kobweb.compose.web.css.CSSProperties
import com.varabyte.kobweb.compose.web.css.CSSStyleRule
import com.varabyte.kobweb.compose.web.css.Element
import com.varabyte.kobweb.compose.web.css.addClass
import com.varabyte.kobweb.compose.web.css.addStyles
import com.varabyte.kobweb.compose.web.css.c
import com.varabyte.kobweb.compose.web.elements.Div
import com.varabyte.kobweb.silk.style.CssClass
import com.varabyte.kobweb.silk.style.Style
import com.varabyte.kobweb.silk.style.addVariant
import com.varabyte.kobweb.silk.style.css
import com.varabyte.kobweb.silk.style.modifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.boxShadow
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.filter
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.transition
import com.varabyte.kobweb.compose.ui.graphics.Color as ComposeColor
import com.ashishkumar.portfolio.style.GlassStyles
import com.ashishkumar.portfolio.style.AppColors

object GlassCardStyles {
    val base = Style {
        Modifier
            .backgroundColor(Color.argb(a = 0.08f, r = 255, g = 255, b = 255))
            .border(
                width = 1.px,
                style = org.jetbrains.compose.web.css.LineStyle.Solid,
                color = Color.argb(a = 0.15f, r = 255, g = 255, b = 255)
            )
            .borderRadius(16.px)
            .padding(24.px)
    }

    val hover = base.addVariant {
        Modifier
            .backgroundColor(Color.argb(a = 0.12f, r = 255, g = 255, b = 255))
            .border(
                width = 1.px,
                style = org.jetbrains.compose.web.css.LineStyle.Solid,
                color = Color.argb(a = 0.3f, r = 61, g = 220, b = 132)
            )
    }
}

@Composable
fun GlassCard(
    modifier: Modifier = Modifier,
    hoverable: Boolean = true,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .css(GlassCardStyles.base)
    ) {
        content()
    }
}
