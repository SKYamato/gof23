package co.zs._02strategy.util;

import co.zs._02strategy.MyComparable;
import co.zs._02strategy.MyComparator;

/**
 * 添加策略模式，可自定义实现属性比较器
 *
 * @author shuai
 * @date 2020/03/12 11:16
 */
public class StrategySorter<T> {
    public void sort(T[] arr, MyComparator<T> comparator){
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) < 0 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
