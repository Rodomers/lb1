import java.util.Scanner

class Enterprise(
    var name: String = "Enterprise",
    private var employees: Int = 0,
    private var prodRate: Int = 0,
    private var hourFee: Float = 1f,
    private var incomeTax: Float = 0f
) {
    fun changeName(newValue: String) { if (newValue != "") name = newValue else "Enterprise" }

    fun changeEmployees(newValue: Int) {
        employees = try {
            if (newValue >= 0) newValue else 0
        } catch (e: Exception) {
            employees
        }
    }

    fun changeProdRate(newValue: Int) { prodRate = if (newValue > 0) newValue else prodRate }

    fun changeHourFee(newValue: Float) { if (newValue > 0) hourFee = newValue else hourFee }

    fun changeIncomeTax(newValue: Float) { if (newValue > 0 && newValue < 1) incomeTax = newValue else incomeTax }

    fun countPayout(): Int {
        return (employees * prodRate * hourFee * (1 - incomeTax)).toInt()
    }
}

val scan = Scanner(System.`in`)

fun main() {
    println("Enterprise name: ")
    val name = scan.nextLine().trim()
    println("Enterprise employees: ")
    val employees = scan.nextLine().trim().toInt()
    println("Enterprise prod-rate: ")
    val prodRate = scan.nextLine().trim().toInt()
    println("Enterprise hour-fee: ")
    val hourFee = scan.nextLine().trim().toFloat()
    println("Enterprise income tax: ")
    val incomeTax = scan.nextLine().trim().toFloat()

    val enterprise = Enterprise(
        name = name,
        employees = employees,
        prodRate = prodRate,
        hourFee = hourFee,
        incomeTax = incomeTax
    )

    println(enterprise.countPayout())

    println("New enterprise name: ")
    val newName = scan.nextLine().trim()
    println("New tax: ")
    val newTax = scan.nextLine().trim().toFloat()

    enterprise.changeName(newName)
    enterprise.changeIncomeTax(newTax)

    println(enterprise.countPayout())
}