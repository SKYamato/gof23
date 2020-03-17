package co.zs._03factory.v2_factorymethod;

import co.zs._03factory.v0_temp.Aircraft;

/**
 * @author shuai
 * @date 2020/03/13 15:16
 */
public class AircraftFactory {
    public Aircraft create() {
        return new Aircraft();
    }
}
