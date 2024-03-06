package example;
import java.util.Scanner;

public class 三个和尚升级版 {
    public static void main(String[] args){

        //身高未知。采用键盘输入，首先导报，再创建对象
        Scanner sc=new Scanner(System.in);

        //键盘录入身高，分别赋值给三个变量
        System.out.println("输入第一个和尚身高为：");
        int height1=sc.nextInt();

        System.out.println("输入第二个和尚身高为：");
        int height2=sc.nextInt();

        System.out.println("输入第三个和尚身高为：");
        int height3=sc.nextInt();

        //用三元运算符比较出中等身高
        int tempHeight=height1>height2?height1:height2;

        //再次用运算符比较中等身高和最后一个身高的大小
        int maxHeight=tempHeight>height3?tempHeight:height3;

        //输出结果
        System.out.println("最高的和尚身高为："+maxHeight+"cm" );
    }
}
