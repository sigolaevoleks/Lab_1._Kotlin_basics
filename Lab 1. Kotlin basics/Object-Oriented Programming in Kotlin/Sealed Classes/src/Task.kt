sealed class NetworkResult

data class Success(val data: String) : NetworkResult()

data class Error(val errorMsg: String) : NetworkResult()
