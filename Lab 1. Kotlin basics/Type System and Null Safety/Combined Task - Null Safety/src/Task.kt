fun generateGreeting(name: String?): String {
    val safeName = name?.takeIf { it.isNotEmpty() } ?: "Guest"
    return "Welcome, $safeName!"
}
