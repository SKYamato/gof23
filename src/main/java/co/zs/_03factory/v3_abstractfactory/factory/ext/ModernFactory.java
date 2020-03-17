package co.zs._03factory.v3_abstractfactory.factory.ext;

import co.zs._03factory.v3_abstractfactory.domain.AK47;
import co.zs._03factory.v3_abstractfactory.domain.Bread;
import co.zs._03factory.v3_abstractfactory.domain.Car;
import co.zs._03factory.v3_abstractfactory.factory.AbstractFactory;
import co.zs._03factory.v3_abstractfactory.factory.Food;
import co.zs._03factory.v3_abstractfactory.factory.Vehicle;
import co.zs._03factory.v3_abstractfactory.factory.Weapon;

/**
 * @author shuai
 * @date 2020/03/13 15:48
 */
public class ModernFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}
