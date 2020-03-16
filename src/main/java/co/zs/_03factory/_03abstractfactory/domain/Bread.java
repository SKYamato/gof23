package co.zs._03factory._03abstractfactory.domain;

import co.zs._03factory._03abstractfactory.factory.Food;

/**
 * @author shuai
 * @date 2020/03/13 15:30
 */
public class Bread extends Food {

    @Override
    public void printName() {
        System.out.println("rq...");
    }
}
