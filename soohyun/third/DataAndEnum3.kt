package soohyun.third

fun main(){
    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)
}

enum class State(val message: String){
    SING("노래를 부릅니다"),
    EAT("먹음"),
    SLEEP("잠");

    fun isSleeping() = this == State.SLEEP
}