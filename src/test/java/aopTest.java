import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.aop.MathCalculator;
import zlx.config.ImportConfig;
import zlx.config.MainConfig2;
import zlx.config.MainConfigOfAop;

public class aopTest {
    //注册AnnotationAwareAspectJAutoProxyCreator
    //1.创建ioc容器,传入配置类
    //2.注册配置类，调用refresh()刷新容器
    //3.registerBeanPostProcessors（）注册bean 后置处理器.拦截bean的创建

    /**
     * 3.1先从beanfactory容器获取已经定义的需要创建对象的所有beanPostProcessor
     * String[] postProcessorNames = beanFactory.getBeanNamesForType(BeanPostProcessor.class, true, false);
     * 3.2给beanfactory添加别的beanpostProcessor
     * beanFactory.addBeanPostProcessor(new BeanPostProcessorChecker(beanFactory, beanProcessorTargetCount));
     * AnnotationAwareAspectJAutoProxyCreator=> AspectJAwareAdvisorAutoProxyCreator=>AbstractAdvisorAutoProxyCreator=>AbstractAutoProxyCreator=>
     *
     *
     */
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
