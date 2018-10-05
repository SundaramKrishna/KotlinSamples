fun main(args:Array<String>){
    println("Enter number to divide:")
    var divider:Int = readLine()!!.toInt()
    try{
        var division = 1000/ divider
        println("Result is $division")
    }catch (ex:Exception){
        println(ex.message)
    }

    println("Completed")
}