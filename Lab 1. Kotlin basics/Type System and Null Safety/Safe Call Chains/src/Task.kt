class User(val name: String?)

fun getUserNameLength(user: User?): Int? {
    return user?.name?.length
}
