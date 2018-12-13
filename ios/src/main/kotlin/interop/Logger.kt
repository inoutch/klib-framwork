package interop

actual class Logger actual constructor() {
    actual fun info(vararg messages: Any) {
        println(messages)
    }
}