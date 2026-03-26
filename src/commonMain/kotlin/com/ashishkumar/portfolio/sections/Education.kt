package com.ashishkumar.portfolio.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.varabyte.kobweb.compose.web.css.alignItems
import com.varabyte.kobweb.compose.web.css.backgroundColor
import com.varabyte.kobweb.compose.web.css.border
import com.varabyte.kobweb.compose.web.css.borderRadius
import com.varabyte.kobweb.compose.web.css.boxSizing
import com.varabyte.kobweb.compose.web.css.color
import com.varabyte.kobweb.compose.web.css.display
import com.varabyte.kobweb.compose.web.css.flexDirection
import com.varabyte.kobweb.compose.web.css.fontSize
import com.varabyte.kobweb.compose.web.css.fontWeight
import com.varabyte.kobweb.compose.web.css.height
import com.varabyte.kobweb.compose.web.css.justifyContent
import com.varabyte.kobweb.compose.web.css.left
import com.varabyte.kobweb.compose.web.css.lineHeight
import com.varabyte.kobweb.compose.web.css.margin
import com.varabyte.kobweb.compose.web.css.padding
import com.varabyte.kobweb.compose.web.css.position
import com.varabyte.kobweb.compose.web.css.top
import com.varabyte.kobweb.compose.web.css.width
import com.varabyte.kobweb.compose.web.elements.Div
import com.varabyte.kobweb.compose.web.elements.Span
import com.varabyte.kobweb.compose.web.elements.Text
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import com.ashishkumar.portfolio.components.GlassCard
import com.ashishkumar.portfolio.style.AppColors

data class Education(
    val school: String,
    val board: String,
    val degree: String,
    val year: String
)

@Composable
fun Education(modifier: Modifier = Modifier) {
    val educationList = listOf(
        Education(
            school = "Radaur",
            board = "RJPIEMIT",
            degree = "B.Tech Computer Science Engineering",
            year = "2017"
        ),
        Education(
            school = "Ambala Cantt",
            board = "Kendriya Vidyalaya No. 2",
            degree = "AISSCE (All India Senior Secondary Certificate Examination)",
            year = "2012"
        ),
        Education(
            school = "Ambala Cantt",
            board = "Kendriya Vidyalaya No. 2",
            degree = "AISSE (All India Secondary School Examination)",
            year = "2010"
        )
    )

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
        SectionTitle(title = "Education")

        Spacer(modifier = Modifier.height(40.px))

        educationList.forEachIndexed { index, edu ->
            EducationCard(education = edu)
            if (index < educationList.lastIndex) {
                Spacer(modifier = Modifier.height(16.px))
            }
        }
    }
}

@Composable
fun EducationCard(education: Education, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("display") { "flex" }
                property("gap") { "20px" }
            }
    ) {
        Column(
            modifier = Modifier.css {
                property("display") { "flex" }
                property("flex-direction") { "column" }
                property("align-items") { "center" }
            }
        ) {
            Box(
                modifier = Modifier.css {
                    property("width") { "16px" }
                    property("height") { "16px" }
                    property("background-color") { Color(0xFF3DDC84) }
                    property("border-radius") { "50%" }
                    property("border") { "3px solid #1A1A1A" }
                }
            ) {}
            if (education != null) {
                Box(
                    modifier = Modifier.css {
                        property("width") { "2px" }
                        property("flex") { "1" }
                        property("min-height") { "60px" }
                        property("background-color") { Color(0xFF3DDC84).copy(alpha = 0.3f) }
                    }
                ) {}
            }
        }

        GlassCard(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Row(
                    modifier = Modifier.css {
                        property("justify-content") { "space-between" }
                        property("align-items") { "flex-start" }
                        property("flex-wrap") { "wrap" }
                        property("gap") { "8px" }
                    }
                ) {
                    Column {
                        Text(
                            text = education.degree,
                            modifier = Modifier.css {
                                property("color") { Color(0xFFFFFFFF) }
                                property("font-size") { "18px" }
                                property("font-weight") { "600" }
                                property("margin") { "0" }
                            }
                        )
                        Text(
                            text = education.board,
                            modifier = Modifier.css {
                                property("color") { Color(0xFF3DDC84) }
                                property("font-size") { "14px" }
                                property("font-weight") { "500" }
                                property("margin") { "4px 0 0 0" }
                            }
                        )
                    }
                    Text(
                        text = education.year,
                        modifier = Modifier.css {
                            property("color") { Color(0xFFB0B0B0) }
                            property("font-size") { "16px" }
                            property("font-weight") { "500" }
                        }
                    )
                }
                Text(
                    text = education.school,
                    modifier = Modifier.css {
                        property("color") { Color(0xFF808080) }
                        property("font-size") { "14px" }
                        property("margin") { "8px 0 0 0" }
                    }
                )
            }
        }
    }
}

@Composable
private fun Box(modifier: Modifier) {
    Div(modifier = modifier)
}
