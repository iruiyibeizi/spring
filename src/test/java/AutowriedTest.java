import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.bean.Color;
import zlx.config.MainConfigOfAutowried;

public class AutowriedTest {
    @Test
    public void testAutowried(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfigOfAutowried.class);

        Color bean = mainConfig.getBean(Color.class);
        System.out.println(bean);
    }
}
