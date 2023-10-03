import java.util.*;
public class pat {
//    public static int sol(int a[]){
//        int min=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//
//        }
//    }
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = 3;
//        int i = 1;
//        //int x=n;
//        for (int a = 0; a < n; a++) {
//            for (int b = 0; b <  n; b++) {
//                if (b < a) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print(i);
//                        i++;
//                }
//            }
//            for(int k= 0; k <n-i; k++){
//                int x=n*(n+1-i)-k;
//                System.out.print(x);
//                x++;
//            }
//            System.out.println();
//            }
        int n=4;
        int c=1;
        int x=n-1;
       for(int i=0;i<n;i++){
           int y=n*((n+1)-i)-(x);
           for(int j=0;j<n*2;j++){
               if(j<n) {
                   if (j < i) {
                       System.out.print(" ");
                   } else {
                       System.out.print(c+"*");
                       c++;
                   }}}
           for(int k=i;k<n;k++){
               System.out.print(y+"*");
               y++;
           }
           x--;
           System.out.println();
           }
       }
        }
