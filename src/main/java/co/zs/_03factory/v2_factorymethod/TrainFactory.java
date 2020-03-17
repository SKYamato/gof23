package co.zs._03factory.v2_factorymethod;

import co.zs._03factory.v0_temp.Train;

/**
 * @author shuai
 * @date 2020/03/13 15:15
 */
public class TrainFactory {
    public Train create(){
        return new Train();
    }
}
