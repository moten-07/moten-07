package io.github.moten

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform