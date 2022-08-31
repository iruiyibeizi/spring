package zlx.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements ApplicationContextAware, BeanNameAware {
    String name;
    ApplicationContext applicationContext;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }
    @PostConstruct
    public void init(){
        System.out.println("Dog...@PostConstruct");
    }
    @PreDestroy
    public void detory(){
        System.out.println("Dog...@PreDestory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("beanName:"+name);
    }
}
