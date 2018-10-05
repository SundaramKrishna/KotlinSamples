fun main(args:Array<String>){
    println("Enter n1:")
    var n1 = readLine()!!.toInt()
    println("Enter n2:")
    var n2 = readLine()!!.toInt()
    display(sum(n1,n2))

}


fun sum(n1:Int=0,n2:Int=1):Int{
   return n1+n2
}

fun display(result:Int){
    println(result)
}