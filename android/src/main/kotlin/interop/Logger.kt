package interop

import android.util.Log

actual class Logger actual constructor() {
    actual fun info(vararg messages: Any) {
        Log.i("kotlin-framework", messages.toString())
    }
}