package day5.configuration;

import day5.profile.Production;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration
@Production
@Profile("production")
@ImportResource("classpath:/applicationContext.xml")
public class JndiDataConfig {

    @Bean
    public void testProfileAnnotation() {
        System.out.println("Production annotation test done");
    }
}
