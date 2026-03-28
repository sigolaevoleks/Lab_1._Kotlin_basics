fun Button(onClick: String, content: () -> String): String = "Btn($onClick) [${content()}]"

fun clickBtn(): String {
    return Button(onClick = "Submit") { "Text inside" }
}
