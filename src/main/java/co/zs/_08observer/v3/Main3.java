package co.zs._08observer.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 *
 * @author shuai
 * @date 2020/03/16 13:38
 */
public class Main3 {
    public static void main(String[] args) {
        Child c = new Child();
        c.wakeUp();
    }
}

class Child {
    boolean cry = false;

    List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    boolean isCry() {
        return cry;
    }

    void wakeUp() {
        this.cry = true;
        for (Observer observer : observers) {
            observer.doOnWakeUp(new WeakUpEvent(System.currentTimeMillis(), "bed", this));
        }
    }
}

class WeakUpEvent {
    long time;
    String location;
    Child source;

    public WeakUpEvent(long time, String location, Child source) {
        this.time = time;
        this.location = location;
        this.source = source;
    }
}

interface Observer {
    void doOnWakeUp(WeakUpEvent event);
}

class Dad implements Observer {

    @Override
    public void doOnWakeUp(WeakUpEvent event) {
        System.out.println("Dad feed....");
    }
}

class Mum implements Observer {

    @Override
    public void doOnWakeUp(WeakUpEvent event) {
        System.out.println("Mum hugging...");
    }
}

class Dog implements Observer {

    @Override
    public void doOnWakeUp(WeakUpEvent event) {
        System.out.println("Dog wang...");
    }
}