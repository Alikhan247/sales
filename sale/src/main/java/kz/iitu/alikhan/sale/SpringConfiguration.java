package kz.iitu.alikhan.sale;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("kz.iitu.alikhan.sale")
@PropertySource("application.properties")
public class SpringConfiguration {

}
