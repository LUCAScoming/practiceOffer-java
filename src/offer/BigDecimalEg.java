package offer;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author:Lucas
 * @description:ava计算阶乘（n!）需要使用实现使用BigDecimal类,因为用int最多正确算到12!,用long最多正确算到20!
 *         计算机中提供了长整型和双精度等能存储较大数的数据类型，但在有些时候，这样的数据类型不能满足实际应用的需求，比如大数的阶乘。
 *         请编写程序，实现大数阶乘的算法。要求能计算N(6<=N<=300)的阶乘。
 *
 * @Date:2019/1/13
 **/
public class BigDecimalEg {
    public static BigDecimal factorial(BigDecimal n){
        BigDecimal bd1 = new BigDecimal(1);//BigDecimal类型的1
        BigDecimal bd2 = new BigDecimal(2);//BigDecimal类型的2
        BigDecimal result = bd1;//结果集，初值取1
        BigDecimal temp = new BigDecimal(1);
        while(bd1.compareTo(n)<1){
            result = result.multiply(bd1);
            bd1 = bd1.add(temp);
        }
        return result;
    }
    public static void main(String[] arguments){
        System.out.println("请输入阶乘数：");
        Scanner sc = new Scanner(System.in);
        BigDecimal n = sc.nextBigDecimal();
        sc.close();
        System.out.print(n + "!=" + factorial(n));
    }


}
