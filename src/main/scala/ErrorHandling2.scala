import scala.util.Try

object ErrorHandling2 {
  case class Customer(age: Int)

  class Cigarettes {
    def isHealthy = false
  }

  case class UnderAgeException(message: String) extends Exception(message)

  object Shop {
    // throw exception in case the customer is underage
    def buyCigarettes(customer: Customer): Try[Cigarettes] = ???
  }

  // try out Try functors
}
