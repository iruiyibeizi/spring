import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zlx.config.MainConfig2;
import zlx.ext.ExtConfig;

public class testExt {
    @Test
    public void tsetext(){
        AnnotationConfigApplicationContext mainConfig = new AnnotationConfigApplicationContext(ExtConfig.class);

    }
}
