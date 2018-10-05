class Printer<T>{

    constructor(input:T){
        println(input)
    }
}


fun main(args:Array<String>){
    Printer<String>("Hi")
    Printer<Int>(123)
}