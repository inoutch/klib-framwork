import kotlinx.cinterop.*
import platform.Foundation.*
import platform.UIKit.*
import AppCore
import AppCoreBridge

@ExportObjCClass
class ViewController : UIViewController {

    @OverrideInit
    constructor(coder: NSCoder) : super(coder)

    override fun viewDidLoad() {
        val appCore = AppCoreBridge.appCore as AppCore
        appCore.run()
    }
}