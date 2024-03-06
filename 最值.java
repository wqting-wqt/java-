package example;

public class 最值 {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr ={16,17,18,19,51,2,4,459,852,654,547,542,514,541};
        //定义一个变量，用于保存最大值
        //取数组中第一个数据作为变量的初始值
        int max =arr[0];
        //与数组中剩余的数据逐一比对，每次比对将最大值保存到变量中
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        // 循环结束后控制台输出变量的值
        System.out.println("max:"+max);
        System.out.println("---------------");
        int [] arr1={16,17,18,19,51,2,4,459,852,654,547,542,514,541};
        int min =arr1 [0];
        for (int x=1;x<arr.length;x++){
            if (arr1[x]<min){
                min=arr1[x];
            }
        }
        System.out.println("min:"+min);
    }
}
