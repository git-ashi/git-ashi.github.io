package com.ashishkumar.portfolio.sections

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.foundation.layout.fillMaxWidth
import com.varabyte.kobweb.compose.foundation.layout.height
import com.varabyte.kobweb.compose.foundation.layout.padding
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.text.SpanStyle
import com.varabyte.kobweb.compose.ui.text.buildSpanString
import com.varabyte.kobweb.compose.web.css.AlignContent
import com.varabyte.kobweb.compose.web.css.CSSUnit
import com.varabyte.kobweb.compose.web.css.background
import com.varabyte.kobweb.compose.web.css.borderRadius
import com.varabyte.kobweb.compose.web.css.color
import com.varabyte.kobweb.compose.web.css.display
import com.varabyte.kobweb.compose.web.css.fontSize
import com.varabyte.kobweb.compose.web.css.fontWeight
import com.varabyte.kobweb.compose.web.css.height
import com.varabyte.kobweb.compose.web.css.justifyContent
import com.varabyte.kobweb.compose.web.css.lineHeight
import com.varabyte.kobweb.compose.web.css.margin
import com.varabyte.kobweb.compose.web.css.maxWidth
import com.varabyte.kobweb.compose.web.css.padding
import com.varabyte.kobweb.compose.web.css.textAlign
import com.varabyte.kobweb.compose.web.css.width
import com.varabyte.kobweb.compose.web.elements.Div
import com.varabyte.kobweb.compose.web.elements.Span
import com.varabyte.kobweb.compose.web.elements.Text
import org.jetbrains.compose.web.css.Background
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.Display
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.Percentage
import org.jetbrains.compose.web.css.alignContent
import com.ashishkumar.portfolio.components.GlassCard
import com.ashishkumar.portfolio.style.AppColors

@Composable
fun About(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("padding") { "100px 20px" }
                property("max-width") { "900px" }
                property("margin") { "0 auto" }
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(title = "About Me")

        Spacer(modifier = Modifier.height(40.px))

        GlassCard(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = buildSpanString {
                    append("A sincere and dedicated ")
                    SpanStyle(color = Color(0xFF3DDC84)) {
                        append("Android developer")
                    }
                    append(" with ")
                    SpanStyle(color = Color(0xFF3DDC84)) {
                        append("7.5+ years")
                    }
                    append(" of experience in designing and building mobile applications. Skilled at adapting to different environments, with valuable insights into the workflows of both small startups and large corporations.")
                },
                modifier = Modifier.css {
                    property("color") { Color(0xFFB0B0B0) }
                    property("font-size") { "18px" }
                    property("line-height") { "1.8" }
                    property("text-align") { "left" }
                    property("margin") { "0" }
                }
            )

            Spacer(modifier = Modifier.height(24.px))

            Text(
                text = "Technically proficient with a strong focus on problem-solving and learning, while continuously improving interpersonal skills to complement technical expertise.",
                modifier = Modifier.css {
                    property("color") { Color(0xFFB0B0B0) }
                    property("font-size") { "18px" }
                    property("line-height") { "1.8" }
                    property("text-align") { "left" }
                    property("margin") { "0" }
                }
            )
        }
    }
}

@Composable
fun SectionTitle(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        modifier = modifier
            .css {
                property("font-size") { "36px" }
                property("font-weight") { "700" }
                property("color") { Color(0xFFFFFFFF) }
                property("margin") { "0" }
                property("position") { "relative" }
                property("display") { "inline-block" }
            }
    )
}
