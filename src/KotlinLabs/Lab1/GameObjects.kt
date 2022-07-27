package KotlinLabs.Lab1

data class Person(val name: String, val hp: Int, val exp: Int, val level: Int, val atk: Int, val def: Int) {
    fun isNormalWeapon(levelOfWeapon: Int): Boolean = levelOfWeapon <= level
}

data class Enemy(val name: String, val hp: Int, val atk: Int, val def: Int)
data class Weapon(val name: String, val atk: Int, val coast: Int, val needLevel: Int)

