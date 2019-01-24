package sort;

import java.util.Stack;

/*
这里是简单插入排序和栈操作
下面使用栈来对字符串或者数组进行倒序输出。
注意的是：
1，栈的判空 是用isEmpty；
2，入栈是push，出栈pop;
3，栈只能访问栈顶元素
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 8, 9, 5, 7, 6, 1, 3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过插入排序后的数组顺序为：");
        display(array);
        System.out.println("经过倒序后的数组顺序为：");
        reverse(array);
    }

    //遍历显示数组
    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] sort(int[] array) {
        int j;
        //从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];//记录要插入的数据
            j = i;
            while (j > 0 && array[j] < array[j - 1]) {//从已经排序的序列最右边的开始比较，找到比其小的数
                BubbleSort.swap(array, j, j - 1);
//                array[j] = array[j-1];//向后挪动
                j--;
            }
//            array[j] = tmp;//存在比其小的数，插入
        }
        return array;
    }

    public static void reverse(int[] array) {
        Stack stack = new Stack();
        if (array == null) {
            return;
        }
        for (int num : array) {
            stack.push(num);
        }
        if (stack == null) {
            return;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }


}
