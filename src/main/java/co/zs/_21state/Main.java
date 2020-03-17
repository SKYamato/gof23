package co.zs._21state;

/**
 * 状态模式
 *
 * @author shuai
 * @date 2020/03/17 16:56
 */
public class Main {
    public static void main(String[] args) {
        CarStatue carStatue = new CarStoppedStatue();
        Car car = new Car(carStatue);
        car.openTheDoor();
        car.closeTheDoor();
        car.run();
        car.stop();
    }
}

class Car {
    CarStatue carStatue;

    public Car(CarStatue carStatue) {
        this.carStatue = carStatue;
    }

    public void openTheDoor() {
        carStatue.open();
    }

    public void closeTheDoor() {
        carStatue.closed();
    }

    public void run() {
        carStatue.running();
    }

    public void stop() {
        carStatue.stopped();
    }
}

abstract class CarStatue {
    abstract void open();

    abstract void closed();

    abstract void running();

    abstract void stopped();
}

class CarRunningStatue extends CarStatue{
    @Override
    void open() {
        System.out.println("不能开门。。。");
    }

    @Override
    void closed() {
        System.out.println("不能关门。。。");
    }

    @Override
    void running() {
        System.out.println("在跑。。。");
    }

    @Override
    void stopped() {
        System.out.println("可以停车。。。");
    }
}

class CarStoppedStatue extends CarStatue{
    @Override
    void open() {
        System.out.println("能开门。。。");
    }

    @Override
    void closed() {
        System.out.println("能关门。。。");
    }

    @Override
    void running() {
        System.out.println("没在跑。。。");
    }

    @Override
    void stopped() {
        System.out.println("已停车。。。");
    }
}

class CarOpenStatue extends CarStatue{
    @Override
    void open() {
        System.out.println("不能开门。。。");
    }

    @Override
    void closed() {
        System.out.println("能关门。。。");
    }

    @Override
    void running() {
        System.out.println("不能跑。。。");
    }

    @Override
    void stopped() {
        System.out.println("不能停车。。。");
    }
}

class CarClosedStatue extends CarStatue{
    @Override
    void open() {
        System.out.println("能开门。。。");
    }

    @Override
    void closed() {
        System.out.println("不能关门。。。");
    }

    @Override
    void running() {
        System.out.println("不能跑。。。");
    }

    @Override
    void stopped() {
        System.out.println("不能停车。。。");
    }
}