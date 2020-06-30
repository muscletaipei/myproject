package tw.dworker

fun main() {
//    print("Hello World")
//    Human().hello()
    val h = Human()
    h.hello()
    h.hi()

    var age = 19
    age = 20
    var weight = 66.5f
    var name : String
    name = "muscle"


}

class Human{
    fun hello(){
        println("Hello World by kotlin...")
    }
    fun hi(){
        println("this is Hi..")
    }
}