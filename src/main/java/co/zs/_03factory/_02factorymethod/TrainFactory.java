package co.zs._03factory._02factorymethod;

import co.zs._03factory._0temp.Train;

/**
 * @author shuai
 * @date 2020/03/13 15:15
 */
public class TrainFactory {
    public Train create(){
        return new Train();
    }
}
