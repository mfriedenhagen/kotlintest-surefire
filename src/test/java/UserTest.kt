import org.junit.Assert.assertEquals
import org.junit.Test

class UserTest {
    @Test
    fun aUserWithAge18() {
        val sut = User(18)
        assertEquals(11, sut.age)
    }
}