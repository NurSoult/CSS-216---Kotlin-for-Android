package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm")
    }
}
