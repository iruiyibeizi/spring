import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import zlx.config.MainConfig;
import zlx.config.MyTypeFilter;

public class BeanWithLifeTest {
    //populateBean() 给bean进行属性赋值
    // 然后调用initalizaBean(){


    //    }
    @Test
    public void testBeanPostProcessor(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = mainConfig.getBeanDefinitionNames();
        System.out.println("开始打印bean名字");
        for(String s :beanDefinitionNames){
            System.out.println(s);
        }
        mainConfig.close();
    }


}
