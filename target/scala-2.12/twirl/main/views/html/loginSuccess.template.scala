
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
/*1.2*/import helper._

object loginSuccess extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Index Page", "Hello", "copyright 2018.")/*3.48*/{_display_(Seq[Any](format.raw/*3.49*/("""
    """),format.raw/*4.5*/("""<font size=5>■ログイン成功</font>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Feb 10 19:39:20 JST 2019
                  SOURCE: /Users/apple/play_lessons/lesson_2/play-scala-myapp/app/views/loginSuccess.scala.html
                  HASH: 4d1cb82eb18e9cdb9d582618f0acfdeb28d0709a
                  MATRIX: 432->1|841->19|895->65|933->66|964->71
                  LINES: 17->1|27->3|27->3|27->3|28->4
                  -- GENERATED --
              */
          