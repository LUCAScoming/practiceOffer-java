package recursive;
/*递归求解背包问题。*/
public class pack {
    private int[] weights; //可供选择的重量
    private boolean[] selects; //记录是否被选择

    public pack(int[] weights) {
        this.weights = weights;
        selects = new boolean[weights.length];
    }

    /**
     * 找出符合承重重量的组合
     *
     * @param total 总重量
     * @param index 可供选择的重量下标
     */
    public void pack(int total, int index) {
        if (total < 0 || total > 0 && index >= weights.length) {
            return;//没找到解决办法，直接返回
        }
        if (total == 0) {//总重量为0，则找到解决办法了
            for (int i = 0; i < index; i++) {
                if (selects[i] == true) {
                    System.out.print(weights[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        selects[index] = true;
        pack(total - weights[index], index + 1);
        selects[index] = false;
        pack(total, index + 1);
    }

    public static void main(String[] args) {
        int[] weight = {1, 2, 3, 4, 5};
        int total = 10;
        pack p = new pack(weight);
        p.pack(total, 0);

    }
}
