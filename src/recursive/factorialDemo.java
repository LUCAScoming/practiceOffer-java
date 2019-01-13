package recursive;

public class factorialDemo {
    /*针对n！形式*/
    public final static void demOne(int n) {
        int temp = n;
        for (int i = 1; i < n; i++) {
            temp = temp * (n - i);
        }
        System.out.println(n+"!=" + temp);
    }

/*使用递归来求*/
    public final static int getFactorial(int n) {
        if (n >= 0) {
            if (n == 0) {
                System.out.println(n + "!=1");
                return 1;
            } else {

                int temp = n * getFactorial(n - 1);
                System.out.println(n + "!=" + temp);
                return temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        demOne(10);
        getFactorial(7);


    }
}
