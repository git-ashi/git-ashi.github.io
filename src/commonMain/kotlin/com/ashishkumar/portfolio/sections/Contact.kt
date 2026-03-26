package com.ashishkumar.portfolio.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.varabyte.kobweb.compose.web.css.AlignItems
import com.varabyte.kobweb.compose.web.css.BackgroundColor
import com.varabyte.kobweb.compose.web.css.BoxSizing
import com.varabyte.kobweb.compose.web.css.CSSUnit
import com.varabyte.kobweb.compose.web.css.Color
import com.varabyte.kobweb.compose.web.css.Display
import com.varabyte.kobweb.compose.web.css.FlexDirection
import com.varabyte.kobweb.compose.web.css.FlexWrap
import com.varabyte.kobweb.compose.web.css.AlignContent
import com.varabyte.kobweb.compose.web.css.alignItems
import com.varabyte.kobweb.compose.web.css.backgroundColor
import com.varabyte.kobweb.compose.web.css.border
import com.varabyte.kobweb.compose.web.css.borderRadius
import com.varabyte.kobweb.compose.web.css.boxSizing
import com.varabyte.kobweb.compose.web.css.color
import com.varabyte.kobweb.compose.web.css.display
import com.varabyte.kobweb.compose.web.css.flexDirection
import com.varabyte.kobweb.compose.web.css.flexWrap
import com.varabyte.kobweb.compose.web.css.fontSize
import com.varabyte.kobweb.compose.web.css.fontWeight
import com.varabyte.kobweb.compose.web.css.gap
import com.varabyte.kobweb.compose.web.css.height
import com.varabyte.kobweb.compose.web.css.justifyContent
import com.varabyte.kobweb.compose.web.css.lineHeight
import com.varabyte.kobweb.compose.web.css.margin
import com.varabyte.kobweb.compose.web.css.padding
import com.varabyte.kobweb.compose.web.css.textAlign
import com.varabyte.kobweb.compose.web.css.textDecoration
import com.varabyte.kobweb.compose.web.css.transition
import com.varabyte.kobweb.compose.web.css.width
import com.varabyte.kobweb.compose.web.elements.A
import com.varabyte.kobweb.compose.web.elements.Div
import com.varabyte.kobweb.compose.web.elements.Span
import com.varabyte.kobweb.compose.web.elements.Text
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s
import com.ashishkumar.portfolio.components.GlassCard
import com.ashishkumar.portfolio.style.AppColors

@Composable
fun Contact(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("padding") { "100px 20px" }
                property("max-width") { "800px" }
                property("margin") { "0 auto" }
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(title = "Get In Touch")

        Spacer(modifier = Modifier.height(40.px))

        GlassCard(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.css {
                    property("display") { "flex" }
                    property("flex-direction") { "column" }
                    property("gap") { "24px" }
                }
            ) {
                ContactItem(
                    icon = "📧",
                    label = "Email",
                    value = "ashishk17395@gmail.com",
                    link = "mailto:ashishk17395@gmail.com"
                )
                
                ContactItem(
                    icon = "📱",
                    label = "Phone",
                    value = "9996869554",
                    link = "tel:9996869554"
                )
                
                ContactItem(
                    icon = "💼",
                    label = "LinkedIn",
                    value = "Connect with me",
                    link = "https://linkedin.com/in/ashishkumar"
                )
            }
        }

        Spacer(modifier = Modifier.height(40.px))

        A(
            href = "/resume.pdf",
            modifier = Modifier
                .css {
                    property("display") { "inline-block" }
                    property("padding") { "16px 40px" }
                    property("background-color") { Color(0xFF3DDC84) }
                    property("color") { Color(0xFF000000) }
                    property("border-radius") { "8px" }
                    property("font-weight") { "600" }
                    property("font-size") { "16px" }
                    property("text-decoration") { "none" }
                    property("transition") { "all 0.3s ease" }
                }
        ) {
            Text("Download Resume")
        }
    }
}

@Composable
fun ContactItem(
    icon: String,
    label: String,
    value: String,
    link: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("align-items") { "center" }
                property("gap") { "16px" }
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Span(
            modifier = Modifier.css {
                property("font-size") { "24px" }
                property("width") { "40px" }
                property("text-align") { "center" }
            }
        ) {
            Text(icon)
        }
        
        Column(
            modifier = Modifier.css {
                property("flex") { "1" }
            }
        ) {
            Text(
                text = label,
                modifier = Modifier.css {
                    property("color") { Color(0xFF808080) }
                    property("font-size") { "12px" }
                    property("text-transform") { "uppercase" }
                    property("letter-spacing") { "1px" }
                    property("margin") { "0" }
                }
            )
            A(
                href = link,
                modifier = Modifier.css {
                    property("color") { Color(0xFFFFFFFF) }
                    property("font-size") { "16px" }
                    property("text-decoration") { "none" }
                    property("transition") { "color 0.3s ease" }
                }
            ) {
                Text(value)
            }
        }
    }
}
