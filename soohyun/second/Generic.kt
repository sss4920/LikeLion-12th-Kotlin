package soohyun.second

/**
 * 캐스팅은 속도를 저하시킬 수 있다.
 * 따라서 제네릭을 사용하면 속도를 저하시키지 않고 캐스팅을 추론할 수 있다.
 */

fun main(){
    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B())
}

fun <T:A> doShouting(t:T){
    t.shout()
}

open class A {
    open fun shout(){
        println("A가 소리칩니다")
    }
}
class B: A(){
    override fun shout() {
        println("B가 소리칩니다")
    }
}
class C: A(){
    override fun shout() {
        println("C가 소리칩니다")
    }
}

class UsingGeneric<T:A> (val t: T){
    fun doShouting(){
        t.shout()
    }
}