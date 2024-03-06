package example;

import java.io.IOException;

public class 字数转换 {
    public static void main(String[] args){
        char ch='b';
        System.out.println("input a integer or character:");
        try
        {
            ch=(char)System.in.read();
        }
        catch (IOException e)
        {
        }
        System.out.println("the input is \'"+ch+"\'");
    }
}
