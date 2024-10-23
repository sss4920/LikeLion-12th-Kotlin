package soohyun.third

fun main(){
    Outer.Nested().introduce()
    val outer = Outer()
    val inner = outer.Inner()
    inner.introduceInner()
    inner.introduceOuter()
    outer.text = "changed"
    inner.introduceOuter()

}
class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce(){
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println(text)
        }

        fun introduceOuter(){
            println(this@Outer.text)
        }
    }
}
