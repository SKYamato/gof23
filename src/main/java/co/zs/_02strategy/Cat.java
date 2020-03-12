package co.zs._02strategy;

/**
 * @author shuai
 * @date 2020/03/12 10:00
 */
public class Cat implements MyComparable<Cat> {

    private int age;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.age > cat.age) return 1;
        else if(this.age < cat.age) return -1;
        else return 0;
    }
}
