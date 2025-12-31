package org.belltree.portfolio.section

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.gap
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textDecoration
import org.jetbrains.compose.web.dom.*

@Composable
fun SocialLinksSection() {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.Center)
                gap(24.px)
                marginTop(32.px)
            }
        }
    ) {
        SocialLink(
            text = "GitHub",
            url = "https://github.com/suzukibelltree"
        )
        SocialLink(
            text = "X (Twitter)",
            url = "https://x.com/bell__develop"
        )
    }
}

@Composable
private fun SocialLink(
    text: String,
    url: String
) {
    A(
        href = url,
        attrs = {
            style {
                fontSize(16.px)
                color(Color("#1f6feb"))
                textDecoration("none")
                fontWeight("500")
            }

            onMouseOver {
                style {
                    textDecoration("underline")
                }
            }
        }
    ) {
        Text(text)
    }
}

