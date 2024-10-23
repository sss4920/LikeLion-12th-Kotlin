package soohyun.third

import javax.print.attribute.standard.Destination

fun main(){
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")
    deliveryItem("선물", destination = "친구집")

}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집"){
    println("${name}, ${count}개를 ${destination}에 배달하였습니다")
}