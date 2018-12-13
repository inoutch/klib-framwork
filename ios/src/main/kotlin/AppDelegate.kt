import kotlinx.cinterop.*
import platform.Foundation.*
import platform.UIKit.*
import AppCore

class AppDelegate : UIResponder, UIApplicationDelegateProtocol {

    @OverrideInit constructor() : super()

    companion object : UIResponderMeta(), UIApplicationDelegateProtocolMeta {}

    private var _window: UIWindow? = null
    override fun window() = _window
    override fun setWindow(window: UIWindow?) { _window = window }
}

