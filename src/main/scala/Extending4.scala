
object Extending4 extends App {

  trait Logger {
    def log(message: String)
  }

  trait PrintLogger extends Logger {
    def log(msg: String) {
      println(msg)
    }
  }

  abstract class Program extends Logger {
    def execute(code: String) = {
      log(s"code got executed $code")
    }
  }

  // create a instance of program and execute some code
}
