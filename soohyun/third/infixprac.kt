package soohyun.third

fun main(){
    println(6 multiply 4)
    println(6.multiply(4))
}
infix fun Int.multiply(x: Int): Int = this * x
//자신이 쓰는 메소드.