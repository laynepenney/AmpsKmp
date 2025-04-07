package layne.pro.sample.ampskmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform