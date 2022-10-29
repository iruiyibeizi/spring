package org.example;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.config.ExtConfig;

public class ExtTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(ExtConfig.class);
        mainConfig.publishEvent(new ApplicationEvent(new String("我发布的事件")){});
        mainConfig.close();
    }
}
