package co.zs._08observer.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuai
 * @date 2020/03/16 13:38
 */
public class Main2 {
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
            observer.doOnWakeUp();
        }
    }
}

interface Observer {
    void doOnWakeUp();
}

class Dad implements Observer {

    @Override
    public void doOnWakeUp() {
        System.out.println("Dad feed....");
    }
}

class Mum implements Observer {

    @Override
    public void doOnWakeUp() {
        System.out.println("Mum hugging...");
    }
}

class Dog implements Observer {

    @Override
    public void doOnWakeUp() {
        System.out.println("Dog wang...");
    }
}