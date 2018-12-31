package recursive;

public class Combination {
    public int comb(int total, int selected, int num) {
        if (total < selected) {
            return Integer.parseInt(null);

        }
        if (total == selected) {
            System.out.print("相等了，此时total为：" + total + "selected为 :" + selected);
            System.out.println();
            return 1;
        }
        while (selected == 1) {
            num = total + num;
            return num;
        }
        num = comb(total - 1, selected - 1, num) + comb(total - 1, selected, num);
        return num;
    }



    public static void main(String[] args) {
        Combination combination = new Combination();
        int num = 0;
        int total = 5;
        int selected = 3;
        num = combination.comb(total, selected, num);
        System.out.print("在" + total + " 中选 " + selected + "个的" + "排列组合为" + num);
    }
}
