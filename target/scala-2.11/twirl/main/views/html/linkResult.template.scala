
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object linkResult_Scope0 {
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

class linkResult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[service.DemoUser,java.util.List[securesocial.core.BasicProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(current: service.DemoUser, linkedIdentities: java.util.List[securesocial.core.BasicProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

    """),_display_(/*3.6*/main("SecureSocial - Account Link Result")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
"""),format.raw/*4.1*/("""<div class="page-header">
    <h2><img src=""""),_display_(/*5.20*/current/*5.27*/.main.avatarUrl.getOrElse("")),format.raw/*5.56*/("""" alt=""""),_display_(/*5.64*/current/*5.71*/.main.firstName.getOrElse("")),format.raw/*5.100*/("""" width="40px" height="40px"/> Hey """),_display_(/*5.136*/current/*5.143*/.main.firstName.getOrElse("")),format.raw/*5.172*/("""</h2>
</div>

<div class="clearfix">
    <h2>You are linked to the following accounts:</h2>

    """),_display_(/*11.6*/linkedIdentities/*11.22*/.map/*11.26*/ { linked =>_display_(Seq[Any](format.raw/*11.38*/("""
        """),format.raw/*12.9*/("""<h2>"""),_display_(/*12.14*/linked/*12.20*/.providerId),format.raw/*12.31*/("""
        """),format.raw/*13.9*/("""</h2>
        <ul>
            <li>User Id: """),_display_(/*15.27*/linked/*15.33*/.userId),format.raw/*15.40*/("""</li>
            <li>Fist name: """),_display_(/*16.29*/linked/*16.35*/.firstName),format.raw/*16.45*/("""</li>
            <li>Last name: """),_display_(/*17.29*/linked/*17.35*/.lastName),format.raw/*17.44*/("""</li>
            <li>Full name: """),_display_(/*18.29*/linked/*18.35*/.fullName),format.raw/*18.44*/("""</li>
            <li>Logged in from: """),_display_(/*19.34*/linked/*19.40*/.providerId),format.raw/*19.51*/("""</li>
            <li>Email: """),_display_(/*20.25*/linked/*20.31*/.email.map/*20.41*/ { email =>_display_(Seq[Any](format.raw/*20.52*/(""" """),_display_(/*20.54*/email),format.raw/*20.59*/(""" """)))}/*20.61*/.getOrElse("Not Available")),format.raw/*20.88*/("""</li>
            <li>Authentication method: """),_display_(/*21.41*/linked/*21.47*/.authMethod),format.raw/*21.58*/("""</li>
        </ul>

        """),_display_(/*24.10*/linked/*24.16*/.oAuth1Info.map/*24.31*/ { info =>_display_(Seq[Any](format.raw/*24.41*/("""
        """),format.raw/*25.9*/("""<h4>OAuth1 Info</h4>

        <ul>
            <li>Token: """),_display_(/*28.25*/info/*28.29*/.token),format.raw/*28.35*/("""</li>
            <li>Secret: """),_display_(/*29.26*/info/*29.30*/.secret),format.raw/*29.37*/("""</li>
        </ul>
        """)))}),format.raw/*31.10*/("""

        """),_display_(/*33.10*/linked/*33.16*/.oAuth2Info.map/*33.31*/ { info =>_display_(Seq[Any](format.raw/*33.41*/("""
        """),format.raw/*34.9*/("""<h4>OAuth2 Info</h4>

        <ul>
            <li>Access Token: """),_display_(/*37.32*/info/*37.36*/.accessToken),format.raw/*37.48*/("""</li>
            """),_display_(/*38.14*/info/*38.18*/.tokenType.map/*38.32*/ { t =>_display_(Seq[Any](format.raw/*38.39*/(""" """),format.raw/*38.40*/("""<li>Token Type: """),_display_(/*38.57*/t),format.raw/*38.58*/("""</li> """)))}),format.raw/*38.65*/("""
            """),_display_(/*39.14*/info/*39.18*/.expiresIn.map/*39.32*/ { exp =>_display_(Seq[Any](format.raw/*39.41*/(""" """),format.raw/*39.42*/("""<li>Expires in: """),_display_(/*39.59*/exp),format.raw/*39.62*/(""" """),format.raw/*39.63*/("""seconds</li>""")))}),format.raw/*39.76*/("""
            """),_display_(/*40.14*/info/*40.18*/.refreshToken.map/*40.35*/ { rt =>_display_(Seq[Any](format.raw/*40.43*/(""" """),format.raw/*40.44*/("""<li>Refresh Token: """),_display_(/*40.64*/rt),format.raw/*40.66*/("""</li>""")))}),format.raw/*40.72*/("""
        """),format.raw/*41.9*/("""</ul>
        """)))}),format.raw/*42.10*/("""

        """),format.raw/*44.9*/("""<hr>
    """)))}),format.raw/*45.6*/("""
"""),format.raw/*46.1*/("""</div>

<a class="btn" href="/">Ok</a>
""")))}))
      }
    }
  }

  def render(current:service.DemoUser,linkedIdentities:java.util.List[securesocial.core.BasicProfile]): play.twirl.api.HtmlFormat.Appendable = apply(current,linkedIdentities)

  def f:((service.DemoUser,java.util.List[securesocial.core.BasicProfile]) => play.twirl.api.HtmlFormat.Appendable) = (current,linkedIdentities) => apply(current,linkedIdentities)

  def ref: this.type = this

}


}

/**/
object linkResult extends linkResult_Scope0.linkResult
              /*
                  -- GENERATED --
                  DATE: Thu Jan 14 14:40:50 CET 2016
                  SOURCE: /home/xy/PROG/STUDIUM/testing/newTesting/03_fingu/secureSocialTest/app/views/linkResult.scala.html
                  HASH: 2169643582568a1eec0bd0084f80cccae1b04265
                  MATRIX: 812->1|1000->94|1032->101|1082->143|1121->145|1148->146|1219->191|1234->198|1283->227|1317->235|1332->242|1382->271|1445->307|1461->314|1511->343|1635->441|1660->457|1673->461|1723->473|1759->482|1791->487|1806->493|1838->504|1874->513|1946->558|1961->564|1989->571|2050->605|2065->611|2096->621|2157->655|2172->661|2202->670|2263->704|2278->710|2308->719|2374->758|2389->764|2421->775|2478->805|2493->811|2512->821|2561->832|2590->834|2616->839|2637->841|2685->868|2758->914|2773->920|2805->931|2862->961|2877->967|2901->982|2949->992|2985->1001|3071->1060|3084->1064|3111->1070|3169->1101|3182->1105|3210->1112|3270->1141|3308->1152|3323->1158|3347->1173|3395->1183|3431->1192|3524->1258|3537->1262|3570->1274|3616->1293|3629->1297|3652->1311|3697->1318|3726->1319|3770->1336|3792->1337|3830->1344|3871->1358|3884->1362|3907->1376|3954->1385|3983->1386|4027->1403|4051->1406|4080->1407|4124->1420|4165->1434|4178->1438|4204->1455|4250->1463|4279->1464|4326->1484|4349->1486|4386->1492|4422->1501|4468->1516|4505->1526|4545->1536|4573->1537
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|36->5|36->5|36->5|36->5|36->5|36->5|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|44->13|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|55->24|55->24|55->24|55->24|56->25|59->28|59->28|59->28|60->29|60->29|60->29|62->31|64->33|64->33|64->33|64->33|65->34|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|73->42|75->44|76->45|77->46
                  -- GENERATED --
              */
          