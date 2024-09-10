package soohyun.first

fun main(){
    EventPrinter().start()
}
// 이벤트를 넘겨주는걸 콜백이라고 부른다~

interface EventListener{
    fun onEvent(count: Int)
}

class PandaCounter(var listener: EventListener){
    fun count(){
        for(i in 1..100){
            if (i%5 == 0) listener.onEvent(i)
        }
    }
}
//class EventPrinter: EventListener{
//    override fun onEvent(count: Int) {
//        print("${count}-")
//    }
//    fun start(){
//        val counter = PandaCounter(this)
//        counter.count()
//    }
//}

//익명객체
class EventPrinter{
    fun start(){
        val counter = PandaCounter(object: EventListener{
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}