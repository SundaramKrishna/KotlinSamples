fun ArrayList<String>.swap(index1:Int,index2:Int){
    var temp = get(index1)
    set(index1,get(index2))
    set(index2,temp)
}


fun main(args:Array<String>){

    var arrayList = ArrayList<String>()
    arrayList.add("Esack")
    arrayList.add("Sundaram")
    arrayList.add("Vijayan")
    arrayList.add("Arun")
    arrayList.swap(0,1)
    arrayList.swap(2,3)

    for (item in arrayList){
        println(item)
    }
}