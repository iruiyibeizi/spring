package zlx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import zlx.aop.LogAspects;
import zlx.aop.MathCalculator;
@EnableAspectJAutoProxy
public class MainConfigOfAop {
    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }
    @Bean
    public LogAspects logAspects(){
        return  new LogAspects();
    }
}
