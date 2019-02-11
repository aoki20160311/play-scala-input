//package controllers
//
//import javax.inject._
//import play.api._
//import play.api.mvc._
//import play.api.data._
//import play.api.data.Forms._
//import models._
//import play.api.data.validation.Valid
//import play.api.data.validation.Constraint
//import play.api.data.validation.Invalid
//import play.api.i18n.I18nSupport
//import anorm._
//
//@Singleton
//class LoginController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with I18nSupport {
//
//  // ログインフォーム
//  // 空白チェックにオリジナルメッセージを設定してみる
//  val loginUserForm = Form( mapping("userid" -> text.verifying("ユーザIDを入力してください" , {!_.isEmpty()}) ,
//    "userpw" -> text.verifying("パスワードを入力してください" , {!_.isEmpty()})
//  )
//  (LoginUser.apply)(LoginUser.unapply)
//  )
//
//  // ログイン画面の初期表示
//  def loginInit() = Action { implicit request =>
//    Ok( views.html.login(loginUserForm) )
//  }Q
//
//  // ログイン画面のSubmit
//  def loginSubmit() = Action { implicit request: Request[AnyContent] =>
//    loginUserForm.bindFromRequest.fold(
//      // 入力チェックNG
//      errors => {
//        BadRequest( views.html.login(errors) )
//      },
//      // 入力チェックOK
//      success => {
//        val loginUser = loginUserForm.bindFromRequest.get
//        Ok( views.html.loginSuccess() )
//      }
//    )
//  }
//
//}