package co.zs._03factory._03abstractfactory.domain;

import co.zs._03factory._03abstractfactory.factory.Vehicle;

/**
 * @author shuai
 * @date 2020/03/13 15:43
 */
public class Broom extends Vehicle {
    @Override
    public void run() {
        System.out.println("syou......");
    }
}
