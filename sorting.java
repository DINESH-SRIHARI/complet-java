public class sorting {
//    public static void sorting(int a[]) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j <=(a.length ) - i; j++) {
//                if (a[i] > a[i + 1]) {
//                    int temp = a[i];
//                    a[i] = a[i + 1];
//                    a[i + 1] = temp;
//                }
//            }
//        }
//    }
//        public static void ptarray ( int a[]){
//            for (int i = 0; i < a.length - 1; i++) {
//                System.out.print(a[i] + " ");
//            }
//        }
//
//        public static void main (String args[]){
//            int a[] = {5, 4, 2, 8};
//            sorting(a);
//            ptarray(a);
//        }
    //bubble sort
//    public static void bubble(int a[]){
//        for(int i=0;i<a.length-1;i++){
//            for(int j=0;j<a.length-i-1;j++){
//                if(a[j]>a[j+1]){
//                    int swap=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=swap;
//                }
//            }
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]);
//        }
//    }
//    public static void main(String args[]){
//        int a[]={8,3,4,2,5,21};
//        bubble(a);
//    }
//selection sort
//    public static void bubble(int a[]){
//        for(int i=0;i<a.length-1;i++){
//            for(int j=0;j<a.length-i-1;j++){
//                if(a[j]>a[j+1]){
//                    int temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
    public static void pt(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void bubblesort(int a[]){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void selection(int a[]){
        for(int i=0;i<a.length-1;i++){
            int mp=i;
            for(int j=i+1;j<a.length;j++){
                if(a[mp]>a[j]){
                    mp=j;
                }
            }
            int temp=a[mp];
            a[mp]=a[i];
            a[i]=temp;
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void insertionsort(int a[]){
        for(int i=1;i<a.length;i++){
            int c=i;
            int p=i-1;
            while((p>0)&&a[p]>a[c]){
                a[p+1]=a[p];
                p--;
            }
            a[p+1]=a[c];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    public static void selsot(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void countingsrt(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }


    }
    public static void mrgsrt(int a[],int s,int e){
        if(s>=e){
            return;
        }
        int m=(e+s)/2;
        mrgsrt(a,s,m);
        mrgsrt(a,m+1,e);
        mrge(a,s,m,e);
    }
    public static void mrge(int a[],int s,int m,int e){
        int t[]=new int[e-s+1];
        int k=0;
        int i=s,j=m+1;
        while(i<=m&&j<=e){
            if(a[i]>a[j]){
                t[k]=a[j];
                j++;
            }
            else{
                t[k]=a[i];
                i++;
            }
            k++;
        }
        while(i<=m){
            t[k++]=a[i++];
        }
        while(j<=e){
            t[k++]=a[j++];
        }

        for(int x=0;x<t.length;x++){
            a[s++]=t[x];
        }
    }
//    public static void merge(int a[],int s,int m,int e){
//        int temp[]=new int[e-s+1];
//        int k=0;
//        int i=s;
//        int j=m+1;
//        while(i<=m&&j<=e){
//            if(a[i]>a[j]){
//                temp[k]=a[j];
//                j++;
//            }
//            else{
//                temp[k]=a[i];
//                i++;
//            }
//            k++;
//        }
//        while(i<=m){
//            temp[k++]=a[i++];
//        }
//        while(j<=e){
//            temp[k++]=a[j++];
//        }
//        int x=s;
//        for(int l=0;l<temp.length;l++){
//            a[x]=temp[l];
//            x++;
//        }
//    }
    public static void quicksrt(int a[],int s,int p){
        if(p<=s){
            return;
        }
        int pvt=partion(a,s,p);
        quicksrt(a,s,pvt-1);
        quicksrt(a,pvt+1,p);


    }
    public static int partion(int a[],int s,int e){
        int pivot=a[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(a[j]<=pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int t=pivot;
        a[e]=a[i];
        a[i]=t;


        return i;
    }
    public static int sortrtedrotated(int a[],int t,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(a[m]==t){
            return m;
        }
        if(a[m]>=a[s]) {
            if (t >= a[s] && t < a[m]) {
                return sortrtedrotated(a, t, s, m);
            }
            else{
                return sortrtedrotated(a,t,m+1,e);
            }
        }
        else{
            if(t>a[m]&&t<=a[e]){
                return sortrtedrotated(a,t,m+1,e);
            }
            else{
                return sortrtedrotated(a,t,s,m-1);
            }
        }

    }
    public static void main(String args[]){
        int arr[]={4,5,6,1,2,3};
       // System.out.println(sortrtedrotated(arr,2,0, arr.length-1));
        mrgsrt(arr,0,arr.length-1);
        pt(arr);
    }
    }

