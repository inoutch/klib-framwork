class AppCore(val func: () -> Func, val args: List<String>) {
    fun run() {
        func.invoke().run()
    }
}