public class ops {
public static void main(String args[]){
    Pen p1=new Pen();//int the heap memory the objext is created
    p1.colour="blue";//. operatoer assigns the value to the
    System.out.println(p1.colour);
    //access specifiers example.
    Bankaccount b1=new Bankaccount();
    b1.name="dinesh";
    b1.setpass("make");
    //System.out.print(b1.p);
    //getters and seters..
    //inheritence
    fish shark=new fish();
    //compile time (methode overloding)
    shark.eat();
    caliculator cl=new caliculator();//object creation
    System.out.println(cl.sum((float)1.2,(float)2.3));
    //method overriding (run time)
    //if a sub class has a same method which is been decleared by its parent class it is known as overriding
    //packages group of classes ,interfaces and sub packages
    //abstraction:hiding the unecessary data which is unrevelent and showchasing the relevent data
    //abstract classes:
    //i cannot actually create the object and if it is a abstract we need to use the abstract keyword in front of a class
    mallels dog=new mallels();
    dog.walks();
    //static is used to share the same variable or method of a given class
    //which valiues are const we need not to change the value of the variavle or function
    //super:used to refer the immediate parent class obj
    //interface : is a blue print of a class(multiple inheritence implementation)
    //all methods are public ,abstract and without implementation



}
}
//this keyword is used to refer the current obj in the class
//class and object;
class Pen{
    String colour;//properties
    int tip;
    void setColour(String ncolour){//functions
        colour=ncolour;
    }
    void setTip(int ntip){
        tip=ntip;
    }
    int getTip(){
        return this.tip;
    }
}
//access modifiers and access specifiers
class Bankaccount{
    public String name;
    private String password;
    void setpass(String pass){
        password=pass;
    }
}
//getters and setters
//this refers the current object
//4 pillers encapsulation,inheretence,polymorpism,abstraction.
//encapsulation:wrapping up the data and methods in a single unit.it also implements data hiding
//constructor:special method which autometically invoked at the time of creation of object;
//dont have any return types
//at first when we create an object at first the constructor is created and then the memory is allocated with that the properties are then allocated
class student{
    String name;
    int roll;
    student(){
        System.out.println("this is called");
    }
}
//to create the instance of th class.
//non parameter, parameter constructer.>>constructer overloading
//if we create any constructer the defult constructer is not creatred
//copy constructer
class st{
    String name;
    int rol;
    int marks[];
    st(st s1){
        this.name=s1.name;
        this.rol=s1.rol;
        marks=new int[3];
        this.marks=s1.marks;
    }
}//it copies the reference if the objet not the values
//shallow constructers&deep constructer
//deep copying is called as the deep consructurs
//destructors they are inbuilt which is made by the garbage collector
//inheritence
//when properties and methods of base class are passed on to the deriverd class
class Animals{
    String colour;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}
//single level inheritence
class fish extends Animals{
    int  fish;
    void swims(){
        System.out.println("swims iin water");
    }
}
//multi level base class-> derived class ->dog
//hierarchial inheritence two sub classes are formed from the single main class
//hybride inheritence  mixture of all the classes

//polymorphism-  many forms in simplier words when we try to do the same things with different forms there are two typer compile time and run time
class caliculator{

     int sum(int a,int b){
         return a+b;
     }
     float sum(float a,float b){
         return a+b;
     }
     int sum(int a,int b,int c){
         return a+b+c;
     }
}
abstract class Animl{
    void eats(){
        System.out.println("this animal eats");

    }
    abstract void walks();
}
class mallels extends Animl{
    void walks(){
        System.out.println(" this animal walks on 2 foot");
    }
}

