import io.kotlintest.specs.ShouldSpec

class UserShouldTest : ShouldSpec() {
    init {
        "A user with age 18" {
            val sut  = User(18)
            should("be 18") {
                sut.age shouldEqual 11
            }
        }
        "A user with age 10" {
            val sut  = User(10)
            should("be 10") {
                sut.age shouldEqual 11
            }
        }
    }
}