package soohyun.first

/**
 * 전체적으로 공용으로 사용할 느낌. 전역 변수느낌으로다가 만들고싶으면 object로 만들 수 있다.
 */
fun main(){

    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)
    Counter.clear()

    println(Counter.count)
}

object Counter{
    var count =0
    fun countUp(){
        count++
    }
    fun clear(){
        count=0
    }
}