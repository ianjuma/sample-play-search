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

  def somePage = Action {
    Ok("This is another")
  }

  def fullView = Action {
    Ok(views.html.main("This is another route, it works"))
  }

  def other = TODO

  def index = TODO
  
}
