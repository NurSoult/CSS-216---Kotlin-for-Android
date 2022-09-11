import java.util.*    // required import

val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    val newList = filtered.toList()
    println("new list: $newList")
}

