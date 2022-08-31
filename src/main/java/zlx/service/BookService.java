package zlx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zlx.dao.BookDao;

@Service
public class BookService {
    @Autowired
    private BookDao bookdao2;

    @Override
    public String toString() {
        return "BookService{" + "bookDao=" + bookdao2 + '}';
    }
}
