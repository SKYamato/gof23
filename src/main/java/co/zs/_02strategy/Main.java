package co.zs._02strategy;

import co.zs._02strategy.util.Sorter;
import co.zs._02strategy.util.StrategySorter;

import java.util.Arrays;

/**
 * @author shuai
 * @date 2020/03/12 10:01
 */
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(6), new Cat(9), new Cat(5), new Cat(8)};
        /*Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(cats);
        System.out.println(Arrays.toString(cats));*/

        /*int[] a = {4, 2, 9, 8, 3};
        sorter.sort(a);
        System.out.println(Arrays.toString(a));*/

        StrategySorter<Cat> strategySorter = new StrategySorter<>();
        strategySorter.sort(cats,(Cat c1, Cat c2)->{
            if(c1.getAge() < c2.getAge()) return 1;
            else if(c1.getAge() > c2.getAge()) return -1;
            return 0;
        });
        System.out.println(Arrays.toString(cats));
    }
}
