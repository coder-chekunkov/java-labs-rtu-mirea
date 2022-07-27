package KotlinLabs.Lab1

import java.util.*
import kotlin.collections.ArrayList

private val scanner = Scanner(System.`in`)
private val random = Random()

fun main() {
    game()
}

private fun game() {
    val person = createPerson()
    val enemies = ArrayList<Enemy>(createEnemyList())
    val weapons = ArrayList<Weapon>(createWeaponList())
    println("Hero: $person")
    println("All Enemies: ")
    for (o in enemies) println(o)
    println("All Weapons:")
    for (o in weapons) println(o)
    chekWeapon(person, weapons)
}

private fun chekWeapon(person: Person, weapons: ArrayList<Weapon>) {
    println("[------------]")
    print("Choose number of Weapon to take one: ")
    val numberOfWeapon = scanner.nextInt()
    if (person.isNormalWeapon(weapons[numberOfWeapon - 1].needLevel))
        println("Hero can take this weapon.")
    else
        println("Hero can't take this weapon.")
}

// Создание персонажа:
private fun createPerson(): Person {
    println("[------------]\nСоздание персонажа!")
    print("Введите имя: ")
    val name = scanner.nextLine()
    print("Введите здоровье игрока: ")
    val hp = scanner.nextInt()
    print("Введите опыт игрока: ")
    val exp = scanner.nextInt()
    print("Введите уровень игрока: ")
    val level = scanner.nextInt()
    print("Введите атаку игрока: ")
    val atk = scanner.nextInt()
    print("Введите защиту игрока: ")
    val def = scanner.nextInt()
    return Person(name, hp, exp, level, atk, def)
}

// Создание списка с "Enemy":
private fun createEnemyList(): ArrayList<Enemy> {
    val buffList = ArrayList<Enemy>()
    for (i in 1..20) {
        val name = "Enemy($i)"
        val hp = random.nextInt(100 + 1)
        val atk = random.nextInt(150 + 1)
        val def = random.nextInt(100 + 1)
        buffList.add(Enemy(name, hp, atk, def))
    }
    return buffList
}

// Создание списка с "Weapon":
private fun createWeaponList(): ArrayList<Weapon> {
    val buffList = ArrayList<Weapon>()
    for (i in 1..20) {
        val name = "Weapon($i)"
        val atk = random.nextInt(150 + 1)
        val coast = random.nextInt(1000 + 1)
        val needLevel = random.nextInt(10 + 1)
        buffList.add(Weapon(name, atk, coast, needLevel))
    }
    return buffList
}
