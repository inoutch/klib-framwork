package interop

expect class Logger() {
    fun info(vararg messages: Any)
}