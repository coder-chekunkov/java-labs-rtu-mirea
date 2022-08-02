package KotlinLabs.Lab4

import kotlin.collections.ArrayList

data class Worker(
    val name: String, val age: Int, val sex: Boolean, val nameOfCat: Boolean? = null,
    val nameOfDepartment: String, val position: String,
    val salary: Int, val prize: Int, val yearsOfWork: Int
)

fun main() {
    val workers = arrayListOf<Worker>()
    for (i in 1..25) workers.add(createWorker())
    workers.forEach { println(it) }
    workWithWorkers(workers)
}

fun workWithWorkers(workers: ArrayList<Worker>) {
    val workerWithMaxSalary = getWorkerWithMaxSalary(workers)
    println("\nMAX SALARY: \n$workerWithMaxSalary")

    val workerWithMinSalary = getWorkerWithMinSalary(workers)
    println("\nMIN SALARY: \n$workerWithMinSalary}")

    val workersWithCatAndAge = getWorkersWithCatAndAge(workers)
    println("\nAGE < 50 and CAT != null:")
    workersWithCatAndAge.forEach { println(it) }

    val richWorkers = getRichWorkers(workers)
    if (richWorkers.isEmpty()) println("\nNo workers: salary + prize >= 1000000")
    else {
        println("\nWorkers: salary + prize >= 100000:")
        richWorkers.forEach { println(it) }
    }

    val workersFormItDepartment = getWorkersFromItDepartment(workers)
    println("\nWorkers FROM IT DEPARTMENT:")
    workersFormItDepartment.forEach { println(it) }

    val workersFormADDepartment = getWorkersFromADDepartment(workers)
    println("\nWorkers FROM AD DEPARTMENT:")
    workersFormADDepartment.forEach { println(it) }

    val workersFormHRDepartment = getWorkersFromHRDepartment(workers)
    println("\nWorkers FROM HR DEPARTMENT:")
    workersFormHRDepartment.forEach { println(it) }

    val workersFormEconomicDepartment = getWorkersFromEconomicDepartment(workers)
    println("\nWorkers FROM ECONOMIC DEPARTMENT:")
    workersFormEconomicDepartment.forEach { println(it) }

    println("\nAll Workers in Departments:")
    println(
        """Workers in IT Department: ${workersFormItDepartment.size}
        |Workers in AD Department: ${workersFormADDepartment.size}
        |Workers in HR Department: ${workersFormHRDepartment.size}
        |Workers in Economic Department: ${workersFormEconomicDepartment.size}        
        """.trimMargin()
    )
}