package org.belltree.portfolio

import androidx.compose.runtime.Composable
import org.belltree.portfolio.section.FooterSection
import org.belltree.portfolio.section.Header
import org.belltree.portfolio.section.ProfileSection
import org.belltree.portfolio.section.SocialLinksSection
import org.belltree.portfolio.section.TechStackSection
import org.belltree.portfolio.section.WorksSection
import org.jetbrains.compose.web.css.Style

@Composable
fun App() {
    Style(GlobalStyles)
    Style(WorksStyles)
    Style(SocialLinkStyles)
    Header()
    ProfileSection()
    SocialLinksSection()
    WorksSection()
    TechStackSection()
    FooterSection()
}

