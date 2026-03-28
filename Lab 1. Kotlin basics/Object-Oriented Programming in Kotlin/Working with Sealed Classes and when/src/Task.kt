sealed class NetworkResult
data class Success(val data: String) : NetworkResult()
data class Error(val errorMsg: String) : NetworkResult()

fun processResult(result: NetworkResult): String {
    return when (result) {
        is Success -> "Дані: ${result.data}"
        is Error -> "Помилка: ${result.errorMsg}"
    }
}
