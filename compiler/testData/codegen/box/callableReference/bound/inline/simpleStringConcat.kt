inline fun go(f: () -> String) = f()

fun String.id(): String = this

fun foo(x: String, y: String): String {
    return go((x + y)::id)
}

fun box() = foo("O", "K")
