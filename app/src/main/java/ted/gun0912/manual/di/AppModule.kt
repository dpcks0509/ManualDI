package ted.gun0912.manual.di

import org.koin.dsl.module
import ted.gun0912.manual.di.data.di.DataModule
import ted.gun0912.manual.di.domain.di.DomainModule
import ted.gun0912.manual.di.presentation.di.PresentationModule
import ted.gun0912.manual.di.remote.di.RemoteModule

val AppModule = module {
    includes(DomainModule, DataModule, RemoteModule, PresentationModule)
}