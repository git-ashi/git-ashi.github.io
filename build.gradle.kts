import com.varabyte.kobweb.gradle.project.scripts

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.kobweb)
}

group = "com.ashishkumar.portfolio"
version = "1.0.0"

kotlin {
    js {
        compiler {
            options.freeCompilerArgs.add("-Xjsr305=strict")
        }
    }
}

kobweb {
    app {
        name.set("portfolio")
        description.set("Ashish Kumar - Android Developer Portfolio")
    }
}

dependencies {
    implementation(libs.compose.runtime)
    implementation(libs.compose.foundation)
    implementation(libs.compose.ui)
    implementation(libs.compose.elements)
    implementation(libs.compose.material3)
    implementation(libs.kobweb.core)
    implementation(libs.kobweb.syntax.highlight)
    implementation(libs.kotlinx.coroutines.core)
}
