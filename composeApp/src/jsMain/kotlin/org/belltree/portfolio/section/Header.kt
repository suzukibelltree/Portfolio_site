package org.belltree.portfolio.section

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

val AccentColor = Color("#4F46E5")

@Composable
fun Header() {
    Div(
        attrs = {
            style {
                width(100.percent)
                backgroundColor(Color("#FAFAFA"))
                paddingTop(32.px)
                paddingBottom(32.px)
                paddingLeft(24.px)
                paddingRight(24.px)
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.Center)
                alignItems(AlignItems.Center)
            }
        }
    ) {
        H1(
            attrs = {
                style {
                    fontSize(28.px)
                    margin(0.px)
                    color(Color("#111111"))
                }
            }
        ) {
            Text("My Portfolio")
        }
    }
}


