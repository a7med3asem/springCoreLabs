import com.practice.repository.SpeakerRepository;
import com.practice.repository.impl.HibernateSpeakerRepositoryImpl;
import com.practice.service.SpeakerService;
import com.practice.service.impl.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.practice")
public class AppConfig {

    /*
    @Bean(name = "speakerService")
//    @Scope(value = "singleton")
//    @Scope(BeanDefinition.SCOPE_SINGLETON)
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
//        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
//        speakerService.setRepository(getSpeakerRepository());

        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

     */
}
