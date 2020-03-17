package co.zs._18prototype.v1;

import lombok.SneakyThrows;

/**
 * 原型模式
 * 浅克隆
 *
 * @author shuai
 * @date 2020/03/17 15:37
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        System.out.println(p1.loc == p2.loc);
        p1.loc.name = "SH";
        System.out.println("p2.loc: " + p2.loc.name);
    }
}

class Person implements Cloneable {
    String name = "张三";
    Integer age = 18;
    Location loc = new Location("BJ");

    @Override
    @SneakyThrows
    public Object clone() {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", loc=" + loc +
                '}';
    }
}

class Location {
    String name;

    public Location(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                '}';
    }
}