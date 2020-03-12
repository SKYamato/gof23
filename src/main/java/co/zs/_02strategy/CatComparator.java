package co.zs._02strategy;

/**
 * @author shuai
 * @date 2020/03/12 11:29
 */
public class CatComparator implements MyComparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) return -1;
        else if (o1.getAge() < o2.getAge()) return 1;
        else return 0;
    }
}
