package soohyun.first

/**
 * static 멤버
 * 클래스 내부에서 별도의 영역에 고정적으로 존재하여
 * 인스턴스를 생성하지 않아도
 * 공용으로 사용가능한 속성이나 함수
 */
fun main(){
    var foobao = PopularAnimal("푸바오")
    var ruiBao = PopularAnimal("루이바오")

    foobao.vote()
    foobao.vote()

    ruiBao.vote()
    ruiBao.vote()
    ruiBao.vote()

    println("${ruiBao.name} : ${ruiBao.count}")
    println("${foobao.name} : ${foobao.count}")
    println("합계 : ${PopularAnimal.total}")

}
class PopularAnimal(val name: String){
    companion object{
        var total = 0
    }

    var count =0

    fun vote(){
        total++
        count++
    }
}