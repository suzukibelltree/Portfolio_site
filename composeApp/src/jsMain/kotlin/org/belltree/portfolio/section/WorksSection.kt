package org.belltree.portfolio.section

import androidx.compose.runtime.Composable
import org.belltree.portfolio.WorksStyles
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun WorksSection() {
    SectionContainer {
        H2 {
            Text("Works")
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
                description = "読書量を可視化する読書管理Androidアプリ"
            )
            WorkCard(
                title = "RecipeGenerator",
                description = "レシピAPIを用いた献立生成アプリ（チーム開発）"
            )
        }
    }
}

@Composable
private fun WorkCard(
    title: String,
    description: String
) {
    Div(
        attrs = {
            classes(WorksStyles.card)
        }
    )
    {
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

@Composable
private fun SectionContainer(
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
