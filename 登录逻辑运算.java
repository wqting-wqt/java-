package example;

public class 登录逻辑运算 {
    public static void main(String[] args){
        String account="admin";
        String password="123456";
        final String SUCCESS="登录成功";
        final String FAIL="登录失败";
        if(account.equals("admin") && password.equals("12345")){
            System.out.println(SUCCESS);
        }
        else{
            System.out.println(FAIL);
        }
    }
}
