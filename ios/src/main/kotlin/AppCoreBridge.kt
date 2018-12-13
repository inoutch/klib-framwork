import AppCore

class AppCoreBridge {
    @kotlin.native.ThreadLocal
    companion object {
        var appCore: AppCore? = null
    }
}