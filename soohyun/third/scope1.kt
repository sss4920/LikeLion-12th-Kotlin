package soohyun.third

class scope1 {
    fun main() {
//    var a: String? = null
        var a: String? = "kotlin"


//    a?.run{
//        println(toUpperCase())
//        println(toLowerCase())
//    }
        a?.run{
            println(toUpperCase())
            println(toLowerCase())
        } //null이면 scope를 실행 통째로 안해버림.


    }
}