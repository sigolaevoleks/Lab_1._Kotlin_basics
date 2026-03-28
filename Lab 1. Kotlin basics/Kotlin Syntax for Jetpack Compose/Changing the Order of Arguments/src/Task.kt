fun MyButton(onClick: String, enabled: Boolean): String = "Button($onClick, $enabled)"

fun renderButton(): String {
    return MyButton(enabled = false, onClick = "Action")
}
