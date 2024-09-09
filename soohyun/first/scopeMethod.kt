package soohyun.first

fun main(){
    var price = 5000

    var a = Book("디모의 코틀린", 10000).apply{//apply - 처리가 끝나면 인스턴스를 반환한다
        name = "[초특가]" + name
        discount()
    }
    a.run {
        println("상품명: ${name}, 가격 : ${price}") // run - 처리가 끝나면 최종값을 반환한다.
    }
    a.let{
        println("상품명: ${it.name}, 가격 : ${it.price}원") //약간 this처럼 현재 위에 있는 price가 우선시되는 것을 막기위해 let으로 대신 쓰거나
    }
    //apply도 let과 같이 우선시 되는 경우가 있어서 문제가 된다면 also를 사용하면 된다.
}
class Book(var name:String, var price: Int)
{
    fun discount(){
        price -= 2000
    }
}