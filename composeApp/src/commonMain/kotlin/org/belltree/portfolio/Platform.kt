package org.belltree.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform