fun main(args:Array<String>){
    var array:Array<Int> = Array(5){1}
    array[4] = 10

    for (index in 0..(array.size -1)){
        println("Enter element at index [$index]")
        array[index] = readLine()!!.toInt()
        println("Index base "+ array[index])
    }

    for (element in array){
        println("Elements are $element")
    }
}