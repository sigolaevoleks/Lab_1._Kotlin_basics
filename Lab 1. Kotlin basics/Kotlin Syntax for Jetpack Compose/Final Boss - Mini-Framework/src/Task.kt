fun Column(content: () -> String): String = "Col[${content()}]"
fun Button(onClick: String, content: () -> String): String = "Btn($onClick)[${content()}]"
fun Text(text: String): String = "Txt($text)"

fun composeUI(): String {
    return Column {
        Button(onClick = "Save") {
            Text("Save")
        }
    }
}
