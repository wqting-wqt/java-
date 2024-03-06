package example;

import java.util.Scanner;

public class 找最高或低分 {
    public static void main(String[] args){
        int i,min,max;
        int pro_score[]=new int[50];
        Scanner reader;
        reader=new Scanner(System.in);
        max=min=pro_score[0]=reader.nextInt();
        for (i=1;i<pro_score.length;i++){
            if(pro_score[i]<min)
                min=pro_score[i];
            if (pro_score[i]>max)
                max=pro_score[i];
        }
        System.out.println();
        System.out.println("最高成绩："+max);
        System.out.println();
        System.out.println("最低成绩："+min);
    }
}
