package co.zs._03factory._03abstractfactory.factory.ext;

import co.zs._03factory._03abstractfactory.domain.Broom;
import co.zs._03factory._03abstractfactory.domain.MagicStick;
import co.zs._03factory._03abstractfactory.domain.MushRoom;
import co.zs._03factory._03abstractfactory.factory.AbstractFactory;
import co.zs._03factory._03abstractfactory.factory.Food;
import co.zs._03factory._03abstractfactory.factory.Vehicle;
import co.zs._03factory._03abstractfactory.factory.Weapon;

/**
 * @author shuai
 * @date 2020/03/13 15:47
 */
public class MagicFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Food createFood() {
        return new MushRoom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}
