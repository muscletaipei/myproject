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
        println("$name\t$english\t$math\t${getAverage()}" +
                "\t${grading()}\t${passOrFailed()}")
    }
    fun passOrFailed() = if (getAverage() >= 60) "PASS" else "FAILED"

    fun grading() = when(getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
    fun getAverage() = (english+math)/2

    fun highest() = if (english > math){
        println("english")
        english
    } else {
        println("math")
        math
    }
    fun nameCheck() = name.length

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
