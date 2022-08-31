package zlx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zlx.bean.Car;
import zlx.bean.Color;

@Configuration
@ComponentScan({"zlx.bean"})
public class MainConfigOfAutowried {
   @Bean
    public Color color(Car car){
       Color color = new Color();
       color.setCar(car);
       return color;
   }

}
