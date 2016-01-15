
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/xy/PROG/STUDIUM/testing/newTesting/04_myFingu/emptysecureSocial/conf/routes
// @DATE:Fri Jan 15 12:25:31 CET 2016


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
