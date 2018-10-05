open class Operation1{

    open fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }

    open fun multi(n1:Int,n2:Int):Int{
        return n1*n2
    }

    open fun test():Unit{
        println("Hello")
    }
}

class Operation2:Operation1(){

    override fun sum(n1:Int,n2:Int):Int{
        return n1+n2*5
    }

    override  fun multi(n1:Int,n2:Int):Int{
        return n1*n2*5
    }
}



fun main(args:Array<String>){

    var Op1 = Operation1()
    println("Sum is ${Op1.sum(5,6)}")
    println("Multi is ${Op1.sum(5,6)}")

    var Op2 = Operation2() as Operation1
    Op2.test()

}