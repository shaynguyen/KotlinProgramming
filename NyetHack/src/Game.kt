fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    var isImmortal = false
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    val healthStatus = formatHealthStatus(healthPoints, name, isBlessed)

    // player status
    printPlayerStatus(name, healthStatus, auraColor)

    castFireBall()
}

private fun printPlayerStatus(name: String, healthStatus: String, auraColor: String) {
    println("$name $healthStatus")
    println(auraColor)
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, name: String, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
        100 -> "$name is in excellent condition!"
        in 90..99 -> "$name has a few scratches."
        in 75..89 -> if (isBlessed) {
            "$name has some minor wounds but is healing quite quickly!"
        } else {
            "$name has a few minor wounds."
        }
        in 15..74 -> "$name looks pretty hurt."
        else -> "$name is in awful condition!"
    }
    return healthStatus
}

private fun castFireBall(numFireballs: Int = 2) {
    println("A glass of Fireball springs into existence. (x$numFireballs)")
}

private fun addOne(value: Int): Int =
        value + 1