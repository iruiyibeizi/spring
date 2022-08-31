import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.config.MainConfig;

public class BeanLifeTest {
    @Test
    public void test01(){
        System.out.println("test01");
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig.class);
    }

}
