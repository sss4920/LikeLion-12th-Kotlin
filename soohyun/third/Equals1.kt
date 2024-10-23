package soohyun.third

import java.util.*

class Equals1 {
    fun main() {
        var a: String? = null

        println(a?.uppercase(Locale.getDefault())) //null이면 걍 뒤에꺼를 실행 안해버림.
        println(a?: "default".uppercase(Locale.getDefault())) //null이면 뒤에꺼로 대체
        println(a!!.uppercase(Locale.getDefault())) //null포인터가 뜨도록 방치

    }
}