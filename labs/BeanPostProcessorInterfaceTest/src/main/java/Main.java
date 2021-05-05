import beans.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanPostProcessorInterfaceTest.xml");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        /*
        BeforeInitialization : helloWorld
        Bean is going to be initialized
        AfterInitialization : helloWorld
        */

        System.out.println(helloWorld.getMessage());
        context.close();

        /*
        BeforeInitialization : helloWorld
        Bean is going to be initialized
        AfterInitialization : helloWorld
        Hello bean
        Bean is going to be destroyed
        */
    }
}
