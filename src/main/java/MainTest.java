import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zlx.config.MainConfig;

public class MainTest {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person)classPathXmlApplicationContext.getBean(Person.class);
        System.out.println(person);
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for(String s :beanDefinitionNames){
            System.out.println(s);
        }

         */
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = mainConfig.getBeanDefinitionNames();
        for(String s :beanDefinitionNames){
            System.out.println(s);
        }

    }
}
