package sort;

/**
 * @author:Lucas
 * @description:冒泡排序算法和各种优化
 *
 * 根本的优化都是对已经排好序的部分进行优化，就是后面的比较不比较他们了。
 * 最优解是通过比较。记录最后一次需要比较的位置的下标然后给flag，然后k=flag,k作为最新的循环边界。
 * @Date:2019/1/15
 **/
public class BubbleSort {

    /*
    * 交换方法
    * */
    public static void swap(int front ,int behind){
        int temp;
        temp = behind;
        behind = front;
        front = temp;
    }
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    /*经典算法
    * */
    public static void  bubbleSort1 (int [] arg){
        for (int i = 0;i< arg.length-1;i++){
            for (int j = i+1; j< arg.length ;j++){
                if (arg[i]>arg[j]){
                   arg[i] = arg[i]+  arg[j];
                   arg[j] = arg[i] - arg[j];
                   arg[i] = arg[i] - arg[j];
                }
            }
        }
    }

    /**
     * 改进的冒泡排序
     *
     * @param nums 待排序的数组
     */
    public static void bubbleSort2(int[] nums) {
        // 正确性判断
        if (null == nums || nums.length <= 1) {
            return;
        }

        // 使用一个数来记录尾边界
        int length = nums.length;
        boolean flag = true;// 发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。
        while (flag) {
            flag = false;// 每次开始排序前，都设置flag为未排序过
            for (int i = 1; i < length; i++) {
                if (nums[i - 1] > nums[i]) {// 前面的数字大于后面的数字就交换
                    int temp;
                    temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                    // 表示交换过数据;
                    flag = true;
                }
            }
            length--; // 减小一次排序的尾边界
        }
    }

    /**
     * 冒泡算法最优解
     *
     * @param nums 待排序的数组
     */
    public static void bubbleSort3(int[] nums) {
        int j, k;
        int flag = nums.length;// flag来记录最后交换的位置，也就是排序的尾边界
        while (flag > 0) {// 排序未结束标志
            k = flag;// k 来记录遍历的尾边界
            flag = 0;
            for (j = 1; j < k; j++) {
                if (nums[j - 1] > nums[j]) {// 前面的数字大于后面的数字就交换
// 交换a[j-1]和a[j]
                    int temp;
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    // 表示交换过数据;
                    flag = j;// 记录最新的尾边界.
                }
            }
        }
    }


    public static void main (String [] args){
        int [] arg = {9,8,7,6,5,3,4};
        int [] arg2 = {9,8,7,6,5,3,4};
        int [] arg3 = {4,3,2,5,6,7};
        display(arg);
        System.out.println("经典算法");
        bubbleSort1(arg);
        display(arg);
        System.out.println("优化算法");
        bubbleSort2(arg2);
        display(arg);
        bubbleSort3(arg3);
        System.out.println("最优算法");
        display(arg3);
    }
}
