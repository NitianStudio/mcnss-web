package io.github.nitianstudio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform