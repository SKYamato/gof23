package co.zs._03factory.v3_abstractfactory.domain;

import co.zs._03factory.v3_abstractfactory.factory.Food;

/**
 * @author shuai
 * @date 2020/03/13 15:43
 */
public class MushRoom extends Food {
    @Override
    public void printName() {
        System.out.println("dmg");
    }
}
