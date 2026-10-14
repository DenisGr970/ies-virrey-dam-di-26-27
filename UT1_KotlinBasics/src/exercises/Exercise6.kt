package exercises

fun main() {

hello()
    displayInfo(product = "Coure", price = 20.00, quantity = 1, discount = 10.00, tax = 7.00)
calculate("Course",20.00,1,10.00,7.00)

bye()



}

fun hello() {

    println("HIIII!!!")

}
fun bye() {

    println("BYEEE!!")


}

fun displayInfo(product:String, price: Double, quantity: Int, discount: Double = 10.0, tax: Double = 7.0) {

    println("Product: " + product)
    println("Price/unit: " + price)
    println("Quantity: " + quantity)
    println("Discount: " + discount)
    println("Tax: " + tax)


}

fun calculate (product:String, price: Double, quantity: Int, discount: Double = 10.0, tax: Double = 7.0): Double.Companion {

    val subtotal = price * quantity
    val price_after_disc = subtotal - discount
    val final_price = price_after_disc + tax
    return Double


}