fun main(s:Array<String>){

    val map = hashMapOf(1 to "Test", 2 to "Mind", 3 to "Body")
    map.put(4,"Actions")

    println(map.get(2))
    println(map[3])

    println("-------------------------------")

    var ar = arrayOf(1,2,3,4,5)
    println(ar[3])

    var list = listOf("A",1,2,"B")
    //list[1] = 2

    var lst = mutableListOf(1,2,2)
    lst[1] = 5

    for (item in lst){
        println(item)
    }

}