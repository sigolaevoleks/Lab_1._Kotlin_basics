fun trafficLightAction(color: String): String {
    return when (color) {
        "Red" -> "Stop"
        "Yellow" -> "Wait"
        "Green" -> "Go"
        else -> "Error"
    }
}
