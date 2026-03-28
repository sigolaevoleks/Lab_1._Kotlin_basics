fun ListItem(builder: (Int) -> String): String = builder(42)

fun drawList(): String {
    return ListItem { "Item $it" }
}
