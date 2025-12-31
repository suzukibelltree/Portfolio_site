package org.belltree.portfolio.section

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun ProfileSection() {
    Div(
        attrs = {
            style {
                padding(48.px)
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                alignItems(AlignItems.Center)
            }
        }
    ) {
        H1 {
            Text("SuzukiBelltree")
        }

        P(
            attrs = {
                style {
                    marginTop(8.px)
                    fontSize(18.px)
                    color(Color.gray)
                }
            }
        ) {
            Text("Android Engineer / Student")
        }

        P(
            attrs = {
                style {
                    marginTop(16.px)
                    maxWidth(600.px)
                    textAlign("center")
                    lineHeight(24.px)
                }
            }
        ) {
            Text(
                "Kotlin / Jetpack Compose を中心に Android アプリ開発を行っています。" +
                        " UI/UX と設計を重視した開発が得意です。"
            )
        }
    }
}
