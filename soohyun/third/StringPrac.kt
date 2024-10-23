package soohyun.third;

import java.util.*

class StringPrac() {

    fun String1() {
        val test1 = "Test.Kotlin.String"

        println(test1.length)
        println(test1.lowercase(Locale.getDefault()))
        println(test1.uppercase(Locale.getDefault()))

        val test2 = test1.split(".")
        println(test2)

        println(test2.joinToString())
        println(test2.joinToString("-"))
        println(test1.substring(5..10))
    }
}
