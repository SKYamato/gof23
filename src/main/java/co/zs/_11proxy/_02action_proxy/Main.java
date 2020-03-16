package co.zs._11proxy._02action_proxy;

import lombok.SneakyThrows;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * 利用反射动态代理
 *
 * @author shuai
 * @date 2020/03/16 16:43
 */
public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Movable proxy = (Movable) Proxy.newProxyInstance(
                tank.getClass().getClassLoader(), new Class[]{Movable.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
                        System.out.println("method: " + method.getName() + " start...");
                        Object o = method.invoke(tank, args);
                        System.out.println("method: " + method.getName() + " end...");
                        return o;
                    }
                });
        proxy.move();
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