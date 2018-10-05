class CustomThread():Runnable{
    private var name:String?=null
    constructor(name:String):this(){
        this.name = name
    }
    override fun run() {
        for (item in 1..10){

            if (name.equals("Thread1") && (item%2 !=0)){
                println(this.name +"Count is $item")
            }

            if (name.equals("Thread2") && (item%2 ==0)){
                println(this.name +"Count is $item")
            }

            try {
                Thread.sleep(1000)
            }catch (ex:Exception){
                ex.message
            }

        }
    }
}


fun main(args:Array<String>){
    var t1 = Thread(CustomThread("Thread1"))
    t1.start()

    var t2 = Thread(CustomThread("Thread2"))
    t2.start()
}