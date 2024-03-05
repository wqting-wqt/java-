package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 加减乘除 {
    public static void main(String[] args) throws IOException {
        int x=5,y=4,z=0;
        char ch;
        BufferedReader buf;
        buf=new BufferedReader(new InputStreamReader(System.in));
        ch=(char)buf.read();
        switch (ch){
            case '+':z=x+y;
                System.out.println(x+"+"+y+"="+z);
                break;
            case '-':z=x-y;
                System.out.println(x+"-"+y+"="+z);
                break;
            case '*':z=x*y;
                System.out.println(x+"*"+y+"="+z);
                break;
            case '/':z=x/y;
                System.out.println(x+"/"+y+"="+z);
                break;
            default:
                System.out.println("输入的运算符不符合要求！");
        }
    }
}
