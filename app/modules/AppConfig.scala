package modules

import org.springframework.context.annotation.{ComponentScan, Configuration}

@Configuration
@ComponentScan(basePackages = Array("modules"))
class AppConfig {

}
