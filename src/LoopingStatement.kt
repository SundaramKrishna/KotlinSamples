fun main(args:Array<String>){
    val range = 9
    var a:Int =0
    var b:Int =1
    var sum:Int= 0
    for (item in 1..range){
        println("$a , $b, ")
        a += b
        b += a
        sum += item
        println("Item is $item & Sum is $sum")

    }
}