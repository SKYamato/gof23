package co.zs._02strategy;

/**
 * @author shuai
 * @date 2020/03/12 10:53
 */
public interface MyComparator<T> {
    int compare(T o1, T o2);
}
