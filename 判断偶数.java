package example;

import javax.swing.*;

public class 判断偶数 {
    public static void main(String[] args){
        String inString= JOptionPane.showInputDialog(null,"输入一个整数: ","例2.6",JOptionPane.QUESTION_MESSAGE);
        int num=Integer.parseInt(inString);
        if(num%2==0){
            System.out.println(num+"是偶数");
        }
    }
}
