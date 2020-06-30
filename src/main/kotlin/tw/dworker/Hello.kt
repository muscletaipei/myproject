package tw.dworker

fun main() {
//    print("Hello World")
//    Human().hello()
    val h = Human()
    h.hello()
    h.hi()

}

class Human{
    fun hello(){
        println("Hello World by kotlin...")
    }
    fun hi(){
        println("this is Hi..")
    }
}