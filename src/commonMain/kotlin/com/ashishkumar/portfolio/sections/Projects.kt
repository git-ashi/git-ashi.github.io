package com.ashishkumar.portfolio.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import com.varabyte.kobweb.compose.web.css.CSSUnit
import com.varabyte.kobweb.compose.web.css.Display
import com.varabyte.kobweb.compose.web.css.FlexWrap
import com.varabyte.kobweb.compose.web.css.alignItems
import com.varabyte.kobweb.compose.web.css.display
import com.varabyte.kobweb.compose.web.css.flexWrap
import com.varabyte.kobweb.compose.web.css.gap
import com.varabyte.kobweb.compose.web.css.gridTemplateColumns
import com.varabyte.kobweb.compose.web.css.justifyContent
import com.varabyte.kobweb.compose.web.css.padding
import com.varabyte.kobweb.compose.web.css.width
import com.varabyte.kobweb.compose.web.elements.Div
import com.varabyte.kobweb.compose.web.elements.Section
import com.ashishkumar.portfolio.components.GlassCard
import com.ashishkumar.portfolio.components.ProjectCard
import com.ashishkumar.portfolio.style.AppColors

data class Project(
    val title: String,
    val description: String,
    val link: String?,
    val bullets: List<String> = emptyList()
)

@Composable
fun Projects(modifier: Modifier = Modifier) {
    val projects = listOf(
        Project(
            title = "Walmart App",
            description = "Shopping and delivery app. Convenient pickup, delivery and shipping options make it possible to get the order exactly when you want it.",
            link = null,
            bullets = listOf(
                "Improved testing reliability through writing comprehensive unit tests and test cases in R2.",
                "Contributed to migrating dashboards from Splunk to OpenObserve.",
                "Collaborated with post-transactions team to enhance order amendments functionality."
            )
        ),
        Project(
            title = "HyreCar App",
            description = "Rideshare and Delivery platform. Specializes in providing rentals to Gig workers. Bought by GetAround.",
            link = "https://play.google.com/store/apps/details?id=com.yellowishdev.hyrecarandroid&hl=en&gl=US",
            bullets = listOf(
                "Scanning documents for background check of a registered driver.",
                "Firebase config for dynamically updating screen content, incorporating Android 13-specific APIs.",
                "AppAuth for login with Google and Facebook. Apollo GraphQL for all services. RxJava for data flow.",
                "Managing analytics, crashlytics and app distribution through Firebase using Fastlane."
            )
        ),
        Project(
            title = "Parental Control App",
            description = "Keeping kids safer online requires more than managing screen time. Features: Web Supervision, Time Supervision, Location Supervision, App Supervision, Instant Lock etc.",
            link = "https://play.google.com/store/apps/details?id=com.kidoprotect.app&hl=en_IN&gl=US",
            bullets = listOf(
                "Blocking user from uninstalling app using accessibility services and device manager setting.",
                "NSFW content detection and logging from users gallery using TensorFlow model.",
                "Custom keyboard and key logging using accessibility services."
            )
        ),
        Project(
            title = "Swagbucks Apps",
            description = "SBAnswer enables you to earn points for answering surveys. Tada is the free cash app that gives you real cash back shopping in-store and online.",
            link = null,
            bullets = listOf(
                "Converted and created projects in Kotlin using MVVM architecture with Coroutines and Koin DI.",
                "Worked on Unity to integrate registration and reward system in games.",
                "Used JNI to plug JARs into C# scripts in Unity. Used Objective-C to plugin Swift code."
            )
        ),
        Project(
            title = "Healthy Mummy",
            description = "The HealthyMummy weight loss plan is family and budget friendly and made for busy mums. With delicious recipes, constant support and fun workouts.",
            link = "https://play.google.com/store/apps/details?id=com.thehealthymummy&hl=en_IN&gl=US",
            bullets = listOf(
                "Created MVVM architecture with Meteor DB on backend.",
                "Worked with sockets to sustain live connections to Meteor DB."
            )
        ),
        Project(
            title = "Baaz",
            description = "Arab Social Media Platform where you can experience the new meaning of social networking with unlimited entertainment.",
            link = "https://play.google.com/store/apps/details?id=com.baaz.baazapp",
            bullets = listOf(
                "Pioneered first standardized code of MVVM architecture in JAVA with seniors.",
                "Used Dagger for dependency injection. Used Room DB."
            )
        ),
        Project(
            title = "Tada",
            description = "Free cash app that gives you real cash back shopping in-store and online and using coupons and coupon codes.",
            link = "https://play.google.com/store/apps/details?id=com.prodege.SBShop&hl=en_IN&gl=US",
            bullets = emptyList()
        ),
        Project(
            title = "SB Answer",
            description = "Earn points called SB for answering surveys and giving feedback on local shopping visits.",
            link = "https://play.google.com/store/apps/details?id=com.prodege.answer",
            bullets = emptyList()
        ),
        Project(
            title = "Trade V",
            description = "Trading application built with RxJava and MVP architecture.",
            link = "https://play.google.com/store/apps/details?id=org.tradev.com.tradev",
            bullets = emptyList()
        ),
        Project(
            title = "Day Pro",
            description = "Day trading application with real-time market data.",
            link = "https://play.google.com/store/apps/details?id=org.daypro.com.daypro",
            bullets = emptyList()
        )
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("padding") { "100px 20px" }
                property("max-width") { "1200px" }
                property("margin") { "0 auto" }
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(title = "Projects")

        Spacer(modifier = Modifier.height(40.px))

        Column(
            modifier = Modifier.css {
                property("display") { "grid" }
                property("grid-template-columns") { "repeat(auto-fit, minmax(350px, 1fr))" }
                property("gap") { "24px" }
                property("width") { "100%" }
            }
        ) {
            projects.forEach { project ->
                ProjectCard(
                    title = project.title,
                    description = project.description,
                    link = project.link,
                    bullets = project.bullets
                )
            }
        }
    }
}
