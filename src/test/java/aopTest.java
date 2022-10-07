import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.aop.MathCalculator;
import zlx.config.ImportConfig;
import zlx.config.MainConfig2;
import zlx.config.MainConfigOfAop;

public class aopTest {
    //注册AnnotationAwareAspectJAutoProxyCreator
    @Test
    public void test01(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfigOfAop.class);
        MathCalculator bean = mainConfig.getBean(MathCalculator.class);
        bean.div(0,2);

    }
    @Test
    public void test2(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = mainConfig.getBeanDefinitionNames();
        for(String s:beanDefinitionNames){
            System.out.println(s);
        }


    }
    @Test
    public void ipmort(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] beanDefinitionNames = mainConfig.getBeanDefinitionNames();
        for(String s:beanDefinitionNames){
            System.out.println(s);
        }
    }

}
