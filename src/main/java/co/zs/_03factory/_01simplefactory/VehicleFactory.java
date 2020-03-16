package co.zs._03factory._01simplefactory;

import co.zs._03factory._0temp.Car;
import co.zs._03factory._0temp.Aircraft;
import co.zs._03factory._0temp.Train;

/**
 * @author shuai
 * @date 2020/03/13 15:13
 */
public class VehicleFactory {
    public Car createCar(){
        return new Car();
    }

    public Train createTrain(){
        return new Train();
    }

    public Aircraft crateAircraft(){
        return new Aircraft();
    }
}
