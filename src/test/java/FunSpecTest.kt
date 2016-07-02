import io.kotlintest.specs.FunSpec

class FunSpecTest : FunSpec() {
    init {
        test("should fail") {
            true shouldEqual false
        }
        test("should err") {
            throw RuntimeException("FunSpec")
        }
        test("should succeed") {
            true shouldEqual true
        }
    }
}