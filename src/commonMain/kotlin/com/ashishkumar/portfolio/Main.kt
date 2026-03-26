package com.ashishkumar.portfolio

import com.varabyte.kobweb.core.App
import org.jetbrains.compose.web.renderComposable

@App
fun Site() {
    renderComposable(root = "root") {
        Index()
    }
}
