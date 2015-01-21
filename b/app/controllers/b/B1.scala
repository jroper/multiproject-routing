package controllers.b

import play.api.mvc._

class B1 extends Controller {
  def get = Action {
    Ok("b")
  }

  def save = Action {
    Redirect(controllers.b.routes.B1.get)
  }
}
