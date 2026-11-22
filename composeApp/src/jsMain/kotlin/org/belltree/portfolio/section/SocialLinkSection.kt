package org.belltree.portfolio.section

import androidx.compose.runtime.Composable
import org.belltree.portfolio.SocialLinkStyles
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexWrap
import org.jetbrains.compose.web.css.gap
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun SocialLinksSection() {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.Center)
                flexWrap(FlexWrap.Wrap)
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
        SocialLink(
            text = "Qiita",
            url = "https://qiita.com/suzukibelltree"
        )
        SocialLink(
            text = "Wantedly",
            url = "https://www.wantedly.com/id/belltree"
        )
        SocialLink(
            text = "AtCoder",
            url = "https://atcoder.jp/users/tarafugu"
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
            classes(SocialLinkStyles.anchor)
        }
    ) {
        Text(text)
    }
}

