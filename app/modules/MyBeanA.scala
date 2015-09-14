package modules

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MyBeanA @Autowired() (myBeanB: MyBeanB){

  def  getMessage  = myBeanB.getMessage
}
