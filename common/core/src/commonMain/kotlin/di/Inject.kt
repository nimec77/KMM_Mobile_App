package di

import org.kodein.di.DirectDI
import org.kodein.di.instance

object Inject {

    private var di_: DirectDI? = null

    val di: DirectDI
        get() = requireNotNull(di_)

    fun createDependencies(tree: DirectDI) {
        di_ = tree
    }

    inline fun <reified T> instance(): T {
        return di.instance()
    }
}