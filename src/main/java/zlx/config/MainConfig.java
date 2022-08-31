package zlx.config;


import org.springframework.context.annotation.*;

import zlx.bean.Dog;
import zlx.bean.Person;

@Configuration
@ComponentScan(value ="zlx",
    includeFilters ={//@ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})},useDefaultFilters = false)

public class MainConfig {

    @Bean
    public Person person(){
        return  new Person("zhangyanrui",19);
    }
    @Bean
    public Dog dog(){
        return new Dog("abc");
    }
}
