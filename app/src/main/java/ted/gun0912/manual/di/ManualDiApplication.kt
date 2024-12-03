package ted.gun0912.manual.di

import android.app.Application
import ted.gun0912.manual.di.di.AppModule
import ted.gun0912.manual.di.di.impl.AppModuleImpl
import ted.gun0912.manual.di.di.impl.DataModuleImpl
import ted.gun0912.manual.di.di.impl.DomainModuleImpl
import ted.gun0912.manual.di.di.impl.PresentationModuleImpl
import ted.gun0912.manual.di.di.impl.ProviderModuleImpl
import ted.gun0912.manual.di.di.impl.RemoteModuleImpl

class ManualDiApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeAppModule()
    }

    private fun initializeAppModule() {
        val providerModule = ProviderModuleImpl()
        val remoteModule = RemoteModuleImpl()
        val dataModule = DataModuleImpl()
        val domainModule = DomainModuleImpl()
        val presentationModule = PresentationModuleImpl()

        appModule = AppModuleImpl(
            providerModule = providerModule,
            remoteModule = remoteModule,
            dataModule = dataModule,
            domainModule = domainModule,
            presentationModule = presentationModule,
        )
    }

    companion object {
        lateinit var appModule: AppModule
    }

}
