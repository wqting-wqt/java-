package example;

import java.util.Scanner;

public class 判断闰年 {
    public static void main(String[] args){
        //修改不方便
        //int year=2020;
        //改良版
        Scanner in=new Scanner(System.in);
        int year=in.nextInt();
        boolean t;
        t=year%400==0||year%4==0&&year%100!=0;
        System.out.println(year+" is intercalary year = "+t);
    }
}
