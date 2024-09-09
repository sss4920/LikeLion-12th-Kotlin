package soohyun.first

fun main() {
    b(::a)

    val c: (String) -> Unit =
        { str -> println("${str} 람다함수") } //이처럼  (String)으로 명시해줬기에 타입 명시를 해줄 필요없이 str로 이름 쓸거라고 알려주면 된다.

    val d: (String) -> Unit = { str ->
        println("${str} 1줄")
        println("2줄")
        println("여러줄 사용가능")
    }
    val e: () -> Unit = { println("패러티머가 없어요")}
    val f: (String) -> Unit = {println("$it 람다함수")} //파라미터가 하나라면 이처럼 it을 사용하여 한개를 가져올 수도 있다.
}

fun a(str: String) {
    println("$str 함수 a") //일반 함수의 형태 위 val c처럼 바꿀 수 있다.
}

fun b(function: (String) -> Unit) {
    function("b가 호출한")
}
