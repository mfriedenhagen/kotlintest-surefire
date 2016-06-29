import io.kotlintest.specs.FunSpec

class UserFunTest : FunSpec() {
    init {
        test("A user with age 18") {
            val sut = User(18)
            sut.age shouldEqual 11
        }
    }
}