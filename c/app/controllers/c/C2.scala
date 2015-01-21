package controllers.c

import play.api.mvc._

class C2 extends Controller {
  def get = Action {
    Redirect(controllers.c.routes.C1.get)
  }

  def save = Action {
    Redirect(controllers.c.routes.C2.get)
  }

}
