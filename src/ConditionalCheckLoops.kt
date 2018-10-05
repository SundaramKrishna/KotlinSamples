fun main(args:Array<String>){

       test@ for(item in 1..5){
            for (count in 1..5){
                println("Current Iteration Outer loop $item & Inner loop is $count")
                if(count ==3){
                    break@test
                }
            }
        }
}