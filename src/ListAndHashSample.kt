fun main(Args:Array<String>){
    var list = ArrayList<String>()
    var hmap = HashMap<Int,String>()

    list.add("Sundaram")
    list.add("David")
    list.add("Krishnan")
    list.add("Javith")

    hmap.put(1,"Krishan")
    hmap.put(2,"Sundaram")
    hmap.put(3,"David")
    hmap.put(4,"Javith")

    for (item in list){
        println(item)
    }

    if (list.contains("Sundaram")){
        println("Name found")
    }else{
        println("Name not found")
    }

    println("-------------------------------------")

    for (value in hmap.values){
        println(value)
    }

}