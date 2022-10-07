package zlx.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import zlx.bean.Dog;

public class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if(registry.containsBeanDefinition("zlx.bean.Red"))
            registry.registerBeanDefinition("dog",new RootBeanDefinition(Dog.class));

    }
}
