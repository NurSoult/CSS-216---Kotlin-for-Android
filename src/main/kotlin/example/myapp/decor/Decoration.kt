package example.myapp.decor


fun main() {
    val list2 = listOf("a", "bbb", "cc")
    for (s in list2.listIterator()) {
        print("$s ")
    }
}