package recursive;

/**
 * @author:菲你莫属123
 * @description: 公式:
 * f(n) = n, n <= 1
 * f(n) = f(n-1) + f(n-2), n > 1
 * <p>
 * 思路：
 * 可以用递归 fibonacci(n-1)+fibonacci(n-2)，但是会报 stack overflow;
 * <p>
 * 下面是用动态规划的来解决。
 **/
public class Fibonacci {

    public int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int n1 = 0;
        int n2 = 1;
        for (int i = 2; i <= n; i++) {
            n2 = +n1;
            n1 = n2 - n1;
        }
        return n2;
    }
}
