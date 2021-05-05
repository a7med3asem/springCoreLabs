import day5.dao.Calculator;
import day5.models.Employee;
import day5.models.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", "daoServiceBeans.xml", "testInheritance.xml");

//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        BeanFactory context = (BeanFactory) beanDefinitionRegistry;

        Calculator calculator = (Calculator) context.getBean("calculatorID");

        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.subtract(9, 3));
        System.out.println(calculator.multiply(14, 3));
        System.out.println(calculator.divide(4, 2));

        // Application context will not create objects for these again (Only once on start)
        // These declaration is needed for BeanFactory
//        Service1 service1 = (Service1) context.getBean("service1");
//        Service1 service11 = (Service1) context.getBean("service2");
//        Service1 service12 = (Service1) context.getBean("service3");
//        Service1 service13 = (Service1) context.getBean("service4");

        Person person = (Person) context.getBean("person");
        Employee employee = (Employee) context.getBean("employee");

        person.getName();
        person.getAge();


        employee.getName();
        employee.getAge();
        employee.getRole();
    }
}