package example;
/*
     珠穆朗玛峰：
               世界最高峰，8844430mm，假如有一张厚度0.1mm纸
               请问折叠多少次，可以折成该高度
 */
public class while珠穆朗玛峰 {
    public static void main(String[] args) {
        //定义一个变量，初始值为0
        int count = 0;
        //定义纸张的厚度
        double paper = 0.1;
        //定义珠穆朗玛峰的高度
        int zf=8844430;
        //需要反复折叠，所以需要使用循环，但不知道需要折叠多少次，适用while
        //折叠厚度大于珠穆朗峰就停止
        while(paper<=zf){
            //循环过程每次纸张折叠都会加倍
            paper*=2;
            //在循环执行累加，对应折叠多少次
            count++;
        }
        //输出计数器的值
        System.out.println("需要折叠："+count+"次");
    }
}
