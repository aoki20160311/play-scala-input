
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, header: String, footer: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen"
        href=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.63*/("""">
        <link rel="shortcut icon" type="image/png"
        href=""""),_display_(/*11.16*/routes/*11.22*/.Assets.versioned("images/favicon.png")),format.raw/*11.61*/("""">
    </head>
    <body>
        <header class="row">
            <div class="header">"""),_display_(/*15.34*/header),format.raw/*15.40*/("""</div>
            <h1>"""),_display_(/*16.18*/title),format.raw/*16.23*/("""</h1>
        </header>
        <article class="row">
        """),_display_(/*19.10*/content),format.raw/*19.17*/("""
        """),format.raw/*20.9*/("""</article>
        <footer class="row">
            <p>"""),_display_(/*22.17*/footer),format.raw/*22.23*/("""</p>
        </footer>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.versioned("javascripts/main.js")),format.raw/*24.69*/(""""
        type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,header:String,footer:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,header,footer)(content)

  def f:((String,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,header,footer) => (content) => apply(title,header,footer)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Feb 10 18:39:34 JST 2019
                  SOURCE: /Users/apple/play_lessons/lesson_2/play-scala-myapp/app/views/main.scala.html
                  HASH: 4051f598f19d6fad595799f19225ca84b9828943
                  MATRIX: 747->1|903->64|931->66|1017->126|1042->131|1138->201|1152->207|1213->248|1309->317|1324->323|1384->362|1499->450|1526->456|1577->480|1603->485|1693->548|1721->555|1757->564|1840->620|1867->626|1939->671|1954->677|2015->717
                  LINES: 21->1|26->2|28->4|31->7|31->7|33->9|33->9|33->9|35->11|35->11|35->11|39->15|39->15|40->16|40->16|43->19|43->19|44->20|46->22|46->22|48->24|48->24|48->24
                  -- GENERATED --
              */
          