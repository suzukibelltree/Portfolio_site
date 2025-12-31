package org.belltree.portfolio.section

import androidx.compose.runtime.Composable
import org.belltree.portfolio.StackGroup
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

@Composable
fun TechStackSection() {
    SectionContainer {
        H2 { Text("技術スタック") }

        StackGroup(
            title = "Languages / Platforms",
            items = listOf(
                "Kotlin",
                "Android",
                "Java",
                "Kotlin Multiplatform",
                "Python",
                "C",
                "C++"
            )
        )

        StackGroup(
            title = "Android",
            items = listOf(
                "Jetpack Compose",
                "MVVM",
                "Navigation Compose",
                "Room",
                "Retrofit",
                "Hilt",
                "Coroutines",
                "Flow",
                "CameraX",
                "WorkManager",
                "Paging 3",
                "DataStore",
                "JUnit",
                "Firebase"
            )
        )

        StackGroup(
            title = "Web",
            items = listOf(
                "Compose Multiplatform for Web",
            )
        )

        StackGroup(
            title = "Tools",
            items = listOf(
                "Git / GitHub",
                "Android Studio",
                "IntelliJ IDEA",
                "GitHub Actions",
                "Figma"
            )
        )
    }
}
