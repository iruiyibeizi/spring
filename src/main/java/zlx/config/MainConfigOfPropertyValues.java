package zlx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import zlx.bean.Person;
@PropertySource(value = {"classpath:/person.properties"},encoding = "UTF-8")
@Configuration
public class MainConfigOfPropertyValues {
    @Bean
    public Person person(){
        return new Person();
    }
}
