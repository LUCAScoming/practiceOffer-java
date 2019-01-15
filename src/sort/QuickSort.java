package sort;

/**
 * @author:Lucas
 * @description:这里是快速排序算法，采用的是递归实现
 *
 * @Date:2019/1/16
 **/
public class QuickSort {
    public static  void quickSort (int arg [],int low ,int height){
        if (low>=height) return;
        int index = partSort (arg,low,height);
        quickSort(arg,low,index-1);
        quickSort(arg,index+1,height);

    }

    private static int partSort(int[] arg, int low, int height) {
        int key = arg[height];//选取高位作为key
         int temp ;
         int t;

        while (low<height){
            while (arg[low]<key &&low<height) low++;//low往右边走，遇到大于key的值停下来
            while (arg[height]>key &&low<height) height--;//height往左边走，遇到小于key的值停下来。
            temp = arg[low];//交换low和height的值
            arg[low] = arg[height];
            arg[height] = temp;
        }
        //一趟结束之后交换key和height的值并且返回height的下标
        t = key;
        key =arg[height] ;
        arg[height]=t;
        return height;
    }

    public static void main (String [] args){
        int [] arg = {9,8,7,6,5,3,4};
        BubbleSort.display(arg);
        quickSort(arg,0,arg.length-1);
        BubbleSort.display(arg);

    }
}
