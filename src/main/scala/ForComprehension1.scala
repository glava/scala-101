
object ForComprehension1 extends App {

  // all number that are 13 in sum
  val howTo13 = for {
    i <- 0 until 10
    j <- i until 10 if i + j == 13
  } yield (i, j)

  println(howTo13)

  val starWars = List("Lea", "Luke", "Han Solo")
  val starTrek = List("Pike", "Spock", "Kirk")

  val love = ??? // combine them

  println(love)

  val politeColleague: Option[String] = Some("Good morning")
  val rudeColleague: Option[String] = None

  def replay(colleagueSays: Option[String]): String = colleagueSays match {
    case Some(hello) => s"$hello to you too"
    case None => "GOOD MORNING!!!"
  }

  def replay2(colleagueSays: Option[String]): String =
    colleagueSays.map(hello => s"$hello to you too").getOrElse("GOOD MORNING!!!")

  // implement using for
  def replay3(colleagueSays: Option[String]): String = ???
}