
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[service.DemoUser,securesocial.core.RuntimeEnvironment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: service.DemoUser, env: securesocial.core.RuntimeEnvironment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import securesocial.core.IdentityProvider
import securesocial.core.AuthenticationMethod._
import Http.Context.Implicit

Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("SecureSocial - Sample Protected Page")/*6.46*/ {_display_(Seq[Any](format.raw/*6.48*/("""
"""),format.raw/*7.1*/("""<div class="page-header">
    <h2><img src=""""),_display_(/*8.20*/user/*8.24*/.main.avatarUrl),format.raw/*8.39*/("""" alt=""""),_display_(/*8.47*/user/*8.51*/.main.fullName),format.raw/*8.65*/("""" width="40px" height="40px"/> Welcome """),_display_(/*8.105*/user/*8.109*/.main.firstName),format.raw/*8.124*/("""</h2>
</div>

<div class="clearfix">
    <h2>User Details</h2>

    <ul>
        <li>User Id: """),_display_(/*15.23*/user/*15.27*/.main.userId),format.raw/*15.39*/("""</li>
        <li>Logged in from: """),_display_(/*16.30*/user/*16.34*/.main.providerId),format.raw/*16.50*/("""</li>
        <li>Fist name: """),_display_(/*17.25*/user/*17.29*/.main.firstName),format.raw/*17.44*/("""</li>
        <li>Last name: """),_display_(/*18.25*/user/*18.29*/.main.lastName),format.raw/*18.43*/("""</li>
        <li>Full name: """),_display_(/*19.25*/user/*19.29*/.main.fullName),format.raw/*19.43*/("""</li>
        <li>Email: """),_display_(/*20.21*/user/*20.25*/.main.email.map/*20.40*/ { email =>_display_(Seq[Any](format.raw/*20.51*/(""" """),_display_(/*20.53*/email),format.raw/*20.58*/(""" """)))}/*20.60*/.getOrElse("Not Available")),format.raw/*20.87*/("""</li>
        <li>Authentication method: """),_display_(/*21.37*/user/*21.41*/.main.authMethod),format.raw/*21.57*/("""</li>
    </ul>

    """),_display_(/*24.6*/user/*24.10*/.main.oAuth1Info.map/*24.30*/ { info =>_display_(Seq[Any](format.raw/*24.40*/("""
    """),format.raw/*25.5*/("""<h2>OAuth1 Info</h2>

    <ul>
        <li>Token: """),_display_(/*28.21*/info/*28.25*/.token),format.raw/*28.31*/("""</li>
        <li>Secret: """),_display_(/*29.22*/info/*29.26*/.secret),format.raw/*29.33*/("""</li>
    </ul>
    """)))}),format.raw/*31.6*/("""

    """),_display_(/*33.6*/user/*33.10*/.main.oAuth2Info.map/*33.30*/ { info =>_display_(Seq[Any](format.raw/*33.40*/("""
    """),format.raw/*34.5*/("""<h2>OAuth2 Info</h2>

    <ul>
        <li>Access Token: """),_display_(/*37.28*/info/*37.32*/.accessToken),format.raw/*37.44*/("""</li>
        """),_display_(/*38.10*/info/*38.14*/.tokenType.map/*38.28*/ { t =>_display_(Seq[Any](format.raw/*38.35*/(""" """),format.raw/*38.36*/("""<li>Token Type: """),_display_(/*38.53*/t),format.raw/*38.54*/("""</li> """)))}),format.raw/*38.61*/("""
        """),_display_(/*39.10*/info/*39.14*/.expiresIn.map/*39.28*/ { exp =>_display_(Seq[Any](format.raw/*39.37*/(""" """),format.raw/*39.38*/("""<li>Expires in: """),_display_(/*39.55*/exp),format.raw/*39.58*/(""" """),format.raw/*39.59*/("""seconds</li>""")))}),format.raw/*39.72*/("""
        """),_display_(/*40.10*/info/*40.14*/.refreshToken.map/*40.31*/ { rt =>_display_(Seq[Any](format.raw/*40.39*/(""" """),format.raw/*40.40*/("""<li>Refresh Token: """),_display_(/*40.60*/rt),format.raw/*40.62*/("""</li>""")))}),format.raw/*40.68*/("""
    """),format.raw/*41.5*/("""</ul>
    """)))}),format.raw/*42.6*/("""
    """),format.raw/*43.5*/("""<hr>
    """),_display_(/*44.6*/user/*44.10*/.main.passwordInfo.map/*44.32*/ { info =>_display_(Seq[Any](format.raw/*44.42*/("""
	"""),format.raw/*45.2*/("""<a class="btn" href=""""),_display_(/*45.24*/env/*45.27*/.routes.passwordChangeUrl(Implicit.ctx()._requestHeader())),format.raw/*45.85*/("""">Change Password</a>
    """)))}),format.raw/*46.6*/("""

     """),format.raw/*48.6*/("""<span>Link this account to

    """),_display_(/*50.6*/env/*50.9*/.providers.values.map/*50.30*/ { provider =>_display_(Seq[Any](format.raw/*50.44*/("""
        """),_display_(/*51.10*/if( provider.authMethod == OAuth1 || provider.authMethod == OAuth2 )/*51.78*/ {_display_(Seq[Any](format.raw/*51.80*/("""
            """),_display_(/*52.14*/defining( "images/providers/%s.png".format(provider.id) )/*52.71*/ { imageUrl =>_display_(Seq[Any](format.raw/*52.85*/("""
            """),format.raw/*53.13*/("""<a href=""""),_display_(/*53.23*/env/*53.26*/.routes.authenticationUrl(provider.id, Some("/link-result"))),format.raw/*53.86*/(""""> <img src=""""),_display_(/*53.100*/securesocial/*53.112*/.controllers.routes.Assets.at(imageUrl)),format.raw/*53.151*/(""""/></a>
         """)))}),format.raw/*54.11*/("""
        """)))}),format.raw/*55.10*/("""
    """)))}),format.raw/*56.6*/("""
    """),format.raw/*57.5*/("""</span>

    <hr>
    <a class="btn" href=""""),_display_(/*60.27*/securesocial/*60.39*/.controllers.routes.LoginPage.logout()),format.raw/*60.77*/("""">Logout</a>
</div>
""")))}),format.raw/*62.2*/("""
"""))
      }
    }
  }

  def render(user:service.DemoUser,env:securesocial.core.RuntimeEnvironment): play.twirl.api.HtmlFormat.Appendable = apply(user,env)

  def f:((service.DemoUser,securesocial.core.RuntimeEnvironment) => play.twirl.api.HtmlFormat.Appendable) = (user,env) => apply(user,env)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Jan 14 14:40:50 CET 2016
                  SOURCE: /home/xy/PROG/STUDIUM/testing/newTesting/03_fingu/secureSocialTest/app/views/index.scala.html
                  HASH: 36674e5b5959a9681cf7d6639f1b03b5a3884163
                  MATRIX: 792->1|1072->68|1099->191|1126->193|1178->237|1217->239|1244->240|1315->285|1327->289|1362->304|1396->312|1408->316|1442->330|1509->370|1522->374|1558->389|1680->484|1693->488|1726->500|1788->535|1801->539|1838->555|1895->585|1908->589|1944->604|2001->634|2014->638|2049->652|2106->682|2119->686|2154->700|2207->726|2220->730|2244->745|2293->756|2322->758|2348->763|2369->765|2417->792|2486->834|2499->838|2536->854|2584->876|2597->880|2626->900|2674->910|2706->915|2784->966|2797->970|2824->976|2878->1003|2891->1007|2919->1014|2970->1035|3003->1042|3016->1046|3045->1066|3093->1076|3125->1081|3210->1139|3223->1143|3256->1155|3298->1170|3311->1174|3334->1188|3379->1195|3408->1196|3452->1213|3474->1214|3512->1221|3549->1231|3562->1235|3585->1249|3632->1258|3661->1259|3705->1276|3729->1279|3758->1280|3802->1293|3839->1303|3852->1307|3878->1324|3924->1332|3953->1333|4000->1353|4023->1355|4060->1361|4092->1366|4133->1377|4165->1382|4201->1392|4214->1396|4245->1418|4293->1428|4322->1430|4371->1452|4383->1455|4462->1513|4519->1540|4553->1547|4612->1580|4623->1583|4653->1604|4705->1618|4742->1628|4819->1696|4859->1698|4900->1712|4966->1769|5018->1783|5059->1796|5096->1806|5108->1809|5189->1869|5231->1883|5253->1895|5314->1934|5363->1952|5404->1962|5440->1968|5472->1973|5543->2017|5564->2029|5623->2067|5674->2088
                  LINES: 27->1|34->1|35->5|36->6|36->6|36->6|37->7|38->8|38->8|38->8|38->8|38->8|38->8|38->8|38->8|38->8|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|51->21|51->21|51->21|54->24|54->24|54->24|54->24|55->25|58->28|58->28|58->28|59->29|59->29|59->29|61->31|63->33|63->33|63->33|63->33|64->34|67->37|67->37|67->37|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|69->39|69->39|69->39|69->39|69->39|69->39|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|71->41|72->42|73->43|74->44|74->44|74->44|74->44|75->45|75->45|75->45|75->45|76->46|78->48|80->50|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|83->53|83->53|83->53|83->53|83->53|83->53|84->54|85->55|86->56|87->57|90->60|90->60|90->60|92->62
                  -- GENERATED --
              */
          