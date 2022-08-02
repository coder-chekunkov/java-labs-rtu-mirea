package KotlinLabs.Lab4

import java.util.*

private val random = Random()

fun createWorker(): Worker {
    val name = "Worker#${random.nextInt(1000 + 1)}"
    val age = random.nextInt(100 + 1)
    val sex = random.nextBoolean()
    val nameOfCat = isHavingACat(random.nextInt(10 + 1))
    val nameOfDepartment = createNameOfDepartment(random.nextInt(10 + 1))
    val position = "Position#${random.nextInt(10 + 1)}"
    val salary = random.nextInt(500000 + 1)
    val prize = isHavingAPrize(random.nextInt(10 + 1))
    val yearsOfWork = random.nextInt(10 + 1)

    return Worker(name, age, sex, nameOfCat, nameOfDepartment, position, salary, prize, yearsOfWork)
}

fun createNameOfDepartment(number: Int): String {
    return when (number) {
        number % 2 -> "IT"
        number % 3 -> "AD"
        number % 4 -> "HR"
        else -> "ECONOMIC"
    }
}

fun isHavingACat(number: Int): Boolean = number % 2 == 0
fun isHavingAPrize(number: Int): Int = if (number % 2 != 0) 0 else random.nextInt(50000 + 1)
