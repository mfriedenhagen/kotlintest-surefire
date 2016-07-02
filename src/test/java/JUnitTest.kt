import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class JUnitTest {
    @Test
    fun shouldFail() {
        assertTrue(false)
    }
    @Test
    fun shouldErr() {
        throw RuntimeException("JUnit")
    }
    @Test
    fun shouldSucceed() {
        assertTrue(true)
    }
}