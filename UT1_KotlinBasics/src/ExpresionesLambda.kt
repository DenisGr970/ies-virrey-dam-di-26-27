fun main () {

    println(upperCaseString(text = "Hello World"))

    // Like a lambda expression

    val upperCaseStringLambda = {text:String -> text.uppercase()}

val suma = {a:Int,b:Int -> a+b}
val numbers = listOf(1,-2,3,-44,5,-6)
 //Adds lambda directly
    val positives = numbers.filter ({ x -> x> 0 })
    val isNegative = {x:Int -> x<0}
val negatives = numbers.filter(isNegative)
println(suma(2,2))
println(positives)
println(negatives)

    val doubled = numbers.map{x -> x*2}
    val toTripled = {x: Int -> x*3}
val tripled = numbers.map { toTripled }

// FUNCTION TYPES
 





}

fun upperCaseString(text:String): String {

    return text.uppercase()

}