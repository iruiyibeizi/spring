package zlx.config;


import org.springframework.context.annotation.*;

import zlx.bean.Dog;
import zlx.bean.Person;

@Configuration
//@ComponentScan(value ="zlx",
 //   includeFilters ={//@ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class}),
   //     @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})},useDefaultFilters = false)
@ComponentScan
public class MainConfig {
    @Scope("prototype")
    @Bean
    public Person person(){
        System.out.println("多实例");
        return  new Person("zhangyanrui",19);
    }
    @Bean
    public Dog dog(){
        System.out.println("单例");
        return new Dog("abc");
    }
}
