package co.zs._11proxy._01static_proxy;

import lombok.SneakyThrows;

import java.util.Random;

/**
 * 静态代理
 *
 * @author shuai
 * @date 2020/03/16 16:12
 */
public class Main {
    public static void main(String[] args) {
        new TankLogProxy(new TankTimeProxy(new Tank())).move();
    }
}

interface Movable {
    void move();
}

class Tank implements Movable {

    @SneakyThrows
    @Override
    public void move() {
        System.out.println("kakaka...");
        Thread.sleep(new Random().nextInt(10000));
    }
}

class TankTimeProxy implements Movable {
    Movable movable;

    public TankTimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println("用时： " + (end - start) + "毫秒");
    }
}

class TankLogProxy implements Movable {
    Movable movable;

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        movable.move();
        System.out.println("end moving...");
    }
}