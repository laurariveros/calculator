package funzles

object main {

  def main(args: Array[String]) : Unit = {
    val cal = new Calculator();
    cal.calculate()
  }

  class Calculator {

    var operation: String = ""
    var number1: Double = 0
    var number2: Double = 0
    var result: Double = -1

    def calculate(): Unit = {
      println("-------------------");
      println("      WELCOME      ");
      println("-------------------");
      while(result == -1) {
        try {
          getDataFromUser()
          chooseMathOperation(number1, number2)
        } catch {
          case e: Exception => println(e.getMessage);
          println("Let's start over.");
          println("");
          result = -1
        }
      }

      println("Done! Here is the result of the operation.");
      println("Answer: " + result);
    }

    def getDataFromUser(): Unit = {
      try {
        println("Please give me the first number.");
        number1 = scala.io.StdIn.readLine().toDouble;
        println("Got it, now the second number.");
        number2 = scala.io.StdIn.readLine().toDouble;
        println("What math operation do you want me to do?");
        println("sum, subtract, mul or div?");
        operation = scala.io.StdIn.readLine().toString;
      } catch {
        case _: Exception => throw new Exception("That's not a number. XD");
      }
    }

    def chooseMathOperation(a: Double, b: Double): Unit = {
      result = operation match {
        case "sum" => sum(a, b)
        case "subtract" => subtract(a, b)
        case "mul" => mul(a, b)
        case "div" => div(a, b)
        case _ => throw new Exception( operation + " doesn't exist. :(")
      }
    }

    def sum(a: Double, b: Double): Double = {
      return a + b;
    }

    def subtract(a: Double, b: Double): Double = {
      return a - b;
    }

    def mul(a: Double, b: Double): Double = {
      return a * b;
    }

    def div(a: Double, b: Double): Double = {
      return a / b;
    }
  }
}