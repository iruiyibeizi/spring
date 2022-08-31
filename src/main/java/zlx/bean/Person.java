package zlx.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person {
    @Value("${person.nickName}")
    private String name;
    @Value("#{20-2}")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public Person(String name,Integer age) {
        System.out.println("创建person");
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
