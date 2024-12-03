package ted.gun0912.manual.di.di

interface AppModule : ProviderModule,
    RemoteModule,
    DataModule,
    DomainModule,
    PresentationModule
