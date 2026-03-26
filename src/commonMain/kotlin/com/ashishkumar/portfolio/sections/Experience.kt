package com.ashishkumar.portfolio.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
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
import com.varabyte.kobweb.compose.web.css.AlignItems
import com.varabyte.kobweb.compose.web.css.BackgroundColor
import com.varabyte.kobweb.compose.web.css.BoxSizing
import com.varabyte.kobweb.compose.web.css.CSSUnit
import com.varabyte.kobweb.compose.web.css.Color
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
import com.varabyte.kobweb.compose.web.elements.Column
import com.varabyte.kobweb.compose.web.elements.Div
import com.varabyte.kobweb.compose.web.elements.Span
import com.varabyte.kobweb.compose.web.elements.Text
import com.varabyte.kobweb.compose.web.elements.Ul
import com.varabyte.kobweb.compose.web.elements.Li
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import com.ashishkumar.portfolio.components.GlassCard
import com.ashishkumar.portfolio.style.AppColors

data class Experience(
    val company: String,
    val role: String,
    val duration: String,
    val location: String,
    val bullets: List<String>
)

@Composable
fun Experience(modifier: Modifier = Modifier) {
    val experiences = listOf(
        Experience(
            company = "Horigine Consulting",
            role = "Android Application Developer",
            duration = "May 2024 - Dec 2024",
            location = "Bengaluru, Karnataka",
            bullets = listOf(
                "Developed key features for the Walmart app, including social proofing badges to promote Protection Plans and options for managing item replacements.",
                "Enhanced testing reliability by writing test cases in R2 and utilizing Appium 2.0 for Android automation."
            )
        ),
        Experience(
            company = "TechAhead",
            role = "Associate Tech Lead",
            duration = "Jan 2017 - Apr 2021, Aug 2021 - Feb 2024",
            location = "Noida, Delhi NCR",
            bullets = listOf(
                "Continuous coordination with offsite team to build and maintain android app.",
                "App development in Kotlin and Java, using MVVM, MVP architectures.",
                "Apps with excellent exposure in Ecommerce, Social Media and Fitness.",
                "Applications with Google Map Integration, location services, Social Auth, REST web Services, FCM, Retrofit, SQLite, Room Database, Material Design, Koin and Dagger.",
                "App development on multiple platforms (Android and iOS) using Flutter.",
                "Well versed in processes like Scrum, Kanban and other dev tools like CI/CD, Analytics etc."
            )
        )
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("padding") { "100px 20px" }
                property("max-width") { "1000px" }
                property("margin") { "0 auto" }
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(title = "Experience")

        Spacer(modifier = Modifier.height(40.px))

        experiences.forEachIndexed { index, exp ->
            ExperienceCard(experience = exp)
            if (index < experiences.lastIndex) {
                Spacer(modifier = Modifier.height(24.px))
            }
        }
    }
}

@Composable
fun ExperienceCard(experience: Experience, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("display") { "flex" }
                property("gap") { "24px" }
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
                modifier = Modifier
                    .css {
                        property("width") { "16px" }
                        property("height") { "16px" }
                        property("background-color") { Color(0xFF3DDC84) }
                        property("border-radius") { "50%" }
                        property("border") { "3px solid #1A1A1A" }
                    }
            ) {}
            Box(
                modifier = Modifier
                    .css {
                        property("width") { "2px" }
                        property("flex") { "1" }
                        property("min-height") { "100px" }
                        property("background-color") { Color(0xFF3DDC84).copy(alpha = 0.3f) }
                    }
            ) {}
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
                            text = experience.company,
                            modifier = Modifier.css {
                                property("color") { Color(0xFFFFFFFF) }
                                property("font-size") { "22px" }
                                property("font-weight") { "700" }
                                property("margin") { "0" }
                            }
                        )
                        Text(
                            text = experience.role,
                            modifier = Modifier.css {
                                property("color") { Color(0xFF3DDC84) }
                                property("font-size") { "16px" }
                                property("font-weight") { "500" }
                                property("margin") { "4px 0 0 0" }
                            }
                        )
                    }
                    Column(
                        modifier = Modifier.css {
                            property("text-align") { "right" }
                        }
                    ) {
                        Text(
                            text = experience.duration,
                            modifier = Modifier.css {
                                property("color") { Color(0xFFFFFFFF) }
                                property("font-size") { "14px" }
                                property("font-weight") { "500" }
                                property("margin") { "0" }
                            }
                        )
                        Text(
                            text = experience.location,
                            modifier = Modifier.css {
                                property("color") { Color(0xFF808080) }
                                property("font-size") { "14px" }
                                property("margin") { "4px 0 0 0" }
                            }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.px))

                experience.bullets.forEach { bullet ->
                    Row(
                        modifier = Modifier.css {
                            property("align-items") { "flex-start" }
                            property("margin-bottom") { "10px" }
                        }
                    ) {
                        Box(
                            modifier = Modifier.css {
                                property("width") { "6px" }
                                property("height") { "6px" }
                                property("background-color") { Color(0xFF3DDC84) }
                                property("border-radius") { "50%" }
                                property("margin-top") { "8px" }
                                property("margin-right") { "12px" }
                                property("flex-shrink") { "0" }
                            }
                        ) {}
                        Text(
                            text = bullet,
                            modifier = Modifier.css {
                                property("color") { Color(0xFFB0B0B0) }
                                property("font-size") { "14px" }
                                property("line-height") { "1.6" }
                                property("margin") { "0" }
                            }
                        )
                    }
                }
            }
        }
    }
}
