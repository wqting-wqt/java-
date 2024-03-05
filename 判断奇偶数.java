package example;

import java.util.Scanner;

public class 判断奇偶数 {
    public static void main(String[] args){
        //为了体现任意给出一个整数，采用键盘输入一个数据（导包，创建对象，接收数据）
        Scanner sc= new Scanner(System.in);
        System.out.println("输入一个数：");
        int number = sc.nextInt();
        //判断整数是奇数还是偶数，有两种情况
        //偶数，需要用到取余number%2==0
        //根据判断的情况输出对应的内容
        if(number%2 == 0){
            System.out.println(number+"是偶数");
        }

        else{
            System.out.println(number+"是奇数");
        }
    }
}
