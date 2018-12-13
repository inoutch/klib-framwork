package interop

import kotlinx.cinterop.*
import platform.CoreGraphics.*
import platform.CoreMotion.*
import platform.EAGL.*
import platform.Foundation.*
import platform.GameKit.*
import platform.GLKit.*
import platform.UIKit.*
import AppCore
import AppDelegate

actual class AppInitializer {
    actual fun init(appCore: AppCore) {
        memScoped {
            val argc = appCore.args.size
            val argv = appCore.args.toCStringArray(memScope)

            AppCoreBridge.appCore = appCore

            autoreleasepool {
                UIApplicationMain(argc, argv, null, NSStringFromClass(AppDelegate))
            }
        }
    }
}