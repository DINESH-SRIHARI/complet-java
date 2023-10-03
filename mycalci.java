import java.util.*;

public class mycalci {
    public static int sum(int a,int b){
        int s=a+b;
        return s;
    }
    public static int sub(int a,int b){
        int su=a-b;
        return su;
    }
    static int mul(int a,int b){
        int mul=a*b;
        return mul;
    }
    static int div(int a,int b){
        int div=a/b;
        return div;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int i=sc.nextInt();
        System.out.println("enter the second number");
        int j=sc.nextInt();
        System.out.println("enter the number if " +
                "addition of the numbers=1" +
                "subtractions of the numbers=2" +
                "multiplications of the numbers=3" +
                "division of the numbers=4");

        int num = sc.nextInt();
        switch (num){
            case 1:
                int add=sum(i,j);
                System.out.println("the sum of two numbers is:"+add);
                break;
            case 2:
                int sub=sub(i,j);
                System.out.println("the subtraction of two numbers is:"+sub);
                break;
            case 3:
                int multi=mul(i,j);
                System.out.println("the multiplication of two numbers is:"+multi);
                break;
            case 4:
                int divd=div(i,j);
                System.out.println("the division of two numbers is:"+divd);
                break;
            default:
                System.out.println("you have entered a valid type but we had not created that logic we are going to update this thing later");


    }}
}
