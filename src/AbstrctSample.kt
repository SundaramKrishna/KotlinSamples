abstract class Bank(){
    lateinit var bank_name:String
    fun setBankName(bank_name:String){
        this.bank_name = bank_name
    }
    fun getBankName():String{
    return bank_name
    }
}


class Exchange():Bank(){

    lateinit var bank:String

    fun printResult(){
        println("Enter Bank Name:")
        bank = readLine()!!.toString()
        setBankName(bank)
        println("Bank name is ${getBankName()}")
    }
}

fun main(args:Array<String>){
    val exchange = Exchange()
    exchange.printResult()
}