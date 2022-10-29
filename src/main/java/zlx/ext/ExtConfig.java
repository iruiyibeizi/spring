package zlx.ext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zlx.bean.Blue;

@ComponentScan("zlx.ext")
@Configuration
public class ExtConfig {
    @Bean
    public Blue blue(){
        return new Blue();
    }
}
