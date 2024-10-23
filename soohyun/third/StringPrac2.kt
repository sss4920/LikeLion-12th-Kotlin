package soohyun.third

class StringPrac2 {
    fun main() {
        val nullString: String? = null
        val emptyString = ""
        val blankString = " "
        val normalString = "A"

        println(nullString.isNullOrEmpty())
        println(emptyString.isNullOrEmpty())
        println(blankString.isNullOrEmpty())
        println(normalString.isNullOrEmpty())

        println(nullString.isNullOrBlank())
        println(emptyString.isNullOrBlank())
        println(blankString.isNullOrBlank())
        println(normalString.isNullOrBlank())

    }
}