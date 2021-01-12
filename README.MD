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
