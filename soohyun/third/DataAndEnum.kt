package soohyun.third

fun main(){
    val a = General("보영", 212)

    println(a==General("보영", 212))
    println(a.hashCode())
    println(a)

    val b = Data("루다", 306)

    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id = 618))

}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)