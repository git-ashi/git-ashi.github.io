package com.ashishkumar.portfolio.style

import com.varabyte.kobweb.compose.css.CSSBuilder
import com.varabyte.kobweb.compose.css.BackdropFilter
import com.varabyte.kobweb.compose.css.Blur
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.transition
import com.varabyte.kobweb.compose.ui.css.CSSUnit
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.luminance
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

object GlassStyles {
    val glassCard = CSSBuilder {
        backgroundColor = Color.argb(a = 0.08f, r = 255, g = 255, b = 255)
        backdropFilter = BackdropFilter.Blur(15.px)
        border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Color.argb(a = 0.15f, r = 255, g = 255, b = 255)
        )
        borderRadius = 16.px
        boxShadow(
            offsetX = 0.px,
            offsetY = 4.px,
            blurRadius = 30.px,
            color = Color.argb(a = 0.3f, r = 0, g = 0, b = 0)
        )
    }

    val glassCardHover = CSSBuilder {
        backgroundColor = Color.argb(a = 0.12f, r = 255, g = 255, b = 255)
        border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Color.argb(a = 0.25f, r = 61, g = 220, b = 132)
        )
        transition(
            property = "all",
            duration = 300.ms
        )
    }

    val glassButton = CSSBuilder {
        backgroundColor = Color(0xFF3DDC84)
        color = Color(0xFF000000)
        borderRadius = 8.px
        padding(12.px, 24.px)
        fontWeight = 600
        cursor = "pointer"
        transition(
            property = "all",
            duration = 200.ms
        )
    }

    val glassButtonHover = CSSBuilder {
        backgroundColor = Color(0xFF5AED9E)
        transform("scale(1.02)")
    }

    val glassOutlineButton = CSSBuilder {
        backgroundColor = Color.argb(a = 0f, r = 255, g = 255, b = 255)
        color = Color(0xFF3DDC84)
        border(
            width = 2.px,
            style = LineStyle.Solid,
            color = Color(0xFF3DDC84)
        )
        borderRadius = 8.px
        padding(12.px, 24.px)
        fontWeight = 600
        cursor = "pointer"
        transition(
            property = "all",
            duration = 200.ms
        )
    }
}
