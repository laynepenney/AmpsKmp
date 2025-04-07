package layne.pro.sample.ampskmp

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        val greeting = Greeting().greet()
        println(greeting)
        assertTrue(greeting.contains("Hello"), "Check 'Hello' is mentioned")
    }
}