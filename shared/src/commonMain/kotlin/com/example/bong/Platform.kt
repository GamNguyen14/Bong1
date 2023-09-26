package com.example.bong

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform