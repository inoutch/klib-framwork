import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        App({ MyFunc() }, emptyList()).run()
    }
}