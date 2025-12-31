package org.belltree.portfolio

import org.jetbrains.compose.web.css.*

object WorksStyles : StyleSheet() {

    val card by style {
        cursor("pointer")
        width(280.px)
        padding(20.px)
        borderRadius(12.px)
        backgroundColor(Color("#F9F9F9"))

        property("box-shadow", "0px 4px 12px rgba(0,0,0,0.1)")
        property("transition", "transform 0.2s ease, box-shadow 0.2s ease")

        self + hover style {
            property("transform", "translateY(-6px)")
            property("box-shadow", "0px 10px 24px rgba(0,0,0,0.15)")
        }
        self + active style {
            property("transform", "translateY(-3px)")
        }
    }
    val thumbnail by style {
        width(100.percent)
        height(160.px)
        borderRadius(8.px)
        marginBottom(12.px)
        property("object-fit", "cover")
    }
}
