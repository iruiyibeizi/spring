package zlx.config;

import com.sun.deploy.security.ValidationState;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import zlx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value ="zlx",
    includeFilters ={//@ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class}),
@ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})},useDefaultFilters = false)
public class MainConfig {
    @Bean
    public Person person(){
        return  new Person("zhangyanrui",19);
    }
}
