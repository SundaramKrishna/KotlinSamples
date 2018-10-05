import java.util.*

fun main(s:Array<String>){
    println("Enter you DOB:")
    var dob:Int = readLine()!!.toInt()
    var age = Calendar.getInstance().get(Calendar.YEAR) - dob

    println("Your age is $age years")
}