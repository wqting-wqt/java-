package example;
/*
      回文：指一个字符串的顺序与逆序相同
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 回文字符串 {
    public static void main(String[] args) throws IOException {
        String s;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        s=bufferedReader.readLine();
        if (comp(s))
            System.out.println(s+"是回文");
        else
            System.out.println(s+"不是回文");
    }

    public static boolean comp(String s) {
        int i=0;
        char[] charArray=s.toCharArray();
        while (i<s.length()/2){
            if(charArray[i]!=charArray[s.length()-1-i])
                return false;
            i++;
        }
        return true;
    }
}
