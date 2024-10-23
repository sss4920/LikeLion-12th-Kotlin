package soohyun.third

class Equals2(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Equals2) {
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}
//var a = Equals2("콜라", 1000)
//var b = Equals2("콜라", 1000)
//var c = a
//var d = Equals2("사이다", 1000)
//
//println(a == b)
//println(a === b)
//
//println(a == c)
//println(a === c)
//
//println(a == d)
//println(a === d)