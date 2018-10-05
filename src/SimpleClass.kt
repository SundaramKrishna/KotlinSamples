fun main(args:Array<String>){
    var personInstance1 = Person("Sundaram",26)
    println("personInstance1 :${personInstance1.name} and age is ${personInstance1.age}")
    var personInstance2 = Person("Iyyappan",21)
    println("personInstance2 :${personInstance2.name} and age is ${personInstance2.age}")

    var testInstance = TestConst("Sundaram")
    testInstance.printValue()

    var testInstance1 = TestConst(27)
    testInstance1.printValue()


}


class Person(var name:String,var age:Int)

class TestConst{
    var input:Int?=null
    var name:String?=null

    constructor(input:Int){
        this.input = input
    }

    constructor(name: String){
        this.name = name
    }

    fun printValue(){
        println("Result is $name and $input")
    }

}