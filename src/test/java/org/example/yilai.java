package org.example;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.config.MainConfig3;
import zlx.service.BookService;

public class yilai {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(MainConfig3.class);
        BookService bookService = mainConfig.getBean(BookService.class);
       bookService.f2();

    }
}
