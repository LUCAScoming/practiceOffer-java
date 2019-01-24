package sort;

/**
 * @author:Lucas
 * @description:这是简单选择排序
 * @Date:2019/1/24
 **/
public class SimpleSelectSort {
    public static void main(String[] args) {
        int[] a = {6, 5, 1, 3, 65, 80, 100};
        SimpleSelectSort.sort(a);
        BubbleSort.display(a);
    }

    public static void sort(int[] array) {
        if (array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;//每次交换的成本很大，所以只记录下标，如果下标没有变化就不需要交换。
                }
            }
            if (min != i) {
                BubbleSort.swap(array, i, min);
            }
        }
    }
}
