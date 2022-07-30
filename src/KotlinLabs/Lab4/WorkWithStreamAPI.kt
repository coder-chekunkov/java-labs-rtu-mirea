package KotlinLabs.Lab4

import java.util.*
import kotlin.collections.ArrayList

//Нахождение Работника с Максимальной зарплатой:
fun getWorkerWithMaxSalary(workers: ArrayList<Worker>): Optional<Worker> {
    return workers.stream().max { o1, o2 -> o1.salary.compareTo(o2.salary) }
}

//Нахождение работника с Минимальной зарплатой:
fun getWorkerWithMinSalary(workers: ArrayList<Worker>): Optional<Worker> {
    return workers.stream().min { o1, o2 -> o1.salary.compareTo(o2.salary) }
}

//Нахождение всех работников, которым меньше 50 лет, и которые владеют кошками:
fun getWorkersForAge(workers: ArrayList<Worker>): List<Worker> {
    return workers.stream().filter { worker -> worker.age < 50 }
        .toList()
}