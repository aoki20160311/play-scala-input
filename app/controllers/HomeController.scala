package controllers
import java.sql._

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.db._
import anorm._
import PersonForm._

@Singleton
class HomeController @Inject()(db: Database, cc: MessagesControllerComponents)
  extends MessagesAbstractController(cc) {


//  def index() = Action {implicit request =>
//    var msg = "database record:<br><ul>"
//    try {
//      db.withConnection { conn =>
//        val stmt = conn.createStatement
//        val rs = stmt.executeQuery("SELECT * from people")
//        while (rs.next) {
//          msg += "<li>" + rs.getInt("id") + ":" + rs.getString("name") + "</li>"
//        }
//        msg += "</ul>"
//      }
//    } catch {
//      case e:SQLException =>
//        msg = "<li>no record...</li>"
//    }
//    Ok(views.html.index(
//      msg
//    ))

  def index() = Action {implicit request =>
    db.withConnection { implicit conn =>
      val result:List[PersonForm.PersonData] =
        SQL("Select * from people").as(personparser.*)
      Ok(views.html.index(
        "People Data.", result
      ))
    }
  }

  def add() = Action {implicit request =>
    Ok(views.html.add(
      "フォームを記入して下さい。",
      form
    ))
  }


//  def create() = Action { implicit request =>
//    val formdata = form.bindFromRequest
//    val data = formdata.get
//    try
//      db.withConnection { conn =>
//        val ps = conn.PreparedStatement(
//          "insert into people values (default, ?, ?, ?)")
//        ps.setString(1, data.name)
//        ps.setString(2, data.mail)
//        ps.setString(3, data.tel)
//        ps.executeUpdate
//      }
//    catch {
//      case e: SQLException =>
//        Ok(views.html.add(
//          "フォームに入力して下さい。",
//          form
//        ))
//    }
//    Redirect(routes.HomeController.index)
//  }

  def show(id:Int) = Action {implicit request =>
    db.withConnection { implicit conn =>
      val result:PersonData
      = SQL("Select * from people where id = {id}")
        .on("id" -> id)
        .as(personparser.single)
      Ok(views.html.show(
        "People Data.", result
      ))
    }
  }

  def create() = Action { implicit request =>
    val formdata = form.bindFromRequest
    val data = formdata.get
    db.withConnection { implicit conn =>
      SQL("insert into people values (default, {name}, {mail}, {tel})")
        .on(
          "name" -> data.name,
          "mail" -> data.mail,
          "tel" -> data.tel
        ).executeInsert()
      Redirect(routes.HomeController.index)
    }
  }


}
