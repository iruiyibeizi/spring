import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.config.MainConfig;

public class BeanWithLifeTest {
    //populateBean() 给bean进行属性赋值
    // 然后调用initalizaBean(){


    //    }
    @Test
    public void testBeanPostProcessor(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("容器创建完成");
        String[] beanDefinitionNames = mainConfig.getBeanDefinitionNames();
        System.out.println("开始打印bean名字");
        for(String s :beanDefinitionNames){
            System.out.println(s);
        }
        mainConfig.close();
    }


}
