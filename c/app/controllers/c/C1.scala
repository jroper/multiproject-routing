package controllers.c

import play.api.mvc._

class C1 extends Controller {
  def get = Action {
    Ok("c")
  }

  def save = Action {
    Redirect(controllers.c.routes.C1.get)
  }
}
