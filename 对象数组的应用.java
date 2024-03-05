package example;
class Student{
    private String id;
    private String name;
    Student (String name,String id){
        this.name=name;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class 对象数组的应用 {
    public static void main(String[] args){
        Student[] stu=new Student[3];
        for (int i=0;i< stu.length;i++){
            stu[i]=new Student("学生"+i,"2155110"+i);
            System.out.println("学号："+stu[i].getId()+"\t姓名："+stu[i].getName());

        }
    }
}
