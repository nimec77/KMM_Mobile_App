package com.example.kmmmobileapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform