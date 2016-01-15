
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/xy/PROG/STUDIUM/testing/newTesting/04_myFingu/emptysecureSocial/conf/routes
// @DATE:Fri Jan 15 12:25:31 CET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F
import _root_.scala.language.reflectiveCalls

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def userAware: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userAware",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userAware"})
        }
      """
    )
  
    // @LINE:8
    def onlyTwitter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.onlyTwitter",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "only-twitter"})
        }
      """
    )
  
    // @LINE:13
    def testmethode: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.testmethode",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "callback"})
        }
      """
    )
  
    // @LINE:10
    def currentUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.currentUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "current-user"})
        }
      """
    )
  
    // @LINE:9
    def linkResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.linkResult",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "link-result"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}