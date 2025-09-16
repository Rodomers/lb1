class Enterprise(
    var name: String,
    private val employees: Int,
    private val prodRate: Int,
    private val hourFee: Float,
    private val incomeTax: Float
) {
    fun countPayout(): Int {
        return (employees * prodRate * hourFee * (1 - incomeTax)).toInt()
    }
}

fun main() {
    val enterprise = Enterprise(
        name = "Global Innovations Ltd.",
        employees = 150,
        prodRate = 8,
        hourFee = 25.50f,
        incomeTax = 0.85f
    )

    println(enterprise.countPayout())
}