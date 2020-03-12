package co.zs._02strategy.util;

import co.zs._02strategy.MyComparable;

/**
 * @author shuai
 * @date 2020/03/12 10:05
 */
public class Sorter<T> {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort(MyComparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(MyComparable<T>[] arr, int i, int j) {
        MyComparable<T> temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
