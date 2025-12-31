package org.belltree.portfolio

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexWrap
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.gap
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.listStyle
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.paddingLeft
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

@Composable
fun StackGroup(
    title: String,
    items: List<String>
) {
    Div(
        attrs = {
            style {
                marginTop(32.px)
            }
        }
    ) {
        H3 {
            Text(title)
        }

        Ul(
            attrs = {
                style {
                    marginTop(12.px)
                    paddingLeft(0.px)
                    listStyle("none")
                    display(DisplayStyle.Flex)
                    flexWrap(FlexWrap.Wrap)
                    gap(12.px)
                    justifyContent(JustifyContent.Center)
                }
            }
        ) {
            items.forEach { item ->
                Li(
                    attrs = {
                        style {
                            padding(8.px, 12.px)
                            backgroundColor(Color("#F3F4F6"))
                            borderRadius(8.px)
                            fontSize(14.px)
                        }
                    }
                ) {
                    Text(item)
                }
            }
        }
    }
}
