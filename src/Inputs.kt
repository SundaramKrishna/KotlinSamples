fun main(args:Array<String>){
    print("Enter your name:\n")
    val name = readLine().toString()
    print("Enter age:\n")
    val age:Int = readLine()!!.toInt()
    println("Result is")
    if (age > 25) print("Eligible") else print("Not Eligible")

}