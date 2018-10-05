fun main(args:Array<String>){
    var start = 'A'..'Z'
    var test:String? = ""
    test = null
    start.forEach {
        c: Char -> print(c +" ")
    }

    print(test?.toString())

}