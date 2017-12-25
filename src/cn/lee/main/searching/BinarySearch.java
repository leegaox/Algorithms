package cn.lee.main.searching;

import cn.lee.lib.algorithmsoffice.StdOut;

import java.sql.Array;
import java.util.Arrays;


/**
 * Created by yanfa on 2017/12/20.
 */
public class BinarySearch {


    public static int binarySearch(int key, int[] keys) {
        int lo = 0;
        int hi = keys.length - 1;
        if (lo > hi) {
            return -1;
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < keys[mid]) {
                hi = mid - 1;
            } else if (key > keys[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 二分查找递归实现
     */
    public static int binarySarchRecursion(int key, int[] keys) {
        return rankRecursion(key, keys, 0, keys.length - 1);

    }

    public static int rankRecursion(int key, int[] keys, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < keys[mid]) {
            return rankRecursion(key, keys, lo, mid - 1);
        } else if (key > keys[mid]) {
            return rankRecursion(key, keys, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 3, 4, 53, 23, 44, 5, 6, 20,  8, 9, 15};
        Arrays.sort(a);

        StdOut.println("二分查找：" + binarySearch(20, a));

        StdOut.println("递归二分查找：" + binarySarchRecursion(20, a));
    }


}
