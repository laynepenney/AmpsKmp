package pro.layne.kmp.amps

import layne.pro.amplify.kmp.Greeting as LibGreeting

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        val lib = LibGreeting()
        return "Hello, ${platform.name}! <${lib.greet()}>"
    }
}