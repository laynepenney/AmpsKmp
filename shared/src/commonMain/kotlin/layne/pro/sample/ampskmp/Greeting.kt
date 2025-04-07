package layne.pro.sample.ampskmp

import layne.pro.sample.ampskmplib.Greeting as LibGreeting

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val basic = "Hello, ${platform.name}!"
        val lib = LibGreeting().greet()
        return "basic<$basic> | lib<$lib>"
    }
}