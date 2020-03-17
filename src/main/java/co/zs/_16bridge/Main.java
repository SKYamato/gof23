package co.zs._16bridge;

/**
 * 桥接模式
 *
 * 分离抽象与具体实现，让他们可以独自发展
 * Gift -> WarmGift ColdGift...
 * GiftImpl -> Flower Book...
 *
 * @author shuai
 * @date 2020/03/17 14:30
 */
public class Main {
    public static void main(String[] args) {
        Gift gift = new WarmGift(new Flower());
    }
}

abstract class Gift {
    GiftImpl gift;
}

class GiftImpl extends Gift {
}

class Flower extends GiftImpl {
}

class Book extends GiftImpl {
}

class WarmGift extends Gift {
    public WarmGift(GiftImpl gift) {
        this.gift = gift;
    }
}

class CollGift extends Gift{
    public CollGift(GiftImpl gift) {
        this.gift = gift;
    }
}