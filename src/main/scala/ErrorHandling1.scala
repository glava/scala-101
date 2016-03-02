
object ErrorHandling1 extends App {

  case class Customer(age: Int)

  class Cigarettes {
    def isHealthy = false
  }

  case class UnderAgeException(message: String) extends Exception(message)

  object Shop {
    // throw exception in case the customer is underage
    def buyCigarettes(customer: Customer): Cigarettes = ???
  }

  val youngCustomer = Customer(15)
  try {
    Shop.buyCigarettes(youngCustomer)
    "Yo, here are your cancer sticks! Happy smokin'!"
  } catch {
    case UnderAgeException(msg) => println(msg)
  }
}
