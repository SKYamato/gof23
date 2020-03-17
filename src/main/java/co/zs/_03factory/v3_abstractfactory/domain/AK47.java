package co.zs._03factory.v3_abstractfactory.domain;

import co.zs._03factory.v3_abstractfactory.factory.Weapon;

/**
 * @author shuai
 * @date 2020/03/13 15:29
 */
public class AK47 extends Weapon {
    @Override
    public void attack() {
        System.out.println("dougang...");
    }
}
