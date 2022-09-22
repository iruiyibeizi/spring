package zlx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zlx.dao.BookDao;

@Service
public class BookService {
    @Autowired
    private testService testService1;
    @Autowired
    private BookDao bookdao2;

    @Override
    public String toString() {
        return "BookService{" + "bookDao=" + bookdao2 + '}';
    }

    public void f1(){
        System.out.println("f1");
    }
    public void f2(){
        testService1.f3();
    }
}
