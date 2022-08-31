import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.bean.Person;
import zlx.config.MainConfig2;
import zlx.config.MainConfigOfPropertyValues;

public class FuzhiTest {
    @Test
    public void test01(){
        //autowried 按照类型赋值
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(
            MainConfigOfPropertyValues.class);
        Person bean = mainConfig.getBean(Person.class);
        System.out.println(bean);
    }

}
