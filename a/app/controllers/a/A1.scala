package controllers.a

import play.api.mvc._

class A1 extends Controller {
  def get = Action {
    Ok("a")
  }

  def save = Action {
    Redirect(controllers.a.routes.A1.get)
  }
}
