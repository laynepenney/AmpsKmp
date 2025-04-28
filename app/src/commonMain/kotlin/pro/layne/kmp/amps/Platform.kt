package pro.layne.kmp.amps

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform