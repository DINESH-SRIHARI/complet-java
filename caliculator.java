import java.util.Scanner;

public class caliculator {
    public static void main(String args[]){
        System.out.println("welcome to the caliculator you can caliculate the +,- terms of two numbers");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter one number");
        int a= sc.nextInt();
        System.out.println("enter the other number");
        int b=sc.nextInt();
        System.out.println("enter the operation either + or - bhu");
        char cha=sc.next().charAt(0);
        switch(cha){
            case '+' :
                System.out.println("sum is:"+(a+b) );
                break;
            case '-':
                System.out.println(a-b);
            default:
                System.out.println("not a valid terms");

        }
    }

}
