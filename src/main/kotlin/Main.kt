import java.util.*    // required import
import kotlin.collections.ArrayList


fun main(args : Array<String>) {

    val numberOfFish : Int = 51

    when (numberOfFish) {
        0 -> println("Pusto")
        7 -> println("lucky")
    }
//    var kali : Byte = null
    var mara : Int? = null


    val myClassmates = mutableListOf("Aiba", "Mara", "Adai", "Max")
    myClassmates.remove("Max")
    myClassmates.add("Akula")



    val numbers = intArrayOf(1,2,3)
    val numbers2 = intArrayOf(4,5,6)
    val foo2 = numbers+numbers2


    print(foo2[5])

    for (el in myClassmates) {
        print(el + " ")
    }


    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decorations.filter { it[0] == 'p' })

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")




}

