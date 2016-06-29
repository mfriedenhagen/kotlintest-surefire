import io.kotlintest.specs.FunSpec

class UserFunTest : FunSpec() {
    init {
        test("A user with age 18 failed") {
            val sut = User(18)
            sut.age shouldEqual 11
        }
        test("A user with age 18 successful") {
            val sut = User(18)
            sut.age shouldEqual 18
        }
    }
}