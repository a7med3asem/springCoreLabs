import com.practice.service.SpeakerService;
import com.practice.service.impl.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Hard coded
//        SpeakerService service = new SpeakerServiceImpl();

        // Not hard coded
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        SpeakerService service = context.getBean("speakerService", SpeakerService.class);
//
//        System.out.println(service);
//
//        System.out.println(service.findAll().get(0).getFirstName());
//
        /*
         * In case of Singleton
         * This will not instantiate new object of SpeakerService because it is singleton
         * Same reference will be returned
         * */
//        SpeakerService service2 = context.getBean("speakerService", SpeakerService.class);
//        System.out.println(service2);

        // XML Configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        SpeakerService service2 = context.getBean("speakerService", SpeakerService.class);
//        System.out.println(service2);
    }
}
