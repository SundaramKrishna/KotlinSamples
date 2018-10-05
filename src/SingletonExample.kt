class Singleton{
    lateinit var name:String
    private constructor(){
        println("instance Created")
    }

    companion object {
        val instance:Singleton by lazy { Singleton() }
    }
}


fun main(args:Array<String>){
    var v1:Singleton = Singleton.instance
    v1.name ="Testing Singleton"
    println(v1.name)

    var v2:Singleton = Singleton.instance
    println(v2.name)

    var v3:Singleton = Singleton.instance
    println(v3.name)
}