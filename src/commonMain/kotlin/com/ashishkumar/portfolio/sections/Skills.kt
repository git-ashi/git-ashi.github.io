package com.ashishkumar.portfolio.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
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
import com.varabyte.kobweb.compose.web.css.CSSUnit
import com.varabyte.kobweb.compose.web.css.Color
import com.varabyte.kobweb.compose.web.css.Display
import com.varabyte.kobweb.compose.web.css.FlexWrap
import com.varabyte.kobweb.compose.web.css.alignItems
import com.varabyte.kobweb.compose.web.css.display
import com.varabyte.kobweb.compose.web.css.flexWrap
import com.varabyte.kobweb.compose.web.css.fontSize
import com.varabyte.kobweb.compose.web.css.fontWeight
import com.varabyte.kobweb.compose.web.css.gap
import com.varabyte.kobweb.compose.web.css.gridTemplateColumns
import com.varabyte.kobweb.compose.web.css.justifyContent
import com.varabyte.kobweb.compose.web.css.padding
import com.varabyte.kobweb.compose.web.css.width
import com.varabyte.kobweb.compose.web.elements.Div
import com.varabyte.kobweb.compose.web.elements.Span
import com.varabyte.kobweb.compose.web.elements.Text
import org.jetbrains.compose.web.css.px
import com.ashishkumar.portfolio.components.GlassCard
import com.ashishkumar.portfolio.components.SkillChipText
import com.ashishkumar.portfolio.style.AppColors

data class SkillCategory(
    val title: String,
    val skills: List<String>
)

@Composable
fun Skills(modifier: Modifier = Modifier) {
    val skillCategories = listOf(
        SkillCategory(
            title = "Languages",
            skills = listOf("Kotlin", "Java", "Dart", "Python", "C#", "C++", "C")
        ),
        SkillCategory(
            title = "Mobile",
            skills = listOf("Android SDK", "Flutter")
        ),
        SkillCategory(
            title = "Architecture",
            skills = listOf("MVVM", "MVP", "Clean Architecture")
        ),
        SkillCategory(
            title = "Backend",
            skills = listOf("GraphQL", "REST APIs")
        ),
        SkillCategory(
            title = "Database",
            skills = listOf("Room", "SQLite", "Firebase")
        ),
        SkillCategory(
            title = "Libraries",
            skills = listOf("Retrofit", "Dagger", "Koin", "Coroutines", "RxJava")
        ),
        SkillCategory(
            title = "Tools",
            skills = listOf("Git", "Firebase", "CI/CD", "JIRA", "Fastlane")
        ),
        SkillCategory(
            title = "Analytics",
            skills = listOf("Firebase Analytics", "Snowplow", "Datadog", "LogRocket")
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
        SectionTitle(title = "Skills")

        Spacer(modifier = Modifier.height(40.px))

        Column(
            modifier = Modifier.css {
                property("display") { "grid" }
                property("grid-template-columns") { "repeat(auto-fit, minmax(280px, 1fr))" }
                property("gap") { "20px" }
                property("width") { "100%" }
            }
        ) {
            skillCategories.forEach { category ->
                GlassCard(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = category.title,
                        modifier = Modifier.css {
                            property("color") { Color(0xFF3DDC84) }
                            property("font-size") { "16px" }
                            property("font-weight") { "600" }
                            property("margin") { "0 0 12px 0" }
                        }
                    )
                    Column(
                        modifier = Modifier.css {
                            property("display") { "flex" }
                            property("flex-wrap") { "wrap" }
                            property("gap") { "8px" }
                        }
                    ) {
                        category.skills.forEach { skill ->
                            SkillChipText(skill = skill)
                        }
                    }
                }
            }
        }
    }
}
