import java.util.*

data class Details(var name:String, var age:Int):Comparable<Details>{

    override fun compareTo(other: Details): Int {
        return this.age - other.age
    }

}


fun main(arg:Array<String>){
    var details = ArrayList<Details>()
    details.add(Details("Sundaram",26))
    details.add(Details("Iyyappan",21))
    println("Before Sort")
    for (item in details){
        println("Name is ${item.name} and age is ${item.age}")
    }
    details.sort()
    println("After Sort")

    for (item in details){
        println("Name is ${item.name} and age is ${item.age}")
    }

}