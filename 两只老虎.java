package example;


    /*
两只老虎比较体重是否相等

 */
    public class 两只老虎 {
        public static void main(String[] args) {
            //定义两只老虎的体重，单位为kg，这里只要输入数值即可
            int weight1 = 600;
            int weight2 = 200;
            //运用三元运算符实现老虎体重的判断，相等则true，不等则false
            boolean b = weight1 == weight2 ? true : false;
            //输出结果
            System.out.println("b:"+ b);
        }
    }

