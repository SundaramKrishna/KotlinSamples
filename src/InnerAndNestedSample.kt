class Outer{
    private val test:String = "SK"

    inner class Inner{
        fun showInfo(){
            println("Inner Here $test")
        }
    }

    fun showInfo(){
        println("Outer here $test")
    }
}

fun main(args:Array<String>){
    val out = Outer()
    out.showInfo()

    val inn = out.Inner()
    inn.showInfo()
}