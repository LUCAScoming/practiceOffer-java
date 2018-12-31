
class newClass {
    private static int newClassValue = 200;

    public static void change(int newClassValue) {
        newClassValue++;
        System.out.print("static方法的输出" + newClassValue);
    }

}

class one {
    private int data;
    int result = 0;

    public void m() {
        result += 2;
        data += 2;
        System.out.print(result + "  " + data);
    }
}

class threadEg extends Thread {
    private one one;

    public threadEg(one one) {
        this.one = one;
    }

    public void run() {
        synchronized (one) {
            one.m();
        }
    }
}

public class Two {
    private int staticValue = 100;
    private static int twoValue = 200;


    public static void main(String[] args) {
        int twoValue = 100;
        int a = twoValue++;
        a = ++twoValue;
        System.out.print("a=" + a);
       System.out.print("two="+ Two.twoValue++);
    }


}
