package tw.dworker.kotlin

import com.sun.jdi.IntegerValue
import java.util.*

fun main() {

//    userInput()
    val stu = Student("Mark",77,99)
    stu.print()
    println("highest score: ${stu.highest()}")

}

class Student (var name: String, var english : Int, var math: Int){
    fun print (){
        println(name + "\t" + english + "\t" + math + "\t"
                + getAverage() + "\t" + if (getAverage() >= 60) "PASS" else "FAILED" )

        /*if (getAverage() >= 60) {
            println("\tPASS")
        }else{
            println("\tFAIL")
        }*/
    }
    fun getAverage() : Int{
        return (english+math)/2
    }
    fun highest() : Int{
        var max = if (english > math){
            println("english")
            english
        } else {
            println("math")
            math
        }
/*        if (english > math){
            max = english
        }else{
            max = math
        }*/
        return max
    }

}
private fun userInput() {
    val scanner = Scanner(System.`in`)
    println("Please insert the name")
    var name = scanner.next()
    println("Please insert English score")
    var english = scanner.nextInt()
    println("Please insert Math score")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()
}
