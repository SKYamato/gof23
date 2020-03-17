package co.zs._03factory.v3_abstractfactory;

import co.zs._03factory.v3_abstractfactory.factory.AbstractFactory;
import co.zs._03factory.v3_abstractfactory.factory.Food;
import co.zs._03factory.v3_abstractfactory.factory.Vehicle;
import co.zs._03factory.v3_abstractfactory.factory.Weapon;
import co.zs._03factory.v3_abstractfactory.factory.ext.MagicFactory;

/**
 * @author shuai
 * @date 2020/03/13 15:24
 */
public class Main {
    public static void main(String[] args) {
        //AbstractFactory factory = new ModernFactory();
        AbstractFactory factory = new MagicFactory();

        Vehicle v = factory.createVehicle();
        v.run();

        Weapon w = factory.createWeapon();
        w.attack();

        Food f = factory.createFood();
        f.printName();
    }
}
