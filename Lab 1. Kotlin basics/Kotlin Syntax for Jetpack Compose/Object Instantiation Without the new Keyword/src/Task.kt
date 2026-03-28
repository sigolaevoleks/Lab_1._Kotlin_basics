class Modifier(val id: String)
fun Box(modifier: Modifier): String = "Box with ${modifier.id}"

fun createBox(): String {
    return Box(Modifier("ID_1"))
}
