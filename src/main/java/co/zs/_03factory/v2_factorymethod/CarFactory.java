package co.zs._03factory.v2_factorymethod;

import co.zs._03factory.v0_temp.Car;

/**
 * @author shuai
 * @date 2020/03/13 15:15
 */
public class CarFactory {
    public Car create(){
        System.out.println("New Car");
        return new Car();
    }
}
