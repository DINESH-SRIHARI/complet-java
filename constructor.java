public class constructor {
    public static void main(String args[]){
        Student s1=new Student("din");
        System.out.println(s1.name);
        Student s2=new Student();
        //
    }
}
class Student{
    String  name;
    int rlno;
    Student(String nam){
        this.name=nam;
    }
    Student(){
        System.out.println("this called");
    }
}
