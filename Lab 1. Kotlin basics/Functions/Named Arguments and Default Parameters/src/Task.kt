fun createWindow(width: Int = 800, height: Int = 600, title: String = "Untitled"): String {
    return "Window '$title' [$width x $height]"
}

fun openApp(): String {
    return createWindow(title = "My App")
}
