import funzles.main.Calculator

import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {

  "The calc" should "sum correctly" in {
    val calculator = new Calculator
    assert(calculator.sum(-50, 29) == -21)
  }

  it should "subtract correctly" in {
    val calculator = new Calculator
    assert( calculator.subtract(15, 10) == 5)
  }

  it should "mul correctly" in {
    val calculator = new Calculator
    assert(calculator.mul(7, 2) == 14)
  }

  it should "div correctly" in {
    val calculator = new Calculator
    assert(calculator.div(28, 7) == 4)
  }

  it should "sum correctly" in {
    val calculator = new Calculator
    calculator.operation = "sum"
    calculator.chooseMathOperation(10, 15)
    assert(calculator.result == 25)
  }

  it should "subtract correctly" in {
    val calculator = new Calculator
    calculator.operation = "subtract"
    calculator.chooseMathOperation(10, 15)
    assert(calculator.result == -5)
  }

  it should "mul correctly" in {
    val calculator = new Calculator
    calculator.operation = "mul"
    calculator.chooseMathOperation(10, 15)
    assert(calculator.result == 150)
  }

  it should "div correctly" in {
    val calculator = new Calculator
    calculator.operation = "div"
    calculator.chooseMathOperation(125, 5)
    assert(calculator.result == 25)
  }
}