import java.util.*;
public class leet_code {
    //    public class sums(int arr[],int t){
//
//    }
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int m1=arr[0];
//        for(int i=0;i<n;i++){
//            if(arr[i]>m1){
//                m1=arr[i];
//            }
//        }
//        //System.out.println(m1);
//        int m2=-1;
//        for(int i=0;i<n;i++){
//            if(m2<arr[i] &m1!=arr[i]){
//                m2=arr[i];
//            }
//        }
//        System.out.println(m1+","+m2);
//
//    }
//}
//public static  int print2largest(int arr[], int n) {
//    int m1=arr[0];
//    for(int i=0;i<n;i++){
//        if(arr[i]>m1){
//            m1=arr[i];
//        }
//    }
//    int m2=-1;
//    for(int i=0;i<n;i++){
//        if(m2<arr[i] &m1!=arr[i]){
//            m2=arr[i];
//        }
//    }
//    return m2;
//
//}
//    public static void main(String args[]){
//        // Scanner sc=new Scanner(System.in);
//        //  int n=sc.nextInt();
//        //  int arr[]=new int[n];
//        //  for(int i=0;i<n;i++){
//        //      arr[i]=sc.nextInt();
//        //  }
//        int arr[]={12,35,1,10,34,1};
//        int n=6;
//        //print2largest(arr,n);
//        System.out.println(print2largest(arr,n));
//    public static void findNum(int arr[],int s,int su){
//        if (su >= s) {
//
//            for(int i=0;i<5;i++){
//                int sum=0;
//                for(int j=i;j<5;j++){
//                    if(sum>s){
//                        System.out.println(sum);
//                    }
//                    else if(sum<s){
//                        sum=sum+arr[j];
//                    }
//                    else if(sum==s){
//                        for(int a=i;a<j;a++){
//                            System.out.print(a);
//                            break;
//                        }
//
//                    }
//                }
//            }
//        }
//
//        else System.out.println("we cant find the subarray");
//    }
    //public static int fact(int n){
//        int x=1;
//        for(int i=2;i<=n;i++){
//           x=x*i;
//        }
//        return x;
//    }
    public static int leet1732(int gain[]) {

    int nums[] = new int[gain.length + 1];
    nums[0]=0;
        for(
    int i = 0;
    i<nums.length;i++)

    {
        nums[i + 1] = nums[i] + gain[i];
    }

    int j = nums[0];
        for(
    int i = 1;
    i<nums.length;i++)

    {
        if (j < nums[i]) {
            j = nums[i];
        }
    }
        return j;
}
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int arr[] = {1,2,3,4,5,6};
////        for (int i = 0; i < 5; i++) {
////            arr[i] = sc.nextInt();
////        }
//        int s = 6;
//        int su = 0;
//        for (int i = 0; i < 5; i++) {
//            su = su + arr[i];
//        }
        //findNum(arr,s,su);
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int x=2*n;
//    int a[]=new int[x];
//    for(int i=0;i<x;i++){
//        a[i]=sc.nextInt();
//    }
//    int a1[]=new int[n];
//    int a2[]=new int[n];
//    for(int i=0;i<n;i++){
//           a1[i]=a[i];
//           a2[i]=a[i+n];
//    }
//    for(int i=0;i<n;i++){
//        System.out.print(a1[i]+" "+a2[i]+" ");
//    }
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[]=new int[2*n];
//        for(int i=0;i<2*n;i++){
//            a[i]=sc.nextInt();
//        }
//        int a1[]=new int[n];
//        int a2[]=new int[n];
//        int o=Integer.MAX_VALUE;
//        //int count=0;
//        int s1=0,s2=0;
//        for(int i=0;i<n;i++){
//           a1[i]=a[i];
//           s1=s1+a1[i];
//           a2[i]=a[i+n];
//           s2=s2+a2[i];
//        }
//        int x=Math.abs(s1-s2);
//       // int p=fact(2*n)/(fact(n)*fact(n));
//        int count=0;
//        for(int i=0;i<2*n;i++){
//            while(count <=i){
//
//                count++;
//            }
//        }
        int a[]={41,65,14,80};

        System.out.println(leet1732(a));
    }
}


