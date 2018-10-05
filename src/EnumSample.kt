enum class ACTIONS{
    SLEEP,EAT,READ,WATCH
}

fun main(args:Array<String>){
    val actionDone =ACTIONS.EAT

    when(actionDone){
        ACTIONS.SLEEP -> println("He is sleeping")
        ACTIONS.EAT -> println("He is Eating")
        ACTIONS.READ -> println("He is Reading")
        ACTIONS.WATCH -> println("He is Watching")
    }
}