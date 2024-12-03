package ted.gun0912.manual.di.di.impl

import ted.gun0912.manual.di.di.AppModule
import ted.gun0912.manual.di.di.DataModule
import ted.gun0912.manual.di.di.DomainModule
import ted.gun0912.manual.di.di.PresentationModule
import ted.gun0912.manual.di.di.ProviderModule
import ted.gun0912.manual.di.di.RemoteModule


class AppModuleImpl(
    private val providerModule: ProviderModule,
    private val remoteModule: RemoteModule,
    private val dataModule: DataModule,
    private val domainModule: DomainModule,
    private val presentationModule: PresentationModule,
) : AppModule,
    ProviderModule by providerModule,
    RemoteModule by remoteModule,
    DataModule by dataModule,
    DomainModule by domainModule,
    PresentationModule by presentationModule
