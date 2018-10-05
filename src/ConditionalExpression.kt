fun main(args:Array<String>){

    val n1 = 10
    val n2 = 12
    val max = if (n1>n2) n1 else n2
    println("Max number is $max")

    val age = 25

    val isYoung:Boolean = when(age){
        in 1..30 -> true
        else -> false
    }

    println("Is He Young : $isYoung")
}