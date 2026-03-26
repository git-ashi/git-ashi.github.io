package com.ashishkumar.portfolio

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.fillMaxWidth
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.web.css.BackgroundColor
import com.varabyte.kobweb.compose.web.css.Color
import com.varabyte.kobweb.compose.web.css.Display
import com.varabyte.kobweb.compose.web.css.backgroundColor
import com.varabyte.kobweb.compose.web.css.color
import com.varabyte.kobweb.compose.web.css.display
import com.varabyte.kobweb.compose.web.css.fontFamily
import com.varabyte.kobweb.compose.web.css.fontSize
import com.varabyte.kobweb.compose.web.css.height
import com.varabyte.kobweb.compose.web.css.margin
import com.varabyte.kobweb.compose.web.css.minHeight
import com.varabyte.kobweb.compose.web.css.overflowX
import com.varabyte.kobweb.compose.web.css.padding
import com.varabyte.kobweb.compose.web.css.percentage
import com.varabyte.kobweb.compose.web.css.position
import com.varabyte.kobweb.compose.web.css.property
import com.varabyte.kobweb.compose.web.css.scrollBehavior
import com.varabyte.kobweb.compose.web.css.textAlign
import com.varabyte.kobweb.compose.web.css.width
import com.varabyte.kobweb.compose.web.elements.Div
import com.varabyte.kobweb.compose.web.elements.Footer
import com.varabyte.kobweb.compose.web.elements.Head
import com.varabyte.kobweb.compose.web.elements.Header
import com.varabyte.kobweb.compose.web.elements.Html
import com.varabyte.kobweb.compose.web.elements.Meta
import com.varabyte.kobweb.compose.web.elements.Nav
import com.varabyte.kobweb.compose.web.elements.Span
import com.varabyte.kobweb.compose.web.elements.Text
import com.ashishkumar.portfolio.sections.About
import com.ashishkumar.portfolio.sections.Contact
import com.ashishkumar.portfolio.sections.Education
import com.ashishkumar.portfolio.sections.Experience
import com.ashishkumar.portfolio.sections.Hero
import com.ashishkumar.portfolio.sections.Projects
import com.ashishkumar.portfolio.sections.Skills
import com.ashishkumar.portfolio.style.AppColors
import org.jetbrains.compose.web.css.ScrollBehavior
import org.jetbrains.compose.web.css.ScrollBehavior
import org.jetbrains.compose.web.css.Stop
import org.jetbrains.compose.web.css.linearGradient

@Composable
fun Index() {
    Html(
        attrs = {
            attr("lang", "en")
        }
    ) {
        Head {
            Meta(charset = "UTF-8")
            Meta(name = "viewport", content = "width=device-width, initial-scale=1.0")
            Meta(name = "description", content = "Ashish Kumar - Android Developer with 7.5+ years of experience. Building exceptional mobile experiences with Kotlin & Flutter.")
            Meta(name = "theme-color", content = "#3DDC84")
            Title("Ashish Kumar - Android Developer")
            Link(href = "https://fonts.googleapis.com", rel = "preconnect")
            Link(href = "https://fonts.gstatic.com", rel = "preconnect")
            Link(
                href = "https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap",
                rel = "stylesheet"
            )
            Style {
                """
                * {
                    margin: 0;
                    padding: 0;
                    box-sizing: border-box;
                }
                
                html {
                    scroll-behavior: smooth;
                }
                
                body {
                    font-family: 'Inter', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
                    background-color: #000;
                    color: #fff;
                    line-height: 1.6;
                    overflow-x: hidden;
                }
                
                a:hover {
                    opacity: 0.9;
                }
                
                ::-webkit-scrollbar {
                    width: 8px;
                }
                
                ::-webkit-scrollbar-track {
                    background: #1A1A1A;
                }
                
                ::-webkit-scrollbar-thumb {
                    background: #3DDC84;
                    border-radius: 4px;
                }
                
                ::-webkit-scrollbar-thumb:hover {
                    background: #5AED9E;
                }
                """.trimIndent()
            }
        }
        
        Body {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .css {
                        property("min-height") { "100vh" }
                        property("background") {
                            linearGradient(
                                0.to(Stop(0.percent, Color.rgb(r = 0, g = 0, b = 0)),
                                     Stop(50.percent, Color.rgb(r = 8, g = 8, b = 15)),
                                     Stop(100.percent, Color.rgb(r = 0, g = 0, b = 0)))
                            )
                        }
                    }
            ) {
                NavBar()
                Hero()
                About()
                Experience()
                Projects()
                Skills()
                Education()
                Contact()
                FooterSection()
            }
        }
    }
}

@Composable
private fun NavBar(modifier: Modifier = Modifier) {
    Nav(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("position") { "fixed" }
                property("top") { "0" }
                property("left") { "0" }
                property("right") { "0" }
                property("z-index") { "1000" }
                property("padding") { "16px 40px" }
                property("background-color") { Color.argb(a = 0.9f, r = 0, g = 0, b = 0) }
                property("backdrop-filter") { "blur(10px)" }
                property("border-bottom") { "1px solid rgba(255, 255, 255, 0.1)" }
            }
    ) {
        Column(
            modifier = Modifier.css {
                property("display") { "flex" }
                property("justify-content") { "space-between" }
                property("align-items") { "center" }
                property("max-width") { "1200px" }
                property("margin") { "0 auto" }
            }
        ) {
            A(
                href = "#",
                modifier = Modifier.css {
                    property("color") { Color(0xFFFFFFFF) }
                    property("font-size") { "20px" }
                    property("font-weight") { "700" }
                    property("text-decoration") { "none" }
                }
            ) {
                Text(buildSpanString {
                    SpanStyle(color = Color(0xFF3DDC84)) {
                        append("A")
                    }
                    append("shish")
                })
            }
            
            Column(
                modifier = Modifier.css {
                    property("display") { "flex" }
                    property("gap") { "32px" }
                }
            ) {
                NavLink(href = "#about", text = "About")
                NavLink(href = "#experience", text = "Experience")
                NavLink(href = "#projects", text = "Projects")
                NavLink(href = "#skills", text = "Skills")
                NavLink(href = "#contact", text = "Contact")
            }
        }
    }
}

@Composable
private fun NavLink(href: String, text: String, modifier: Modifier = Modifier) {
    A(
        href = href,
        modifier = modifier.css {
            property("color") { Color(0xFFB0B0B0) }
            property("font-size") { "14px" }
            property("font-weight") { "500" }
            property("text-decoration") { "none" }
            property("transition") { "color 0.3s ease" }
        }
    ) {
        Text(text)
    }
}

@Composable
private fun FooterSection(modifier: Modifier = Modifier) {
    Footer(
        modifier = modifier
            .fillMaxWidth()
            .css {
                property("padding") { "40px 20px" }
                property("text-align") { "center" }
                property("border-top") { "1px solid rgba(255, 255, 255, 0.1)" }
                property("background-color") { Color(0xFF0A0A0A) }
            }
    ) {
        Text(
            text = "© 2024 Ashish Kumar. Built with Kotlin & Kobweb.",
            modifier = Modifier.css {
                property("color") { Color(0xFF808080) }
                property("font-size") { "14px" }
            }
        )
    }
}

@Composable
private fun Body(content: @Composable () -> Unit) {
    Div(
        attrs = {
            attr("id", "root")
        }
    ) {
        Div(
            attrs = {
                attr("id", "app")
            }
        ) {
            content()
        }
    }
}

private fun Int.toPercent() = Percentage(this.toDouble())
