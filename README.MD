## 欧几里德算法

### 自然语言描述
计算两个**非负整数**p和q的最大公约数：若q=0，则最大公约数为p。否则，将p除以q得到余数人，p和启动最大公约数即为q和r的最大公约数。

### 算法

````java
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p%q;
        return gcd(q,  r);
    }
````
## 排序

## 查找

### 1、二分查找

> 二分查找又称折半查找，**优点**是比较次数少，查找速度快，平均性能好，占用系统内存较少；其**缺点**是要求待查表为有序表，且插入删除困难。因此，折半查找方法**适用于**不经常变动而查找频繁的有序列表。

#### 1.2、自然语言描述
它接受一个整数键和一个**已经有序**的int数组，如果该键存在于数组中，则返回他的索引，否则返回-1。算法使用两个变量lo和hi，并保证如果键在属猪中则它一定在[li..ho]中，然后方法进入一个循环，不断将数组的中间键（索引为mid）和被查找的键比较。
如果被查找的键等于a[mid],返回mid；否则算法就将查找范围缩小一半，如果被查找的键小于a[mid]就继续在左半边查找，如果被查找的键大于a[mid]就继续在右半边查找。算法找到被查找的键或查找范围为空时该过程结束。

#### 1.3、算法

````java
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
````
##### 递归实现
````java
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
````



## 图

## 字符串






