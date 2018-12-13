package interop

actual class Logger actual constructor() {
    actual fun info(vararg messages: Any) {
        messages.forEach { print(it) }
        println()
    }
}