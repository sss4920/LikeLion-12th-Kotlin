package soohyun.third

fun main(){
    sum(1,2,3,4)
}
fun sum(vararg numbers: Int){ //vararg는 마지막에!
    var sum = 0

    for(n in numbers)
    {
        sum+=n
    }
    print(sum)
}