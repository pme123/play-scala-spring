package modules

import org.springframework.context.annotation.{ComponentScan, Configuration}

/**
 * Created by pascal.mengelt on 13.09.2015.
 */
@Configuration
@ComponentScan(basePackages = Array("modules"))
class AppConfig {

}
