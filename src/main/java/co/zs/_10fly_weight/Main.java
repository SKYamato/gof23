package co.zs._10fly_weight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 享元模式
 *
 * @author shuai
 * @date 2020/03/16 15:39
 */
public class Main {
    public static void main(String[] args) {
        CupPool pool = new CupPool();
        Cup cup = pool.get();
        System.out.println(cup);
    }
}

class Cup {
    String id;
    boolean alive;

    public Cup(String id) {
        this.id = id;
        this.alive = true;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "id=" + id +
                ", alive=" + alive +
                '}';
    }
}

class CupPool {
    List<Cup> cups = new ArrayList<>();

    {
        for (int i = 0; i < 5; i++) {
            cups.add(new Cup(UUID.randomUUID().toString()));
        }
    }

    Cup get() {
        for (Cup cup : cups) {
            if (cup.alive) {
                return cup;
            }
        }
        return new Cup(UUID.randomUUID().toString());
    }
}
