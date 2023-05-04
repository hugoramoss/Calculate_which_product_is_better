import com.sun.jdi.DoubleValue

fun main() {

    var productA = dataInput("Enter the price Product A:")
    var amountA = dataInput("Enter the quantity of product A")

    var productB = dataInput("Enter the price Product B:")
    var amountB = dataInput("Enter the quantity of product B")





    var unitPriceA = 0.00 // IN GRAMS
    var unitPriceB = 0.00 // IN GRAMS

    unitPriceA = productA / amountA
    unitPriceB = productB / amountB

    var kiloPriceA = 0.0 // In Kilo
    var kiloPriceB = 0.0 // In Kilo

    kiloPriceA = unitPriceA * 1000
    kiloPriceB = unitPriceB * 1000

    println("Product A price per Kilo = £ $kiloPriceA")
    println("Product B price per Kilo = £ $kiloPriceB")

    bestBuy(kiloPriceA,kiloPriceB)


}

fun dataInput(message: String): Double {
    var dataEntryValue: Double?

    do {
        println(message)
        dataEntryValue = readLine()!!.toDoubleOrNull()
    } while (dataEntryValue == null)
    return dataEntryValue
}

fun bestBuy(a: Double, b: Double){

    if (a == b) {
        println("Buy any of the products")
    } else if (a < b) {
        println("Buy product A")
    } else {
        println("Buy product B")
    }

}

