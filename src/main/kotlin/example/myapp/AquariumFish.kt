package example.myapp

interface FishColor {
    val color: String
}

interface FishAction {
    fun eat()
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction, FishColor by fishColor {
    override fun eat() {
        println("eat algae")
    }
}

class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}


