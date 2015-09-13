package controllers

import javax.inject.Inject

import modules.MyBeanA
import play.api.mvc._

class Application extends Controller {

  @Inject
  var  myBeanA:MyBeanA = null

  def index = Action {
    val message = myBeanA.getMessage()
    Ok(views.html.index("MyBeanA.message=" + message))
  }

}
