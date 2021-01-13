# Kotlin Programming 
My quick notes of the Kotlin language

## Chapter 1: Your first kotlin application
Hello World

## Chapter 2: Variables, constants, and types
* SandBox -> TypeIntro.Kt

```Kotlin
const val MAX_EXPERIENCE: Int = 5000

fun main() {
    val playerName = "Estragon"
    var experiencePoints = 5
    experiencePoints += 5

    println(experiencePoints)
    println(playerName)
}
```

## Chapter 3: Conditionals
* [Game.kt](NyetHack/src/Game.kt)

expression
```kotlin
val auraColor = if (auraVisible) "GREEN" else "NONE"
```

ranges
```kotlin
var coinFlip = if (randomNumber in 1..50) {
    "HEADS"
}  else {
    "TAILS"
}
```

when
```kotlin
val grade = when (score) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    else -> "F"
}
```
## Chapter 4: Functions

```kotlin
private fun formatHealthStatus(healthPoints: Int, name: String, isBlessed: Boolean): String {
    return when (healthPoints) {
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
}
```

* default args
* single expression function
    * 
        ```kotlin
            private fun addOne(value: Int): Int =
                value + 1
        ```
* named function arguments
