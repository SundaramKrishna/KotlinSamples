fun main(args:Array<String>){
    var setElement = setOf(1,2,3,4,5,5,6,6)
    println("Immutable set")

    for (element in setElement)
        println(element)

    println("------------------------------------------")

    var muSet = mutableSetOf(1,2,3,4,5)
    muSet.add(1)

    for (element in muSet)
        println(element)
}