class Enterprise(
    var name: String,
    private var employees: Int,
    private var prodRate: Int,
    private var hourFee: Float,
    private var incomeTax: Float
) {
    fun changeName(newValue: String) { name = newValue }

    fun changeEmployees(newValue: Int) { employees = newValue }

    fun changeProdRate(newValue: Int) { prodRate = newValue }

    fun changeHourFee(newValue: Float) { hourFee = newValue }

    fun changeIncomeTax(newValue: Float) { incomeTax = newValue }

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