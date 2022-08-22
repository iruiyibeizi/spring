package zlx.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    /**
     * AnnotationMetadata显示import注解的类的所有注解信息
     * @param importingClassMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                "zlx.bean.Red","zlx.bean.Yellow","zlx.bean.Blue"
        };
    }
}
