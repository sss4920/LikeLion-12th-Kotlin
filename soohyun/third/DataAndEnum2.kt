package soohyun.third

fun main(){
    val list = listOf(Data2("보영", 212),
                      Data2("루디", 306),
                      Data2("아린", 618),)
    for ((a,b) in list)
    {
        println("${a}, ${b}")
    }


}
class General2(val name: String, val id: Int)

data class Data2(val name: String, val id: Int)