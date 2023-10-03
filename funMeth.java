import java.util.*;
public class funMeth {
    public static void main(String args[]){
        avgnum();


    }public static void avgnum(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the integers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int avg=(a+b+c)/3;
        System.out.println(avg  );
    }
}
