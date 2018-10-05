fun main(arg:Array<String>){
    println("Enter you mark")
    var mark:Double = readLine()!!.toDouble()

    /*if (mark >=90){
        print("You got A level")
    }else if(mark in 70.0..89.0){
        print("You got B level")
    }else if(mark in 50.0..69.0){
        print("You got C level")
    }else{
        print("You are failed")
    }*/
    when{
        mark >= 90 -> print("You got A level")
        mark in 70.0..89.00 -> print("You got B level")
        mark in 50.0..69.00 -> print("You got C level")
        else -> print("You are failed")
    }
}