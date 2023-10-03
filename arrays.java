import java.util.*;
public class arrays {
    //public static boolean val() {
        //q1
//        int nums[] = {1, 2, 3, 4, 5};
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[0] == nums[i]) {
//                return 1;
//            } else return 0;
//        }
//
//        if ( return =1){
//            System.out.println("true");
//        }
    //}
//    public static void subarray(int a[]) {
//
//    }
//        public static void main(String[]args){
//            int a[] = {1, -2, 6, -1, 3};
//            int add=0;
//            for(int i=0;i<a.length;i++){
//                int s=i;
//                for(int j=0;j<a.length;j++){
//                    int l=j;
//                    int sum=0;
//                    for(int k=s;k<=l;k++){
//                        System.out.print(a[k]+" ");
//                        sum=sum+a[k];
//                        if(k==l){
//                            System.out.println("="+sum);
//                        }
//
//                    }
//                    add++;
//                    System.out.println();
//
//                }
//                System.out.println("total number of times="+add);
//            }
//        }
    //q2
//    public static int find(int arr[]){
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++) {
//                if (arr[i] == arr[j]) {
//                    return 1;
//                }
//            }
//
//        }
//        return 0;
//    }
//    public static void main(String args[]){
//        int arr[]={1,2,3,4,1,3};
//        int x=find(arr);
//        System.out.println(x);
//        if(x>0){
//            System.out.println("the array has the numbers which were as same in it");
//        }
//        else System.out.println("no common elements");
//    }
    //stocks
//    public static int profit_of_stocks(int a[]){
//        int count=0;
//        for(int i=0;i<a.length-1;i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] - a[j] > count) {
//                    count = a[i] - a[j];
//                    System.out.println(a[i]);
//                    System.out.print(a[j]);
//                }
//            }
//        }
//        return count;
//
//    }
//    public static void main(String args[]){
//        int arr[]={7,6,3,6,1};
//        System.out.println(profit_of_stocks(arr));
//    }
//    public static void zero_sum(int a[]){
//        for(int i=0;i<a.length-1;i++){
//            for(int j=0;j<a.length;j++){
//                if(a[i]+a[j]==0){
//                    System.out.println("["+a[i]+","+a[j]+"]");
//                }
//            }
//        }
//    }
//    public static void main(String args[]){
//        int arr[]={-1,2,-4,-3,4};
//        zero_sum(arr);
//    }
    public static void maxMin(int a[]){
        int min=a[0];
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("maximun:"+max+"   mimimun"+min);
        //return min;
    }
    public static void reverse(int a[]){
        for(int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-1-i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void rev(int a[]){
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
    public static void maxsub(int a[],int n){
        int sum=0;
        int in=0;
        for(int i=0;i<a.length-1;i++){
            if(sum<a[i]+a[i+1]){
                sum=a[i]+a[i+1];
                in=i;
            }
        }
        System.out.println(sum+"="+a[in]+"+"+a[in+1]);

    }
    public static boolean dupl(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void traprainwater(int height[]){
        int lm[]=new int[height.length];
        lm[0]=height[0];
        int x=lm[0];
        for(int i=1;i<height.length;i++){
            lm[i]=Math.max(height[i],lm[i-1]);
        }
        int rm[]=new int[height.length];
        rm[height.length-1]=height[height.length-1];
        for(int i= height.length-2;i>=0;i--){
            rm[i]=Math.max(height[i],rm[i+1]);
        }
        int ws=0;
        for(int i=0;i< height.length;i++){
            int w=Math.min(lm[i],rm[i]);
            ws=ws+(w-height[i]);
        }
        System.out.println(ws);
    }
    public static void stocks(int pric[]){
        int n=pric.length;
        int x=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(pric[j]-pric[i]>x){
                    x=pric[j]-pric[i];
                }
            }
        }
        System.out.println(x);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(pric[j]-pric[i]==x){
                    System.out.println("buy="+pric[i]+",sell="+pric[j]);
                }
            }
        }
    }
    public static void water(int a[]){
        int n=a.length;
        int lm[]=new int[n];
        int rm[]=new int[n];
        lm[0]=a[0];
        rm[n-1]=a[n-1];
        for(int i=1;i<n;i++){
            lm[i]=Math.max(a[i],lm[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rm[i]=Math.max(a[i],rm[i+1]);
        }
        int s=0;
        for(int i=0;i<n;i++){
            int w=Math.min(rm[i],lm[i]);
            s=s+(w-a[i]);
        }
        System.out.println(s);
    }
    public static int secondlarg(int a[]){
        //int min=Integer.MIN_VALUE;
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        int min=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if (a[i] < max && a[i] > min) {
                min=a[i];
            }
        }
        return min;

    }
//    public static int dif(int a1[],int a2[]){
//        int dump1[]=new int[a1.length];
//        int dump2[]=new int[a2.length];
//
//        for(int i=0;i<a1.length;i++){
//            for(int j=0;j<a2.length;j++){
//
//                }
//            }
//        }
//
//    }
//deletion of an element from the array
    public static void delete_element(int a[],int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
               for(int j=i+1;j<a.length;j++){
                   a[j-1]=a[j];
               }
               break;
            }
        }
        /*for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+",");
        }*/
    }
    public static void give_val_to_dlt(int a[]){
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    delete_element(a,a[j]);
                }
            }
        }
        for(int i=0;i<a.length-c;i++){
            System.out.print(a[i]+",");
        }
    }
    public static void nodulp(int a[]){
        int dup[]=new int[a.length];
        dup[0]=a[0];
        boolean array;
        int c=0;
        for(int i=1;i<a.length;i++){
            array=true;
            for(int j=c;j>=0;j--){
                if(a[i]==dup[j]){
                    array=false;
                    break;
                }
            }
            if(array){
                c++;
                dup[c]=a[i];
            }
        }
        for(int i=0;i<=c;i++){
            System.out.print(dup[i]);
        }
    }
    public static void nodulp_2(int a[]){
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length-c;j++){
                if(a[i]==a[j]){
                    for(int k=j;k<a.length-c;k++){
                        a[j]=a[j+1];
                    }
                    c++;
                }
            }
        }
        for(int i=0;i<a.length-c;i++){
            System.out.print(a[i]);
        }
    }
    public static int fin(int nums[]){
        int a=nums[0];
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>a){
                c=i;
            }
        }
        return c;
    }
    public static void plus(int[] digits) {
        int length=digits.length;
        int num1=1;
        int i=1;
        while(i<length){
            num1=num1*10;
            i++;
        }
        int sum=0;
        for(int j=0;j<length;j++){
            sum=sum+digits[j]*num1;
            num1=num1/10;
        }
        sum++;
        int val=sum;
        int c=0;
        while(sum>0){
            c++;
            sum=sum/10;
        }
        int arr[]=new int[c];
        for(int f=c-1;f>=0;f--){
            int r=val%10;
            arr[f]=r;
            val=val/10;
        }
        for (int l=0;l<c;l++){
            System.out.print(arr[l]);
        }
    }
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
    public static int[] let1(int nums[]) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[c]=nums[i];
                c++;
            }
        }

            return nums;
        }
    public static void let1431(int nums[],int k){
        int j=nums[0];
        for(int i=1;i<nums.length;i++){
            if(j<nums[i]){
                j=nums[i];
            }
        }
       boolean s[]=new boolean [nums.length];
        for( int i=0;i<nums.length;i++){
            if(nums[i]+k>j){
                s[i]=true;
            }
        }


    }
    public static void leet27(int[] nums, int val) {
        int s=0;
        int e=nums.length-1;
        int i=0;
        while(s<=e){
            if(nums[s]==val && nums[e]!=val){
                nums[s]=nums[e];
                s++;
                e--;
                i++;
            }
            else if(nums[s]!=val &&nums[e]==val){
                e--;
                s++;
                i++;
            }
            else if(nums[s]==val && nums[e]==val){
                nums[s]=nums[e-1];
                e=e-2;
                i++;
            }
            else{
                s++;
            }
        }

        for(int a=0;a<nums.length-i;a++){
            System.out.print(nums[a]+" ");;
        }

    }
    public static void nextgreaterloop(int a[]){
        int nxtga[]=new int [a.length];
        for(int i=0;i<a.length-1;i++){
            int pv=a[i];
            int g=a[i+1];
            for(int j=i+2;j<a.length;j++){
                if(g<a[j]){
                    g=a[j];
                }
            }
            if(g<a[i]){
                nxtga[i]=-1;
               // break;
            }
            else {
                nxtga[i] = g;
            }
        }
        nxtga[a.length-1]=-1;
        for (int i=0;i<a.length;i++){
            System.out.print(nxtga[i]+" ");
        }
    }
    public static void nextgreater(int a[]){
        int gv[]=new int [a.length];
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1]){
                gv[i]=a[i+1];
            }
            else{
                gv[i]=-1;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(gv[i]+" ");
        }
    }
    public static void nextfirstgreater(int a[]){
        int gr[]=new int [a.length];
        for(int i=0;i<a.length-1;i++){
            boolean x;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    gr[i]=a[j];
                    break;
                }
                else{
                    gr[i]=-1;
                }
            }
            gr[a.length-1]=-1;
        }
    }
    public static void main(String args[]){
//        int a[]={1,2,3,4,5,6,7,8,9,10};
//        int pric[]={7,1,5,3,6,4};
//        System.out.println(secondlarg(a));
        //System.out.println(dupl(arr));
        //traprainwater(arr);
        //stocks(pric);
        //water(a);
//        int a1[]={1,2,1,4,5,4,3,3,3,5,5,5};
//        int a2[]={1,2,1,4,5,4,3,3,3,5,5,5};

        //rev(a1);
        //int a2[]={6,8,4,8};
        //System.out.println(dupl(a1));
//        nodulp(a1);
//        System.out.println();
//        nodulp_2(a2);
       // dif(a1,a2);
        //delete_element(a1,2);
        //give_val_to_dlt(a1);
//        int a[]={0,0,1};
//        System.out.println(let1431(a,1));
        int a[]={6,8,0,1,3,6};
        nodulp(a);
        delete_element(a,8);
    }
    }


