import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.aop.MathCalculator;
import zlx.config.MainConfigOfAop;

public class aopTest {
    //注册AnnotationAwareAspectJAutoProxyCreator
    @Test
    public void test01(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfigOfAop.class);
        MathCalculator bean = mainConfig.getBean(MathCalculator.class);
        bean.div(0,2);

    }

}
