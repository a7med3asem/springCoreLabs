import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("day3Annotations.xml");


//        AccountService accountService = context.getBean("accountService",AccountService.class) ;
//        accountService.printMessage("hahahahahaha");
//        ComplexObject complexObject = (ComplexObject) context.getBean("child");
//        System.out.println("List content is ");
//        complexObject.getAdminEmails2().forEach(System.out::println);

    }
}