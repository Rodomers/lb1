class Enterprise(
    var name: String,
    private var employees: Int,
    private var prodRate: Int,
    private var hourFee: Float,
    private var incomeTax: Float
) {
    fun changeName(newValue: String) { if (newValue != "") name = newValue else name }

    fun changeEmployees(newValue: Int) { employees = if (newValue >= 0) newValue else employees }

    fun changeProdRate(newValue: Int) { prodRate = if (newValue > 0) newValue else prodRate }

    fun changeHourFee(newValue: Float) { if (newValue > 0) hourFee = newValue else hourFee }

    fun changeIncomeTax(newValue: Float) { if (newValue > 0) incomeTax = newValue else incomeTax }

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