package org.belltree.portfolio

import androidx.compose.runtime.Composable
import org.belltree.portfolio.section.ProfileSection
import org.belltree.portfolio.section.WorksSection
import org.jetbrains.compose.web.css.Style

@Composable
fun App() {
    Style(WorksStyles)
    ProfileSection()
    WorksSection()
}

