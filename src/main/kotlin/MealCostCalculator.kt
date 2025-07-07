const val BASE_COST = 100.0

fun main() {
    val totalMealCost = calculateTotalMealCost(BASE_COST)
    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double = 0.1,
                           tipPercentage: Double = 0.15,
                           discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double) : Double {
        return baseCost + (baseCost * taxRate)
    }
    fun applyTip(taxedCost: Double, tipPercentage: Double) : Double {
        return taxedCost + (taxedCost * tipPercentage)
    }
    fun applyDiscount(tippedCost: Double, discount: Double) : Double {
        return tippedCost - discount
    }
    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
