package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def a = Action {
    Redirect(controllers.a.routes.A1.get)
  }
  def b = Action {
    Redirect(controllers.b.routes.B1.get)
  }
  def c = Action {
    Redirect(controllers.c.routes.C1.get)
  }
}
