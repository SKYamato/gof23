package co.zs._03factory._03abstractfactory.domain;

import co.zs._03factory._03abstractfactory.factory.Weapon;

/**
 * @author shuai
 * @date 2020/03/13 15:43
 */
public class MagicStick extends Weapon {
    @Override
    public void attack() {
        System.out.println("hasya......");
    }
}
