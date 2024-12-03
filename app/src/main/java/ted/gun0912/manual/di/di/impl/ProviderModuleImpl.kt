package ted.gun0912.manual.di.di.impl

import kotlinx.coroutines.Dispatchers
import ted.gun0912.manual.di.di.ProviderModule
import ted.gun0912.manual.di.provider.CoroutineContextProvider


class ProviderModuleImpl : ProviderModule {

    override val coroutineContextProvider: CoroutineContextProvider by lazy {
        object : CoroutineContextProvider {
            override val io = Dispatchers.IO
        }
    }
}
