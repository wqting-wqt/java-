package example;

import javax.swing.*;

public class 随机数 {
    public static void main(String[] args){
        double num;
        num=Math.random();
        if(num>=0.5)
            System.out.println("num>=0.5");
        else
            System.out.println("num<0.5");

    }
}
