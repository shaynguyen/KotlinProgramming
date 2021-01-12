fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    var isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

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

    // player status
    println("$name $healthStatus")

    // aura
    println(auraColor)
}