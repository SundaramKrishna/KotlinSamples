fun main(args:Array<String>){
 val childInstance = Child()
    println(childInstance.concadeIt("Sundaram","Krishan"))
}

open class Parent{
    open fun concadeIt(part1:String,part2:String):String{
        return """$part1$part2"""
    }
}

class Child: Parent() {
    override fun concadeIt(part1:String,part2:String):String{
        return """$part1 $part2........child override"""
    }
}

