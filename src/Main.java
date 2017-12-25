import cn.lee.lib.algorithmsoffice.StdOut;

public class Main {

    public static void main(String[] args) {
        StdOut.println("最大公约数：" + gcd(1111111, 1234567));

    }

    /**
     * 欧几里德算法
     *
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q) {
        StdOut.println("p:" + p + " --- q:" + q);
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }
}
