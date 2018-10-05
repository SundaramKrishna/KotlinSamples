interface Test{
    fun op1(){
        println("Op1")
    }
    fun op2(){
        println("Op2")
    }
}

interface Op{
    fun op3(){
        println("Op3")
    }
    fun op4(){
        println("Op4")
    }
}

class Test1:Test,Op


fun main(args:Array<String>){
    var test1= Test1()
    test1.op1()
    test1.op2()
    test1.op3()
    test1.op4()
}