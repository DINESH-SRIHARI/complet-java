//1

//public class patterns {
//    public static void main(String args[]){
//        for (int i=1;i<=4;i++){
//            for(int j=1;j<=5;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//    }
//}
//3

//public class patterns{
//    public static void  main(String args[]){
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//}
//4
//public class patterns{
//    public static void  main(String args[]){
//        for(int i=1;i<=4;i++){
//            for(int j=i;j<5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//}

//5
//public class patterns{
//    public static void main(String args[]){
//        for(int i=1;i<=4;i++){
//            for (int j=)
//        }
//    }
//}
import java.util.Scanner;
//6
//public class patterns {
//    public static void main(String args[]){
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}
//7
//public class patterns {
//    public static void main(String args[]) {
//        int a,s=0;
//        for (int i = 1; i <= 4; i++) {
//            for (int j =1; j<=i ; j++) {
//                    s=s+1;
//
//                    System.out.print(s);
//                    System.out.print(" ");
//
//
//            }
//            System.out.println();
//        }
//    }
//}
//9
//public class patterns {
//    public static void main(String args[]) {
////        int s=0;
////        for (int i=1;i<=4;i++){
////            for (int j=1;j<=i;j++){
////                s=s+1;
////                if(s%2==0) {
////                    System.out.print("0");
////                    System.out.print(" ");
////                }
////                else{
////                    System.out.print("1");
////                    System.out.print(" ");
////                }
////            }
////            System.out.println();
//        int sum = 0, s = 1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j < 5; j++) {
//                if (i % 2 == 0) {
//                    s = s + 1;
//                    if (s%2==0) {
//                        if (s % 2 == 0) {
//                            System.out.print("0");
//                            System.out.print(" ");
//                        } else {
//                            System.out.print("1");
//                            System.out.print(" ");
//                        }
//                    } else {
//                        sum = sum + 1;
//                        if (sum % 2 == 0) {
//                            System.out.print("0");
////                            System.out.print(" ");
////                        } else {
////                            System.out.print("1");
////                            System.out.print(" ");
////                        }
////                    }
////
////                }
////                System.out.println();
////            }
////        }
////    }
////}
//public class patterns {
//    public static void main(String args[]) {
////        int a=1;
////        for(int i=1;i<=5;i++){
////            for(int j=1;j<=i;j++){
////                if(i%2==1){
////                    int sum=1;
////                    sum=sum+1;
////                    if(sum%2==0){
////                        System.out.print("o");
////                    }
////                    else{
////                        System.out.print("1");
////                    }
////
////                }
////                else{
////                    int s=0;
////                    s=s+1;
////                    if(s%2==0){
////                        System.out.print("0");
////                    }
////                    else{
////                        System.out.print("1");
////                    }
////                    //System.out.print(s);
////                }
////                //System.out.print();
////                System.out.print(" ");
////            }
////            System.out.println();
//        // }
//
////                for(int i=0;i<5;i++){
////
////                    if(i==0|i==4) {
////                        for (int j = 0; j <= 4; j++) {
////                            System.out.print("*");
////                        }
////                    }
////                    else {
////                        for (int a = 0; a <= 4; a++) {
////                            if (a == 0 |a==4) {
////                                System.out.print("*");
////                            }
////                            else System.out.print(" ");
////                        }
////                    }
////                    //System.out.println();
////
////                    System.out.println();
//                //}
//        //half pyramid
////        for(int i=0;i<5;i++){
////            for (int j=0;j<i;j++){
////                System.out.print(j);
////            }
////            System.out.println();
////        }
////char a='A';
////for(int i=0;i<=5;i++){
////    for(int j=0;j<i;j++){
////        System.out.print(a+" ");
////        a++;
////    }
////    System.out.println();
////}
////    for(int i=1;i<=4;i++){
////        if(i==1||i==4){
////            for(int j=1;j<=5;j++){
////                System.out.print("*");
////            }
////            System.out.println();
////        }
////        else {
////            for(int k=1;k<=5;k++){
////                if(k==1||k==5){
////                    System.out.print("*");
////                }
////                else System.out.print(" ");
////            }
////            System.out.println();
////        }
////
////
////    }
//
//   }
//        }
//**hallow rect**//
public class patterns {
    //    public static void butterfly(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//    public static void tri01(int n) {
//        int i=1;
//        for (int j = 0; j < n; j++){
//
//            for(int k=0;k<j;k++) {
//
//                System.out.print(i);
//                if(i==1){
//                    i=0;
//                }
//                else i=1;
//            }
//            System.out.println();
//        }
//    }
//    public static void inv_rot_tri(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=i;j<=(n-1);j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    public static void main(String args[]) {
        //Scanner s=new Scanner(System.in);
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter the length of the rectangle");
//        int i=s.nextInt();
//        System.out.println("enter the breadth of the rectangle");
//
//
//        int j=s.nextInt();
//        for(int a=1;a<=i;a++){
//            if(a==1||a==i) {
//                for (int b = 1; b <= j; b++) {
//                    System.out.print("*");
//                }
//            }
//            else{
//                for(int c=1;c<=j;c++){
//                    if(c==1||c==j){
//                        System.out.print("*");
//                    }
//                    else System.out.print(" ");
//
//                }
//                }
//            System.out.println();
//        }

        ///////////////////////////////adv patterns/////////////////////////////

//        ////hallow//////
//    Scanner s=new Scanner(System.in);
//    for(int i=1;i<5;i++){
//        for(int j=1;j<6;j++){
//            if(i==2||i==3) {
//                if (j == 1 || j == 5) {
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            else System.out.print("*");
//        }
//        System.out.println();
//    }
//        //inverted and roated half pyramid
//        for(int i=0;i<4;i++){
//            for(int j=4;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();

//        for(int i=0;i<5;i++){
//            int a=0;
//            for(int j=i;j<5;j++){
//                System.out.print(a);
//                a++;
//            }
//            System.out.println();
//        }
        //System.out.println("enter the value of i where the i is number of lines in the first half of the butterfly");
        //int i=s.nextInt();
        //tri01(i);
        //butterfly(i);
        //inv_rot_tri(i);
        // half pyramid
//        for(int i=0;i<6;i++){
//            int c=1;
//            for(int j=i;j<5;j++){
//                System.out.print(c);
//                c++;
//            }
//            System.out.println();
//        }
        //butter fly
//        for(int i=1;i<5;i++){
//            for(int j=1;j<9;j++){
//                if(j<=i){
//                    System.out.print("*");
//                }
//                else if(j>(8-i)){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=5;i<1;i--){
//            for(int j=1;j<9;j++){
//                if(j<=i){
//                    System.out.print("*");
//                }
//                else if(j>(8-i)){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=0;i<4;i++){
//            for(int j=0;j<5;j++){
//                if(j==0||j==4||i==0||i==3){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//    for(int i=0;i<4;i++){
//        for(int j=0;j<4;j++){
//            if(j>=3-i) {
//                System.out.print("*");
//            }
//            else System.out.print(" ");
//        }
//        System.out.println();
//    }
//        int s=1;
//        for(int i=0;i<6;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(s);
//                if(s==1){
//                    s=0;
//                }
//                else s=1;
//            }
//            System.out.println();
//        }
//        for(int i=1;i<5;i++){
//            for(int j=1;j<9;j++){
//                if(i>=j){
//                    System.out.print("*");
//                }
//                else if(j>=9-i){
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for(int i=4;i>0;i--){
//            for(int j=1;j<9;j++){
//                if(i>=j){
//                    System.out.print("*");
//                }
//                else if(j>=9-i){
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<6;i++){
//            for(int j=0;j<10;j++){
//                if(j>=i && j<i+4){
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        }
//        for(int i=1;i<7;i++){
//            for(int j=0;j<7-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<5;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<6;i++){
//            for(int j=0;j<5-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<5;k++){
//                if(i==1||i==5||k==0||k==4){
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//        int x=1;
//        for(int i=0;i<4;i++){
//            for(int j=0;j<4-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<x;k++){
//                System.out.print("*");
//            }
//            x=x+2;
//            System.out.println();
//        }
//        int y=7;
//        for(int i=4;i>0;i--){
//            for(int j=0;j<4-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<y;k++){
//                System.out.print("*");
//            }
//            y=y-2;
//            System.out.println();
//        }
//        for(int i=1;i<6;i++){
//            for(int j=0;j<5-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=i;j>0;j--){
//                System.out.print(j);
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        int n=3;
        int x=n-1;
        for(int i=0;i<3;i++){
            int y=n*((n+1)-i)-(x);
            for(int j=i;j<3;j++){
                System.out.print(y);
                y++;
            }
            x--;
            System.out.println();
        }
    }
}