
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String, result:List[String] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/main("Index Page", "Hello", "copyright 2018.")/*4.48*/ {_display_(Seq[Any](format.raw/*4.50*/("""
    """),format.raw/*5.5*/("""<p>"""),_display_(/*5.9*/Html(message)),format.raw/*5.22*/("""</p>
    <ul>
    """),_display_(/*7.6*/for(item<-result) yield /*7.23*/{_display_(Seq[Any](format.raw/*7.24*/("""
        """),format.raw/*8.9*/("""<li>"""),_display_(/*8.14*/item),format.raw/*8.18*/("""</li>
    """)))}),format.raw/*9.6*/("""
    """),format.raw/*10.5*/("""</ul>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(message:String,result:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(message,result)

  def f:((String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (message,result) => apply(message,result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Feb 10 21:09:31 JST 2019
                  SOURCE: /Users/apple/play_lessons/lesson_2/play-scala-myapp/app/views/index.scala.html
                  HASH: 81ae04a64ebe654dca6c49253c3657e0231f8ce9
                  MATRIX: 742->1|874->40|902->43|956->89|995->91|1026->96|1055->100|1088->113|1132->132|1164->149|1202->150|1237->159|1268->164|1292->168|1332->179|1364->184|1401->191
                  LINES: 21->1|26->2|28->4|28->4|28->4|29->5|29->5|29->5|31->7|31->7|31->7|32->8|32->8|32->8|33->9|34->10|35->11
                  -- GENERATED --
              */
          