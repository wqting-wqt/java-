package example;
/*
寺庙里有三个和尚比较身高
大和尚为200cm
老和尚为180cm
小和尚为190cm
算出最高的一位的身高
 */
public class 三个和尚 {
    public static void main(String[] args){
        //定义变量，保存身高，单位为cm，只要输入数值即可
        int height1=180;
        int height2=200;
        int height3=190;
        //用三元运算符比较出中等身高
        int tempHeight=height1>height2?height1:height2;
        //再次用运算符比较中等身高和最后一个身高的大小
        int maxHeight=tempHeight>height3?tempHeight:height3;
        //输出结果
        System.out.println("最高的和尚身高为："+maxHeight);
    }
}

