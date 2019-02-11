// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/play_lessons/lesson_2/play-scala-myapp/conf/routes
// @DATE:Sun Feb 10 21:01:49 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
