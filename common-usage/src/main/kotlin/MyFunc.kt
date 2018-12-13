import interop.Logger
import interop.Platform

class MyFunc : Func {
    override fun run() {
        val logger = Logger()
        logger.info("hello world!")
        logger.info("platform is " + Platform().target())
    }
}