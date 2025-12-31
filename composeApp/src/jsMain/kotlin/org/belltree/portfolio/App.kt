package org.belltree.portfolio

import androidx.compose.runtime.Composable
import org.belltree.portfolio.section.ProfileSection
import org.belltree.portfolio.section.SocialLinksSection
import org.belltree.portfolio.section.TechStackSection
import org.belltree.portfolio.section.WorksSection
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Footer

@Composable
fun App() {
    Style(WorksStyles)
    ProfileSection()
    SocialLinksSection()
    WorksSection()
    TechStackSection()
    Footer()
}

