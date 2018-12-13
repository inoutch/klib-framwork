package interop

import AppCore

actual class AppInitializer {
    actual fun init(appCore: AppCore) {
        appCore.run()
    }
}