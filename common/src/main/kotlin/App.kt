import interop.AppInitializer

class App(func: () -> Func, args: List<String>) {
    private val appInitializer = AppInitializer()
    private val appCore = AppCore(func, args)

    fun run(): App {
        appInitializer.init(this.appCore)
        return this
    }
}