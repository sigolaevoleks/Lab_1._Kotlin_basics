fun Column(content: () -> String): String = "C[${content()}]"
fun Row(content: () -> String): String = "R[${content()}]"

fun drawNested(): String {
    return Column { Row { "Text" } }
}
