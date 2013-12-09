package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("My App"))
  }

  def anotherPage = Action {
    Ok("Hey, another page is opened!")
  }
  
}
