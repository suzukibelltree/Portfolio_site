package org.belltree.portfolio.section

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import kotlin.js.Date

@Composable
fun FooterSection() {
    Footer(
        attrs = {
            style {
                padding(24.px)
                textAlign("center")
                fontSize(14.px)
                color(Color.gray)
            }
        }
    ) {
        Text("© ${Date().getFullYear()} SuzukiBelltree")
    }
}
