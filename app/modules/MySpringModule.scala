package modules

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.guice.module.SpringModule


class MySpringModule
  extends SpringModule(new AnnotationConfigApplicationContext(classOf[AppConfig])) {

}
