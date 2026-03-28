fun formatDate(day: Int, month: String, year: Int): String {
    return "$day $month $year"
}

fun callFormatDate(): String {
    return formatDate(year = 2025, month = "October", day = 10)
}
