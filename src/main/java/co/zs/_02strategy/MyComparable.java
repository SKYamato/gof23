package co.zs._02strategy;

/**
 * @author shuai
 * @date 2020/03/12 9:57
 */
public interface MyComparable<T> {
    /**
     * 比较
     *
     * @return 0:等于; 正数:大于; 负数:小于
     */
    int compareTo(T t);
}
