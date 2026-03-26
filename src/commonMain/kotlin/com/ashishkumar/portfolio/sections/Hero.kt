package com.ashishkumar.portfolio.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.foundation.layout.fillMaxWidth
import com.varabyte.kobweb.compose.foundation.layout.height
import com.varabyte.kobweb.compose.foundation.layout.padding
import com.varabyte.kobweb.compose.foundation.layout.width
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.text.SpanStyle
import com.varabyte.kobweb.compose.ui.text.buildSpanString
import com.varabyte.kobweb.compose.ui.text.font.FontWeight
import com.varabyte.kobweb.compose.ui.text.style.TextAlign
import com.varabyte.kobweb.compose.web.css.AlignContent
import com.varabyte.kobweb.compose.web.css.CSSUnit
import com.varabyte.kobweb.compose.web.css.JustifyContent
import com.varabyte.kobweb.compose.web.css.background
import com.varabyte.kobweb.compose.web.css.backgroundImage
import com.varabyte.kobweb.compose.web.css.borderRadius
import com.varabyte.kobweb.compose.web.css.boxSizing
import com.varabyte.kobweb.compose.web.css.color
import com.varabyte.kobweb.compose.web.css.display
import com.varabyte.kobweb.compose.web.css.fontSize
import com.varabyte.kobweb.compose.web.css.fontWeight
import com.varabyte.kobweb.compose.web.css.height
import com.varabyte.kobweb.compose.web.css.justifyContent
import com.varabyte.kobweb.compose.web.css.letterSpacing
import com.varabyte.kobweb.compose.web.css.lineHeight
import com.varabyte.kobweb.compose.web.css.margin
import com.varabyte.kobweb.compose.web.css.minHeight
import com.varabyte.kobweb.compose.web.css.padding
import com.varabyte.kobweb.compose.web.css.textAlign
import com.varabyte.kobweb.compose.web.css.width
import com.varabyte.kobweb.compose.web.elements.A
import com.varabyte.kobweb.compose.web.elements.Button
import com.varabyte.kobweb.compose.web.elements.Div
import com.varabyte.kobweb.compose.web.elements.Span
import com.varabyte.kobweb.compose.web.elements.Text
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.BackgroundImage
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LinearGradient
import org.jetbrains.compose.web.css.Percentage
import org.jetbrains.compose.web.css.Stop
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.linearGradient
import org.jetbrains.compose.web.css.overflow
import org.jetbrains.compose.web.css.position
import org.jetbrains.compose.web.css.textAlign
import com.ashishkumar.portfolio.style.AppColors

@Composable
fun Hero(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("min-height") { "100vh" }
                property("display") { "flex" }
                property("flex-direction") { "column" }
                property("justify-content") { "center" }
                property("align-items") { "center" }
                property("text-align") { "center" }
                property("padding") { "80px 20px" }
                property("position") { "relative" }
                property("background") {
                    linearGradient(
                        0.toPercent() to Color.rgb(r = 0, g = 0, b = 0),
                        50.toPercent() to Color.rgb(r = 10, g = 10, b = 20),
                        100.toPercent() to Color.rgb(r = 0, g = 0, b = 0)
                    )
                }
            },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = buildSpanString {
                append("Hi, I'm ")
                SpanStyle(color = Color(0xFF3DDC84)) {
                    append("Ashish Kumar")
                }
            },
            modifier = Modifier
                .css {
                    property("font-size") { "56px" }
                    property("font-weight") { "700" }
                    property("color") { Color(0xFFFFFFFF) }
                    property("margin") { "0 0 16px 0" }
                    property("line-height") { "1.2" }
                }
        )

        Text(
            text = "Android Developer • 7.5+ Years Experience",
            modifier = Modifier
                .css {
                    property("font-size") { "24px" }
                    property("font-weight") { "400" }
                    property("color") { Color(0xFFB0B0B0) }
                    property("margin") { "0 0 32px 0" }
                    property("letter-spacing") { "1px" }
                }
        )

        Text(
            text = "Building exceptional mobile experiences with Kotlin & Flutter",
            modifier = Modifier
                .css {
                    property("font-size") { "18px" }
                    property("font-weight") { "300" }
                    property("color") { Color(0xFF808080) }
                    property("margin") { "0 0 48px 0" }
                    property("max-width") { "600px" }
                    property("line-height") { "1.6" }
                }
        )

        Row(
            modifier = Modifier.css {
                property("gap") { "16px" }
                property("flex-wrap") { "wrap" }
                property("justify-content") { "center" }
            }
        ) {
            A(
                href = "#projects",
                modifier = Modifier
                    .css {
                        property("display") { "inline-block" }
                        property("padding") { "14px 32px" }
                        property("background-color") { Color(0xFF3DDC84) }
                        property("color") { Color(0xFF000000) }
                        property("border-radius") { "8px" }
                        property("font-weight") { "600" }
                        property("font-size") { "16px" }
                        property("text-decoration") { "none" }
                        property("transition") { "all 0.3s ease" }
                        property("cursor") { "pointer" }
                    }
            ) {
                Text("View Projects")
            }

            A(
                href = "/resume.pdf",
                modifier = Modifier
                    .css {
                        property("display") { "inline-block" }
                        property("padding") { "14px 32px" }
                        property("background-color") { "transparent" }
                        property("color") { Color(0xFF3DDC84) }
                        property("border") { "2px solid #3DDC84" }
                        property("border-radius") { "8px" }
                        property("font-weight") { "600" }
                        property("font-size") { "16px" }
                        property("text-decoration") { "none" }
                        property("transition") { "all 0.3s ease" }
                        property("cursor") { "pointer" }
                    }
            ) {
                Text("Download Resume")
            }
        }
    }
}
