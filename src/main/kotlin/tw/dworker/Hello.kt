package tw.dworker

fun main() {
//    print("Hello World")
//    Human().hello()
    val h = Human(66.5f,1.7f,"muscle")
    println(h.bmi())

    val score = 88
    println( score > 60)

    val c: Char = 'A'
    println(c.toInt() > 60)

    var a = "abcde"
    println(a.length)
    println(a.get(3))
    println(a.substring(3))

    var b : String? = "abcde"
    b = null
    println(b?.get(2))
    println(b?.substring(3))

/*    h.hello()
    h.hi()*/

/*    var age = 19
    age = 20
    var weight = 66.5f
    var name : String
    name = "muscle"*/


}

class Human(var weight : Float, var  height : Float, var  name: String = ""){
    init {
        println("$name"+"的"+"\n"+"體重為$weight" + "\n" + "身高為$height")
    }
    //次要建構子
//    constructor(name: String, weight: Float, height: Float):this(weight,height)

    fun bmi() : Float{
        val bmi = weight / ( height * height)
        return bmi
    }

    fun hello(){
        println("Hello World by kotlin...")
    }
    fun hi(){
        println("this is Hi..")
    }
}