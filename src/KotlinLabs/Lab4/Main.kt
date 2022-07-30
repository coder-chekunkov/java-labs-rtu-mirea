package KotlinLabs.Lab4

import JavaLabs.Lab_1.Person
import java.util.*;
import kotlin.collections.ArrayList

data class Worker(
    val name: String, val surname: String,
    val age: Int, val sex: Boolean, val nameOfCat: String? = null,
    val nameOfDepartment: String, val position: String,
    val salary: Int, val prize: Int? = null, val yearsOfWork: Int
)

fun main() {
    val workers = arrayListOf<Worker>()
    for (i in 1..25) workers.add(createWorker())
    for (worker in workers) println(worker)

    println("\n")
    workWithWorkers(workers)
}

fun workWithWorkers(workers: ArrayList<Worker>) {

}

fun createWorker(): Worker {
    val random = Random()
    val name = "Worker#${random.nextInt(1000 + 1)}"
    val surname = "**surname**"
    val age = random.nextInt(50 + 1)
    val sex = random.nextBoolean()
    val nameOfCat = "Cat#${random.nextInt(150 + 1)}"
    val nameOfDepartment = createNameOfDepartment(random.nextInt(10 + 1))
    val position = "Position#${random.nextInt(10 + 1)}"
    val salary = random.nextInt(500000 + 1)
    val prize = null
    val yearsOfWork = random.nextInt(10 + 1)

    return Worker(name, surname, age, sex, nameOfCat, nameOfDepartment, position, salary, prize, yearsOfWork)
}

fun createNameOfDepartment(number: Int): String {
    return when (number) {
        number % 2 -> "IT-Department"
        number % 3 -> "ADD-Department"
        number % 4 -> "HR-Department"
        else -> "ECONOMIC-Department"
    }
}