package modules

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by pascal.mengelt on 13.09.2015.
 */
@Component
class MyBeanA {

  @Autowired
  var myBeanB:MyBeanB=null

  def  getMessage()  = myBeanB.getMessage()
}
