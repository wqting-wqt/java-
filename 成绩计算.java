package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 成绩计算 {
    public static void main(String[] args) throws IOException{
        int count_score=0,sum=0,i;
        float average_score,rate_score;
        int pro_score[]=new int[50];
        BufferedReader buf;
        buf=new BufferedReader(new InputStreamReader(System.in));

        for(i=0;i<10;i++){
            pro_score[i]=Integer.parseInt(buf.readLine());
            if(pro_score[1]>=60)
                count_score++;
            sum=sum+pro_score[i];
        }
        average_score=sum/10;
        rate_score=count_score/10;
        System.out.println("the average score is"+average_score);
        System.out.println("the rate score is"+rate_score);
    }
}
