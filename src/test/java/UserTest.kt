import org.junit.Assert.assertEquals
import org.junit.Test

class UserTest {
    @Test
    fun aUserWithAge18Fails() {
        val sut = User(18)
        assertEquals(11, sut.age)
    }
    @Test
    fun aUserWithAge18Succeeds() {
        val sut = User(18)
        assertEquals(11, sut.age)
    }
    @Test
    fun throwException() {
        throw RuntimeException("oops")
    }
}