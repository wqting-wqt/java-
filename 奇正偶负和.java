package example;
/*三个循环体
for(int i=1;i<100;i++){}
while(i<100){}
do{}while(i<100);
 */
public class 奇正偶负和 {
    public static void main(String[] args){
        int i=1,sum=0;
        int flag=1;
        /*
        while语句
        while(i<=100){
            sum+=flag*i;
            i++;
            flag=flag*(-1);
        }
        System.out.println("1-2+3-4.....-100="+sum);
         */
        /*
        do....while语句
        do{
            sum+=flag*i;
            i++;
            flag=flag*(-1);
        }
        while (i<=100);
        System.out.println("1-2+3-4.....-100="+sum);
         */
        //for循环
        for(;i<=100;i++){
            sum+=flag*i;
            flag=flag*(-1);
        }
        System.out.println("1-2+3-4.....-100="+sum);
    }
}
