package ted.gun0912.manual.di

import org.junit.Test
import org.koin.test.KoinTest
import org.koin.test.verify.verify

class CheckModulesTest : KoinTest {
    @Test
    fun checkAllModules() {
        AppModule.verify()
    }
}