package soohyun.second

/**
 * Up-casting : 업캐스팅. 부모클래스에 넣을 때. 별도로 뭐 해줄 필요없음.
 * Down-casting : 다운 캐스팅. 상속받은 하위 클래스에 넣을 때. 별도로 뭐 해줘야됨.
 *
 */

fun main(){

    var a = Drink()
    a.drink() // 음료를 마십니다.

    var b: Drink = Cola()
    b.drink() //
    //b.washDishes 안됨.
    if (b is Cola)
    {
        b.washDishes()
    }

    var c = b as Cola
    c.washDishes()
    b.washDishes() //as를 통해 반환값 뿐만 아니라 변수 자체도 다운 캐스팅되어 사용가능.

}

open class Drink {
    var name = "음료"

    open fun drink(){
        println("${name}을 마십니다.")
    }
}

class Cola: Drink(){
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}을 마십니다.")
    }

    fun washDishes(){
        println("${type}로 설거지를 합니다.")
    }
}