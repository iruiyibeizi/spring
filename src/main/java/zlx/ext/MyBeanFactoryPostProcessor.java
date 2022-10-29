package zlx.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor...post");
        System.out.println("beanDefinition数量："+beanFactory.getBeanDefinitionCount());

        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for(String s: beanDefinitionNames){
            System.out.println(s);
        }


    }
}
