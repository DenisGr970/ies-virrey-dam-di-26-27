package exercises

fun main () {


    val square = {n:Int  -> n * n}

    println(square(3))

    val isEven = {n:Int -> n%2 == 0}

    println(isEven(3))

    val fullName = {name:String,surname: String -> name + " " + surname }

    println(fullName("Denis","Gandrabur"))

    val printSeparator = {"--------"}

    println(printSeparator())

}