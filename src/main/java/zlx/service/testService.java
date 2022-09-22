package zlx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testService {
    @Autowired
    private BookService bookService;
    void f3(){
        System.out.println("f3");
    }
    void f4(){
        bookService.f1();
    }
}
