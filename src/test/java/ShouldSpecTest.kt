import io.kotlintest.specs.ShouldSpec

class ShouldSpecTest : ShouldSpec() {
    init {
        "This ShouldSpec" {
            should("fail") {
                true shouldEqual false
            }
        }
        "This ShouldSpec" {
            should("err") {
                throw RuntimeException("ShouldSpec")
            }
        }
        "This ShouldSpec" {
            should("succeed") {
                true shouldEqual true
            }
        }
    }
}