package controllers.a

import play.api.mvc._

class A2 extends Controller {
  def get = Action {
    Redirect(controllers.a.routes.A1.get)
  }

  def save = Action {
    Redirect(controllers.a.routes.A2.get)
  }

}
