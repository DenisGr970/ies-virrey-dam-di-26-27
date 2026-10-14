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

    // Exercise 2 name the type

    val a:(Double) -> Double = {x -> x/2}
    val b:(String) -> Int = {text -> text.length}
    val c:(String, Int) -> String= { name, age -> "$name is $age"}
    val d: (String) -> Unit = {println("Loading..")}
    val e: (Int) -> Boolean = { n -> n in 1..10}


    calculateTwo(a = 2, b = 2, operation = {a,b -> a+b})
println(calculateTwo(a = 2, b = 2, operation = {a,b -> a+b}))
}


// Training lambdas
fun calculateTwo (a: Int, b: Int, operation:(Int, Int)-> Int): Int {
    return operation(a,b)


}