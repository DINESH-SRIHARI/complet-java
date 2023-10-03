////public class basics {
//////    static void sumofnum(int i,int j){
//////        int a=10;
//////        int b=20;
//////        int sum=i+j;
//////        System.out.println("sum is:"+sum);
//////    }
//////    static void swap(int i,int j){
//////        int temp= i;
//////        i=j;
//////        j=temp;
//////        System.out.println("a is "+i+"  b is"+j);
//////    }
//////    public static int prod(int a,int b){
//////        int pro=a*b;
//////        return pro;
////   // }
//////    public static int fact(int num){
//////        int i=1;
//////        int temp=num;
//////        while(i<temp){
//////            num=num*i;
//////            i++;
//////
//////    }
//////        return num;
//////    }
////    public static void main(String args[]) {
////
////
//////import java.util.*;
//////
//////import static java.lang.Math.*;
//////
////////import java.lang.Math;
//////public class basics {
//////    public static void main(String args[]){
//////        //greatest of two numbers
////////        int a,b;
////////        Scanner sc=new Scanner(System.in);
////////        System.out.println("enter the number a:");
////////        a=sc.nextInt();
////////        System.out.println("enter the number b:");
//////////        a=sc.nextInt();
////////        b=sc.nextInt();
//////////        int s=a+b;
//////////        System.out.println("the sum is:"+s);
////////        if(a>b){
////////            System.out.println("a is greater than b");
////////
////////        }
////////        else System.out.println("b is greater than a");
//////
//////        //radius of the circle
//////        //Scanner sc=new Scanner(System.in);
////////        int r=sc.nextInt();
////////        int a=r*r;
////////        double b=3.14 * a;
////////        System.out.println(b);
////////        System.out.println("enter the double value");
////////        float num=sc.nextFloat();
////////        System.out.println(num);
////////        int a=(int)num;
////////        System.out.println(a+1);
///////*** 1st practice questions***/
//////    /*1*/
////////    Scanner sc =new Scanner(System.in);
////////    System.out.println("enter the radoius of the circle");
////////    int r=sc.nextInt();
////////    double a=3.14*r*r;
////////        System.out.println("the area of the circle is :"+a);
//////        /*2*/
////////        Scanner sc=new Scanner(System.in);
////////        System.out.println("enter the 1st number");
////////        double a=sc.nextDouble();
////////        System.out.println(a);
////////        System.out.println("enter the second number");
////////        double b=sc.nextDouble();
////////        if(a>b) System.out.println("a is greater than b");
////////        else System.out.println("b may be equal or greater than a");
//////        /*3*/
////////        Scanner sc=new Scanner(System.in);
////////        System.out.println("enter the number  to be caliculate even  from ");
////////        int a=sc.nextInt();
////////        System.out.println("to");
////////        int b=sc.nextInt();
//////        /*int b=100;
//////        for(int a=9;a<=b;a++){
//////            if(a%2==0){
//////                System.out.println(a);
//////            }
//////        }*/
//////
////////        System.out.println("the equation is on the form of ax^2+bx+c=0");
////////        Scanner sc=new Scanner(System.in);
////////        int a,b,c;
////////        System.out.println("enter a");
////////        a= sc.nextInt();
////////        System.out.println("enter b");
////////        b= sc.nextInt();
////////        System.out.println("enter c");
////////        c= sc.nextInt();
////////        //int y=a*c;
////////        double x= (b * b) - (4*a*c);
////////        double y= sqrt(x);
////////
////////        double i=(-1)*b+x/(2*a);
////////        double j=(-1)*b-x/(2*a);
////////        System.out.println(x+" "+y+" ");
////////        System.out.println("the two roots are:");
////////        System.out.println(i+","+j);
///////*** 2st practice questions***/
//////    Scanner s=new Scanner(System.in);
//////    /*1*/
////////        System.out.println("enter the 3 numbers");
////////        double a,b,c;
////////        System.out.println("enter a");
////////        a= s.nextDouble();
////////        System.out.println("enter b");
////////        b=s.nextDouble();
////////        System.out.println("enter c");
////////        c=  s.nextDouble();
////////        double avg =a+b+c/3;
////////        System.out.println("the avg is :"+avg);
//////        /*2*/
////////        double p,pen,e;
////////        System.out.println("enter the cost of pensil:");
////////        p=s.nextDouble();
////////        System.out.println("enter the cost of the pen");
////////        pen=s.nextDouble();
////////        System.out.println("enter the cost of eraser");
////////        e=s.nextDouble();
////////        double sum=p+pen+e;
////////        System.out.println("the total cost of the iteams:"+sum);
////////        System.out.println("the final bill with gst:");
////////        double a=sum*(0.18);
////////        double j=sum+p;
////////        System.out.println(j);
////////          System.out.println("enter the string");
////////          String name=s.next();
////////          //name=sc.nextLine();
////////        System.out.println(name);
//////        System.out.println("enter the number");
//////        int i=s.nextInt();
//////        while(i>0){
//////            int n=i%10;
//////            System.out.print(n);
//////            i=i/10;
//////
//////        }
//////
//////
//////    }
//////}
//////public class basics{
//////    public static void main(String args[]){
//////        Scanner sc=new Scanner(System.in);
//////        System.out.println("enter the number1:");
//////        int a=sc.nextInt();
//////        System.out.println("enter the second number2:");
//////        int b=sc.nextInt();
//////        System.out.println("enter the third number:");
//////        int c=sc.nextInt();
//////        System.out.println("the order of the numbers:");
//////        if(a>b){
//////            if(a>c){
//////                System.out.println(a);
//////
//////            }
//////            else System.out.println("one time rin");
//////
//////        }
//////        else if(b>c) {
//////            if (b > a) {
//////                System.out.println(b);
//////
//////            }
//////        }
//////            else if(c>a){
//////                if(c>b){
//////                    System.out.println(c);
//////
//////                }
//////
//////            }
//////
//////
//////        }
//////    }
////// tax caliculator
////        Scanner sc =new Scanner(System.in);
////        //System.out.println("enter the income:");
////        //int i=sc.nextInt();
//////        int j=10;
//////        if (i > j) {
//////            System.out.println("need to pay tax");
//////        } else {
//////            System.out.println("noneed");
//////        }
//////        System.out.println("enter the number");
//////        double a=sc.nextDouble();
//////        if(a>=0) System.out.println("the number is positive");
//////        else System.out.println("it is a negatve number");
//////        System.out.println("enter the number of day in the week");
//////        int day=sc.nextInt();
//////        switch (day){
//////            case 1:
//////                System.out.println("its monday");
//////                break;
//////            case 3:
//////                System.out.println("its wednesday");
//////                break;
//////            case 2:
//////                System.out.println("its tuesday");
//////                break;
//////            case 7:
//////                System.out.println("its sunday");
//////                break;
//////            case 4:
//////                System.out.println("its thursday");
//////                break;
//////            case 5:
//////                System.out.println("its friday");
//////                break;
//////            case 6:
//////                System.out.println("its saturday");
//////                break;
//////            default:
//////                System.out.println("you have entered wrong number");
//////        }
//////        System.out.println("enter the year");
//////        int year=sc.nextInt();
//////        if(year%4==0){
//////            if(year%100!=0){
//////                if(year%400==0){
//////                    System.out.println("it is a leap year");
//////                }
//////                else System.out.println("r");
//////            }
//////            else System.out.println("not a leap year");
//////        }
//////        else System.out.println("not a leap year");
////        //factorial
//////        System.out.println("enter the number to get the factorial value");
//////        double a=sc.nextDouble();
//////        double temp = 0;
//////        for(int i=1;i<a;i++){
//////            temp=a;
//////            temp=temp*i;
//////
//////        }
//////        System.out.println(temp);
//////        int i=1;
//////        double temp =a;
//////        while(i<a){
//////            temp=temp*i;
//////            i++;
//////        }
//////        System.out.println(temp);
//////        System.out.println("enter the number");
//////        int n=sc.nextInt();
//////        for(int i=0;i<n;i++){
//////            System.out.println("helo worls");
//////        }
//////        int i=1;
//////        while(i<=10){
//////            System.out.println("hi");
//////            i++;
//////        }
////
//////        int a=sc.nextInt();
//////        int sum=0;
//////        int i=1;
//////        while(i<=a){
//////
//////            System.out.println(i);
//////            sum=sum+i;
//////            //System.out.println(sum);
//////            i++;
//////        }
//////        System.out.println(sum);
//////        System.out.println("enter the number");
//////        int a=sc.nextInt();
//////        int t=2;
//////        while(t<a){
//////            if(a%t==0) {System.out.println("not a prime");
//////                break;}
//////            else System.out.println("prime");
//////            t++;
//////        }
//////         int i=100234;
//////         while(i>0){
//////             int a=i%10;
//////             System.out.print(a);
//////             i=i/10;
//////         }
//////        System.out.println("enter the number");
//////        int a =sc.nextInt();
//////        int temp=0;
//////        int c=0;
//////        while(a>0){
//////            int b=a%10;
//////
//////            c=c*10+b;
//////            a=a/10;
//////        }
//////        System.out.println(c);
////        //break continue and do while loops
////
//////        do{
//////            System.out.println("enter the number");
//////            int i=sc.nextInt();
//////
//////            if(i%10==0){
//////                break;
//////            }
//////            System.out.println(i);
//////        }while(true);
//////        System.out.println("enter  the number:");
//////        int i=sc.nextInt();
//////        for(int a=2;a<i;a++){
//////            if(i%a==0){
//////                System.out.println("not a prime");
//////                break;
//////            }
//////            System.out.println("prime");
//////        }
////        //checking it is a prime or not
//////                System.out.println("enter the number:");
//////                int i=sc.nextInt();
//////                if(i==2){
//////                    System.out.println("it is a prime:");
//////                }
//////                else{
//////                    boolean num=true;
//////                    for(int a=2;a<=Math.sqrt(i);a++){
//////                        if(i%a==0){
//////                            num=false;
//////                        }
//////
//////
//////                    }
//////                    if(num==true){
//////                        System.out.println("prime");
//////                    }else System.out.println("not a prime");
//////                }
////        System.out.println("enter the value of n ");
////        int n=sc.nextInt();
////        System.out.println("enter the value of r");
////        int r=sc.nextInt();
//////        swap(a,b);
//////        int pro=prod(a,b);
//////        System.out.println(pro);
////
//////        int up=fact(n);
//////        int down=fact(r);
//////        int d1=fact((n-r));
//////        int factoril=up/(down*d1);
//////        System.out.println(factoril);
//
//
//import java.util.Scanner;
//
////    }
////}
////import java.util.*;
////class basics{
////public static void main(String args[]){
////    System.out.println("enter the table number u want");
////    Scanner s=new Scanner((System.in));
////    int num=s.nextInt();
////    for(int i=1;i<=10;i++){
////        int out=num*i;
////        System.out.println(num+"*"+i+"="+out);
////    }
////        }
////}
//// palindrome
//class basics{
//    public static void main(String args[]) {
//        System.out.println("enter the number");
//        Scanner s = new Scanner(System.in);
//        int i = s.nextInt();
//        int t=i;
//        int b = 0;
//        while (i > 0) {
//            int a = i % 10;
//            b=(b*10)+a;
//            //System.out.print(b);
//            i = i / 10;
//        }
//        if (t == b) {
//            System.out.println("palindrome");
//        }
//        else System.out.println("dengai");
//
//    }
//}
//arrays
//linear search
//public class basics {
////    public static int search(int ar[], int k) {
////        for (int i = 0; i < ar.length; i++) {
////            if (k == ar[i]) {
////                //System.out.println("the number is at location " + i);
////                return i;
////            }
////        }
////        return -1;
////
////    }
////        public static void main (String args[]){
////            int ar[] = {10, 29, 5, 13, 54, 92};
////            int k = 54;
////            //Scanner sc = new Scanner((System.in));
//////        System.out.println("enter the number");
//////        int a=sc.nextInt();
//////        for(int i=0;i<ar.length;i++){
//////            if(ar[i]==a) {
//////                System.out.println("the location of the number is" + i);
//////            }
//////        }
////            int val=search(ar,k);
////            if(val==-1){
////                System.out.println("key not found");
////            }
////            else{
////                System.out.println("the number is at location " + val);
////            }
////
////
////
////        }
////    public static int largest(int a[]) {
////        int larg = Integer.MIN_VALUE;
////        for (int i = 0; i < a.length; i++) {
////            larg = Integer.MAX_VALUE;
////            if (larg < a[i]) {
////                larg = a[i];
////            }
////
////        }
////
////        return larg;
////    }
////        int a[]={10,21,32,43,12,54,32};
//////        int i=0;
//////        int j=1;
//////        //int t=j;
//////        //System.out.println(a[i]);
//////        while(i<a.length) if (a[i] < a[j]) {
//////            i = j;
//////            j++;
//////        } else {
//////            j++;
//////        }
//////        System.out.println(a[i]);
//////
////        System.out.println(largest(a));
////    public static int bSearch(int a[],int k){
////        int s=0,e=a.length-1;
////        //int mid=(s+e)/2;
////        while(s<=e){
////            int mid=(s+e)/2;
////            if(a[mid] == k){
////                return mid;
////            }
////            else if(a[mid]<k){
////                    s=mid+1;
////            }
////            else{
////                e=mid-1;
////            }
////        }
////        return -1;
////    }
////    public static void  main(String[] args){
////        int a[]={10,20,30,40,50,60};
////        int k=40;
////        System.out.println(bSearch(a,k));
//    //linear search
////    public static int linear(int a[],int k){
////
////        for (int i=0;i<a.length;i++){
////            if(a[i]==k){
////                return i;
////            }
////
////        }
////
////        return k;
////
////    }
////    public static int largest(int a[]){
////        int l=0;
////        for(int j=0;j<a.length;j++){
////            if(a[j]>l){
////                l=a[j];
////
////            }
////        }
////        return l;
////    }
////    public static int bsearch(int b[],int a){
////        int s=0,la=b.length-1;
////        for(int l=0;l<b.length;l++){
////            //int s=0;l=b.length-1;
////            int mid=(s+la)/2;
////            if(b[l]==a){
////                return l;
////            }
////            else if(b[l]<a){
////                la=mid;
////            }
////            else{
////                s=mid+1;
////            }
////        }
////        return -1;
////    }
//    public static int  reverse(int a[]){
//        int s=0,l=a.length-1;
//        while(s<l){
//            int temp=a[l];
//            a[l]=a[s];
//            a[s]=temp;
//            s++;
//            l++;
//        }
//
//        //return false;
//        return -1;
//    }
//
//    public static void main(String args[]){
//        int a[]={12,13,21,32,34,11};
//        int b[]={10,12,14,23,24,25};
//        int k;
//        reverse(a);
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
////        System.out.println(linear(a,45));
////        System.out.println(largest(a));
//        //System.out.println(reverse(a));
//
//    }
//    }
import java.util.*;
public class basics {
    //    public static void reverse(int a[]){
//        int s=0,l=a.length-1;
//        while(s<l){
//            int temp=a[s];
//            a[s]=a[l];
//            a[l]=temp;
//            s++;
//            l++;
//
//        }
//    }
//    public static void subarr(int[] a){
//        for(int i=0;i<a.length-1;i++){
//            for(int j=0;j<a.length;j++){
//                System.out.print(a[i]+a[j]);
//            }
//            System.out.println();
//        }
//        //return -1 ;
//
//    }
//    public static int firstocc(int a[],int i){
//        for(int in=0;in<a.length;in++){
//            if(i==a[in]){
//                return in;
//            }
//        }
//        return -1;
//    }
//    public static void ptdecnum(int n) {
//        if (n > 0) {
//            System.out.print(n);
//
//            ptdecnum(n - 1);
//        }
//    }
//
//    public static int sumofn(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n + sumofn(n - 1);
//    }
//
//    public static int fibnoci(int n) {
//        if (n == 1 || n == 0) {
//            return n;
//        }
//        return fibnoci(n - 1) + fibnoci(n - 2);
//
//    }
//
//    public static boolean arrsotred(int a[], int i) {
//        if (i == a.length - 1) {
//            return true;
//        }
//        if (a[i] > a[i + 1]) {
//            return false;
//        }
//        return arrsotred(a, i + 1);
//    }
//
//    public static int fstoccc(int a[], int i, int num) {
//        if (a[i] == num) {
//            return i;
//        }
//        if (i == a.length - 1) {
//            return -1;
//        }
//        return fstoccc(a, i + 1, num);
//    }
//
//    public static int fstocc(int a[], int i, int num) {
//        if (i == a.length) {
//            return -1;
//
//        }
//        if (a[i] == num) {
//            return i;
//        }
//        return fstocc(a, i + 1, num);
//    }
//
//    class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public static Node head;
//    public static Node tail;
//
//    public void add(int data) {
//        Node nn = new Node(data);
//        if (head == null) {
//            head = tail = nn;
//            return;
//        }
//        tail.next = nn;
//        tail = nn;
//    }
//
//    public void pnt() {
//        if (head == null) {
//            System.out.println("no data");
//            return;
//        }
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public static int fndmid(Node head) {
//        int cnt = 0;
//        Node slow = head;
//        Node fast = head.next;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            cnt++;
//            fast = fast.next.next;
//        }
//        return cnt;
//    }
//
//    public void addmdl(int n, int idx) {
//        Node nn = new Node(n);
//        if (head == null) {
//            System.out.println("return no data found");
//            return;
//        }
//        int cnt = 0;
//        Node temp = head;
//        while (cnt != idx) {
//            temp = temp.next;
//            cnt++;
//            ;
//        }
//        nn.next = temp.next;
//        temp.next = nn;
//    }
//    public static int ans(int num){
//        if(num==0){
//            return 0;
//        }
//        if(num<10){
//            return num;
//        }
//        int sum=0;
//        while(num>0){
//            num=num%10;
//            sum=sum+num;
//            num=num/10;
//        }
//        return ans(sum);
//    }
    public static int leet_ft(int[] height) {
        int lm=height[0];
        int rm=height[height.length-1];
        int ar[]=new int [height.length];
        int al[]=new int [height.length];
        ar[ar.length-1]=rm;
        for(int i=ar.length-2;i>=0;i--){
            ar[i]=Math.max(height[i],ar[i+1]);
        }
        al[0]=height[0];
        for(int i=1;i<al.length;i++){
            al[i]=Math.max(height[i],al[i-1]);
        }
        int s=0;
        for(int i=0;i<height.length;i++){
            int val=Math.min(al[i],ar[i]);
            s=s+val-(height[i]);
        }
        return s;
    }
    public static int leet209(int target, int[] nums) {
        Arrays.sort(nums);
        int s=0;
        for(int i=nums.length-1;i>=0;i--){
            if(s<target){
                s=s+nums[i];
            }
            else if(s>=target){
                return s;
            }

        }
        return 0;
    }
    public static int ways(int n,int pos,int c){
        if(pos>n){
            return c;
        }
        if(n==pos){
            return c++;
        }
        ways(n,pos+1,c);
        ways(n,pos+2,c);
        return c;

    }
    public static boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        int y=1;
        while(y<=n/2){
            if(n%y!=0){
                return false;
            }
            y++;
        }
        int x=6;
        if(n%2==0||n%3==0||n%5==0){
            while(x<n){
                if(n%x==0){
                    return false;
                }
                x++;
            }
            return true;
        }
        return true;
    }
    public static boolean primernt(int n){
        int x=2;
        while(x<=n/2){
            if(n%x==0){
                return false;
            }
            x++;
        }
        return true;
    }
    public static int leetcode313(int n, int[] primes) {
        int c = 1;
        if (n == 1) {
            return n;
        }
        int nu = 2;
        while (c <= n) {
            for (int i = 0; i < primes.length; i++) {
                if (nu % primes[i] == 0) {
                    c++;
                    break;
                }
            }
            nu++;
        }
        return nu;
    }
    public static void main(String args[]) {
        //int a[] = {2, 4, 6, 8, 10};
        // System.out.println(firstocc(a,10));
        //reverse(a);
//        int s=0,l=a.length-1;
//        while(s<l) {
//            int temp = a[s];
//            a[s] = a[l];
//            a[l] = temp;
//            s++;
//            l--;
//        }
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//        for(int i=a.length-1;i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("("+a[j]+","+a[i]+")");
//
//            }

//            System.out.println();
//        }

//        subarr(a);
//        for(int i=0;i<a.length;i++){
//            for (int j=i+1;j<a.length;j++) {
//                for (int k = j; k >= 0; k--) {
//                    System.out.print("(" + a[i] + "," + a[k] + ")");
//                }
//            }
//            System.out.println();
        // }
//        int sum=0,add=0;
//        for(int i=0;i<a.length;i++){
//            int s=i;
//            for(int j=i;j<a.length;j++){
//                int e=j;
//                for(int k=s;k<=e;k++){
//                    System.out.print(a[k]+"");
//
//                }
//                sum++;
////
//
//                System.out.println();
//            }
////            System.out.println(sum);
//            System.out.println();
//        }
//        System.out.println(sum);
//        for(int i=0;i<a.length;i++){
//            int s=i;
//            for(int j=0;j<a.length;j++){
//                int e=j;
//                int sum=0;
//                for(int k=s;k<=e;k++){
//                    System.out.print(a[k]);
//
//                    sum=sum+a[k];
//                    if(k==e){
//                        System.out.print(sum);
//                    }
//                }
//                System.out.println();
//
//
//            }
//            //System.out.println();
//        }
//
//    }
        //fibanocci
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int f1=0,f2=1,f3=0;
//        for(int i=2;i<n;i++){
//            f3=f1+f2;
//            f1=f2;
//            f2=f3;
//        }
//        System.out.println(f3);
//        //String s=sc.nextLine();
//        int a=sc.nextInt();
//        float b=sc.nextFloat();
//        String s=sc.next();
//        //sc.nextLine();
//        s=sc.nextLine();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.print(s);
//        int n=sc.nextInt();
//        int in=1;
//        int k=n*(n+1)-n;
//    for(int i=0;i<=n;i++){
//        for(int j=0;j<=n*2;j++){
//            if(j<n) {
//                if (j < i) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print(in + "*");
//                    in++;
//                }
//            }
//            if(j>n){
//
//                    System.out.print(k+"*");
//                        k--;
//                    }
//                }
//
//            }
//        System.out.println();
//        basics ll=new basics();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//        ll.pnt();
//        int n=ll.fndmid(head);
//        Scanner sc=new Scanner (System.in);
//        int d=sc.nextInt();
//        ll.addmdl(d,n);
//        ll.pnt();
        // LinkedList<Integer> ll=new LinkedList();
        // ptdecnum(5);
        //System.out.println(fibnoci(5));
//        int a[]={1,2,6,4,5};
//        System.out.println(fstocc(a,0,4));
//        int a[]={2,1,6,4,5};
//        //System.out.println(arrsotred(a,0));
//        int ab=fstoccc(a,0,6);
//        if(ab==-1){
//            System.out.println("the value is not present");
//        }
//        else {
//            System.out.println("the value is at "+ab);
//        }
//        ArrayList<Integer> l1=new ArrayList();
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
        //peek
//        System.out.println(l1.get(l1.size()-1));
//        l1.remove(l1.size()-1);
//        stack s=new stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.pnt();
        //s.pop();
//        int y;
//        int sum=0;
//        int x = 121;
//        while (x > 0){
//            y=x%10;
//            sum=sum*10+y;
//            x=x/10;
//        }
//        int a[]={1,2,3,4,5,6,7};
//        int t[]=new int [a.length];
//        for(int i=0;i<a.length;i++){
//            t[i]=a[i];
//        }
//        int target=4;
//        Arrays.sort(a);
//        int s=0;
//        int l=a.length-1;
//        while(s!=l){
//            int mid=(s+l)/2;
//            if(a[mid]>target){
//                l=mid;
//            }
//            if(a[mid]<target){
//                s=mid;
//            }
//            if(a[mid]==target){
//                s=mid;
//                break;
//            }
//        }
//        int n=2233;
//        int n1=0;
//        while (n > 0) {
//            int d=n%10;
//            n1=n1*10+d;
//            n=n/10;
//        }
//        System.out.println(n1);
//        while (n1> 0) {
//            int d=n1%10;
//            n=n*10+d;
//            n1=n1/10;
//        }
//        System.out.println(n);
//        int n=2932;
//        int n1=0;
//        int c=0;
//        while(c<2){
//            int d=n%10;
//            n1=n1*10+d;
//            n=n/10;
//            c++;
//        }
//
//
//
////        int n2=0;
////        int c2=0;
////        while(c2<2){
////            int d=n1%10;
////            n2=n2*10+d;
////            n1=n1/10;
////            c2++;
////        }
//
//        System.out.println(n2+n);
//        int a=ans(38);
//        System.out.println(a);

//        int N = arr.length;
//        int[] PS = new int[N];
//        PS[0] = arr[0];
//        for(int i=1; i<N; i++){
//            PS[i] = arr[i] + PS[i-1];
//        }
//
//        int sum = PS[N-1];
//        for(int len=3; len<=N; len+=2){
//            sum += PS[len-1];
//            for(int i=len; i<N; i++){
//                sum += PS[i] - PS[i - len];
//            }
//        }
//        int l=arr.length;
//        int temp[]=new int[l];
//        temp[0]=arr[0];
//        for(int i=1;i<l;i++){
//            temp[i]=temp[i-1]+arr[i];
//        }
//        int sum=temp[l-1];
//        for(int i=3;i<=l;i+=2){
//            sum=sum+temp[i-1];
//            for(int j=i;j<l;j++){
//                sum=sum+temp[i]-temp[j-i];
//            }
//        }
//
//
//        System.out.println(sum);
//        int k=4;
//        int nums[]={3,2,3,1,2,4,5,5,6};
//        Arrays.sort(nums);
//        int x=1;
//        int h=nums.length-1;
//        int largest=nums[nums.length-1];
//        while(x<k){
//            h--;
//            if(nums[h]<largest){
//                largest=nums[h];
//                x++;
//            }
//        }
//        System.out.println(largest);
        int nums[]={3,2,3};
//        System.out.println(leet209(213,a));
//        System.out.println(ways(3,0,0));
        int count=0;
        Integer me=null;

        //travese the array
        //make the first ele as the majority
        //if next is qual c++ || if not c--
        // after count bcom zero make the element as majority where count got zero
        for(int i=0;i<nums.length;i++){
            if(count==0){
                me=nums[i];
                count=1;
            }else if(nums[i]==me){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(me);
    }
}