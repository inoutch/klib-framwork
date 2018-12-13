import android.app.Activity
import android.os.Bundle

abstract class AppActivity : Activity() {

    private lateinit var app: App

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.app = App(this.createFunc(), emptyList())
        this.app.run()
    }

    abstract fun createFunc(): () -> Func
}
