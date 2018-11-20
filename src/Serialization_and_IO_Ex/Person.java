package Serialization_and_IO_Ex;

import java.io.Serializable;

/**
 * @author Weichen Wang
 * @date 2018/11/14 - 12:52 PM
 */
public class Person implements Serializable {
    private String name;
    private int age;

    public Person() {
        name = "unassigned";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
