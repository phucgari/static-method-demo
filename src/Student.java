public class Student {
    private int rollno;
    private String name;
    private static String college="Harvard";
    Student(int r,String n){
        rollno=r;
        name=n;
    }
    static void change(){
        college="Codegym";
    }
    public void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
