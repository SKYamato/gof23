package co.zs._03factory.v3_abstractfactory.factory;

/**
 * @author shuai
 * @date 2020/03/13 15:45
 */
public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();

    public abstract Food createFood();

    public abstract Weapon createWeapon();
}
