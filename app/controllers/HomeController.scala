package controllers
import java.sql._
import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.db._
import anorm._

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
      val result:List[String] = SQL("Select * from people").as(SqlParser.str("name").*)
      Ok(views.html.index(
        "People Data.", result
      ))
    }
  }



}
