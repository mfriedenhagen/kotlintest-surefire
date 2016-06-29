import io.kotlintest.specs.ShouldSpec
import org.junit.Test

import org.junit.Assert.*

class UserShouldTest : ShouldSpec() {
    init {
        "A user with age 18" {
            val sut  = User(18)
            should("be 18") {
                sut.age shouldEqual 11
            }
        }
    }
}