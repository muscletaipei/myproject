package tw.dworker.kotlin

import com.sun.jdi.IntegerValue

fun main() {
    val stu = Student("muscle", 77, 90)
    stu.print()

}

class Student (var name: String, var english : Int, var math: Int){
    fun print (){
        println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2 )
    }

}