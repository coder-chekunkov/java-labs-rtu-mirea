package KotlinLabs.Lab4

import kotlin.collections.ArrayList

//Нахождение Работника с Максимальной зарплатой:
fun getWorkerWithMaxSalary(workers: ArrayList<Worker>): Worker? {
    return workers.maxByOrNull { it.salary }
}

//Нахождение работника с Минимальной зарплатой:
fun getWorkerWithMinSalary(workers: ArrayList<Worker>): Worker? {
    return workers.minByOrNull { it.salary }
}

//Нахождение всех работников, которым меньше 50 лет, и которые владеют кошками:
fun getWorkersWithCatAndAge(workers: ArrayList<Worker>): List<Worker> {
    return workers.filter { it.age < 50 && it.nameOfCat == true }
}

fun getRichWorkers(workers: ArrayList<Worker>): List<Worker> {
    return workers.filter { it.salary + it.prize >= 1000000 }
}


//Нахождение всех работников из отдела IT:
fun getWorkersFromItDepartment(workers: ArrayList<Worker>): List<Worker> {
    return workers.filter { it.nameOfDepartment == "IT" }
}

//Нахождение всех работников из отдела AD:
fun getWorkersFromADDepartment(workers: ArrayList<Worker>): List<Worker> {
    return workers.filter { it.nameOfDepartment == "AD" }
}

//Нахождение всех работников из отдела HR:
fun getWorkersFromHRDepartment(workers: ArrayList<Worker>): List<Worker> {
    return workers.filter { it.nameOfDepartment == "HR" }
}

//Нахождение всех работников из отдела ECONOMIC:
fun getWorkersFromEconomicDepartment(workers: ArrayList<Worker>): List<Worker> {
    return workers.filter { it.nameOfDepartment == "ECONOMIC" }
}




