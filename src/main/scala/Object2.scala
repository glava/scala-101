
/*Object as companion object*/
object Object2 extends App {

  class DeathStar {
    private var director: Option[String] = None
  }

  object DeathStar {
    def apply(director: String): DeathStar = ???
      // create DeathStar with director

    // add static function that returns string with a name licence
  }

}
