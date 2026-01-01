package org.belltree.portfolio.section

import androidx.compose.runtime.Composable
import org.belltree.portfolio.WorksStyles
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun WorksSection() {
    SectionContainer {
        H2 {
            Text("成果物")
        }

        Div(
            attrs = {
                style {
                    marginTop(24.px)
                    display(DisplayStyle.Flex)
                    flexWrap(FlexWrap.Wrap)
                    gap(24.px)
                    justifyContent(JustifyContent.Center)
                }
            }
        ) {
            WorkCard(
                title = "ReadTrack",
                description = "積読解消Androidアプリ",
                url = "https://github.com/suzukibelltree/ReadTrack",
                imagePath = "/Portfolio_site/images/readtrack.png"
            )
            WorkCard(
                title = "PomodoroShare",
                description = "ポモドーロタイマーを離れた人と共有できるAndroidアプリ",
                url = "https://github.com/suzukibelltree/PomodoroShareApp",
                imagePath = "/Portfolio_site/images/pomodoroshare.png"
            )
        }
    }
}

@Composable
private fun WorkCard(
    title: String,
    description: String,
    url: String,
    imagePath: String
) {
    A(
        href = url,
        attrs = {
            target(ATarget.Blank)
            style {
                textDecoration("none")
                color(Color.blue)
            }
        }
    ) {
        Div(
            attrs = {
                classes(WorksStyles.card)
            }
        )
        {
            Img(
                src = imagePath,
                attrs = {
                    classes(WorksStyles.thumbnail)
                }
            )
            H3 {
                Text(title)
            }

            P(
                attrs = {
                    style {
                        marginTop(8.px)
                        color(Color.gray)
                        lineHeight(1.6.em)
                    }
                }
            ) {
                Text(description)
            }
        }
    }
}

@Composable
fun SectionContainer(
    content: @Composable () -> Unit
) {
    Div(
        attrs = {
            style {
                padding(48.px)
                textAlign("center")
            }
        }
    ) {
        content()
    }
}
