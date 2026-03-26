package com.ashishkumar.portfolio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.foundation.layout.fillMaxWidth
import com.varabyte.kobweb.compose.foundation.layout.height
import com.varabyte.kobweb.compose.foundation.layout.padding
import com.varabyte.kobweb.compose.foundation.layout.size
import com.varabyte.kobweb.compose.foundation.layout.width
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.luminance
import com.varabyte.kobweb.compose.ui.text.font.FontWeight
import com.varabyte.kobweb.compose.web.css.CSSUnit
import com.varabyte.kobweb.compose.web.css.backgroundColor
import com.varabyte.kobweb.compose.web.css.borderRadius
import com.varabyte.kobweb.compose.web.css.color
import com.varabyte.kobweb.compose.web.css.cursor
import com.varabyte.kobweb.compose.web.css.display
import com.varabyte.kobweb.compose.web.css.fontSize
import com.varabyte.kobweb.compose.web.css.fontWeight
import com.varabyte.kobweb.compose.web.css.height
import com.varabyte.kobweb.compose.web.css.lineHeight
import com.varabyte.kobweb.compose.web.css.margin
import com.varabyte.kobweb.compose.web.css.overflow
import com.varabyte.kobweb.compose.web.css.padding
import com.varabyte.kobweb.compose.web.css.px
import com.varabyte.kobweb.compose.web.css.textDecoration
import com.varabyte.kobweb.compose.web.css.textOverflow
import com.varabyte.kobweb.compose.web.css.width
import com.varabyte.kobweb.compose.web.elements.A
import com.varabyte.kobweb.compose.web.elements.Span
import com.varabyte.kobweb.compose.web.elements.Text
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.textDecoration
import com.ashishkumar.portfolio.style.AppColors
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.top
import org.jetbrains.compose.web.css.left
import org.jetbrains.compose.web.css.position

@Composable
fun ProjectCard(
    title: String,
    description: String,
    link: String?,
    bullets: List<String> = emptyList(),
    modifier: Modifier = Modifier
) {
    val cardModifier = modifier
        .width(350.px)
        .padding(0.px)
        .css {
            property("background-color") { Color.argb(a = 0.08f, r = 255, g = 255, b = 255) }
            property("border") { "1px solid rgba(255, 255, 255, 0.15)" }
            property("border-radius") { "16px" }
            property("padding") { "24px" }
            property("transition") { "all 0.3s ease" }
            property("overflow") { "hidden" }
            property("position") { "relative" }
        }

    Column(modifier = cardModifier) {
        if (link != null) {
            A(
                href = link,
                target = "_blank",
                rel = "noopener noreferrer",
                modifier = Modifier
                    .css {
                        property("text-decoration") { "none" }
                    }
            ) {
                Row(
                    modifier = Modifier.css {
                        property("align-items") { "center" }
                        property("gap") { "8px" }
                    },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = title,
                        modifier = Modifier
                            .css {
                                property("color") { Color(0xFFFFFFFF) }
                                property("font-size") { "20px" }
                                property("font-weight") { "600" }
                                property("margin") { "0" }
                            }
                    )
                    Span(
                        modifier = Modifier.css {
                            property("color") { Color(0xFF3DDC84) }
                            property("font-size") { "12px" }
                            property("margin-left") { "8px" }
                        }
                    ) {
                        Text("↗")
                    }
                }
            }
        } else {
            Text(
                text = title,
                modifier = Modifier
                    .css {
                        property("color") { Color(0xFFFFFFFF) }
                        property("font-size") { "20px" }
                        property("font-weight") { "600" }
                        property("margin") { "0" }
                    }
            )
        }

        Spacer(modifier = Modifier.height(12.px))

        Text(
            text = description,
            modifier = Modifier
                .css {
                    property("color") { Color(0xFFB0B0B0) }
                    property("font-size") { "14px" }
                    property("line-height") { "1.6" }
                    property("margin") { "0" }
                }
        )

        if (bullets.isNotEmpty()) {
            Spacer(modifier = Modifier.height(16.px))
            bullets.forEach { bullet ->
                Row(
                    modifier = Modifier.css {
                        property("align-items") { "flex-start" }
                        property("margin-bottom") { "8px" }
                    }
                ) {
                    Box(
                        modifier = Modifier
                            .css {
                                property("width") { "6px" }
                                property("height") { "6px" }
                                property("background-color") { Color(0xFF3DDC84) }
                                property("border-radius") { "50%" }
                                property("margin-top") { "8px" }
                                property("margin-right") { "10px" }
                                property("flex-shrink") { "0" }
                            }
                    ) {}
                    Text(
                        text = bullet,
                        modifier = Modifier
                            .css {
                                property("color") { Color(0xFFB0B0B0) }
                                property("font-size") { "13px" }
                                property("line-height") { "1.5" }
                                property("margin") { "0" }
                            }
                    )
                }
            }
        }
    }
}
