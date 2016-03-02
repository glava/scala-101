
import scala.collection.mutable.ListBuffer

object DeathStar {
  val fullyOperational: Boolean = true
  val scoreBoard: ListBuffer[String] = new ListBuffer()

  def attack(planet: String) = scoreBoard += planet
}

object Object1 extends App {

  //attack planet Alderaan

  // print scoreboard
}