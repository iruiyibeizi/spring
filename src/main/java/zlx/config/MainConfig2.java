package zlx.config;

import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import zlx.bean.Color;
import zlx.bean.Person;
import zlx.bean.Red;

@Configuration
@ComponentScan(value ="zlx",
    includeFilters ={//@ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class}),
@ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})},useDefaultFilters = false)
@Import({Color.class, Red.class,MyImportSelector.class})
public class MainConfig2 {
    //@Lazy
    @Conditional({WindowsCondition.class})
    @Bean
    public Person person(){
        System.out.println("创建person");
        return  new Person("zhangyanrui",19);
    }
    @Conditional({LinuxCondition.class})
    @Bean("zhao")
    public Person person1(){
        return new Person("zhao",19);
    }
}
