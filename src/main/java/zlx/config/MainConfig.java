package zlx.config;


import org.springframework.context.annotation.*;

import zlx.bean.Person;

@Configuration
public class MainConfig {
    @Lazy
    @Bean
    public Person person(){
        return  new Person("zhangyanrui",19);
    }
}
