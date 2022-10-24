package org.example;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.config.TxConfig;
import zlx.service.UserService;

public class dataTest {

    @Test
    public void testInsert(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService bean = annotationConfigApplicationContext.getBean(UserService.class);
        bean.insertUser();



    }
}
