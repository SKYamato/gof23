package co.zs._03factory._02factorymethod;

import co.zs._03factory._0temp.Aircraft;

/**
 * @author shuai
 * @date 2020/03/13 15:16
 */
public class AircraftFactory {
    public Aircraft create() {
        return new Aircraft();
    }
}
