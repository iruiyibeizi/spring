package zlx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import zlx.dao.BookDao;
@Configuration
@Import(BookDao.class)
public class ImportConfig {
    //测试import注解作用

}
