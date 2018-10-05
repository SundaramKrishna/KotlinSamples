import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>){
    println(""" File Operation
        | 1. Read File
        | 2.Write File
        | Enter your choice
    """.trimMargin())
    val input:Int = readLine()!!.toInt()
    when(input){
        1-> readFromFile()
        2 ->writeToFile()
        else -> {
            println("Exit")
            return}
    }
}

fun readFromFile() {
    try {
        val reader = FileReader("test.txt")
        var c:Int?
        do{
            c = reader.read()
            print(c.toChar())
        }while (c!=-1)

    }catch (e:Exception){
        println(e.message)
    }

}


fun writeToFile() {
    println("Enter a message to store:")
    val input:String = readLine()!!.toString()
    try {
        val fo = FileWriter("test.txt",true)
        fo.write("\n$input")
        fo.close()
    }catch (e:Exception){
        println(e.message)
    }

}
