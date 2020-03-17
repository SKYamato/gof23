package co.zs._11proxy._02action_proxy.v3_cglib;

import lombok.SneakyThrows;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * 使用Code Generation Library动态代理
 *
 * @author shuai
 * @date 2020/03/17 9:17
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println(o.getClass().getSuperclass().getName());
                System.out.println("before");
                Object result = methodProxy.invokeSuper(o, objects);
                System.out.println("after");
                return result;
            }
        });
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}

class Tank {
    @SneakyThrows
    public void move() {
        System.out.println("tank move, kakaka...");
        Thread.sleep(new Random().nextInt(1000));
    }
}