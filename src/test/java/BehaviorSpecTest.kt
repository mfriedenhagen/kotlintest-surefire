import io.kotlintest.specs.BehaviorSpec

class BehaviorSpecTest : BehaviorSpec() {
    init {
        Given("a subject") {
            val sut = false
            When("I compare it to true") {
                val result = sut == true
                Then("it should fail") {
                    result shouldEqual true
                }
            }
        }
        Given("a subject") {
            When("I compare it to true") {
                Then("it should err") {
                    throw RuntimeException("Oops")
                }
            }
        }
        Given("a subject") {
            val sut = true
            When("I compare it to true") {
                val result = sut == true
                Then("it should succeed") {
                    result shouldEqual true
                }
            }
        }
    }
}