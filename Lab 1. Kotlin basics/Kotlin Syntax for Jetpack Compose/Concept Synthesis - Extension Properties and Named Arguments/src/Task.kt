val Int.dp: String get() = "${this}dp"

fun Padding(all: String): String = "Pad: $all"

fun setupPadding(): String {
    return Padding(all = 16.dp)
}
