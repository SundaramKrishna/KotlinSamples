fun main(args:Array<String>){
    var x:Int = 10
    var y:Int = 11

    println("Here x is $x and Y is $y")

    var increment:Int = ++x+y

    println("PreIncrement = $increment")
    println("Here x is $x and Y is $y")

    var decrement:Int = --x+y

    println("PreDecrement = $decrement")
    println("Here x is $x and Y is $y")

    var postIncrement:Int = x+++y
    println("postIncrement = $postIncrement")

    println("Here x is $x and Y is $y")

    var postDecrement:Int = x--+y
    println("postDecrement = $postDecrement")
    println("Here x is $x and Y is $y")


}