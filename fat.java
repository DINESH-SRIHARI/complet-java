import java.util.*;
public class fat {
    public static int maxeqbsum(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int pre = a[i], suf = a[i];
            for (int j = 0; j < i; j++) {
                pre = pre + a[j];
            }
            for (int j = a.length - 1; j > i; j--) {
                suf = suf + a[j];
            }
            if (pre == suf) {
                return pre;
            }
        }
        return -1;
    }

    public static void majority(int a[]) {
        int l = a.length;
        int a1[] = new int[l];
        for (int i = 0; i < l; i++) {
            int c = 0;
            for (int j = i + 1; j < l; j++) {
                if (a[i] == a[j]) {
                    c++;
                }
            }
            a1[i] = c;
        }

        int m = Integer.MIN_VALUE;
        int in = -1;
        for (int i = 0; i < l; i++) {
            if (a1[i] > m) {
                m = a1[i];
                in = i;
            }
        }
        if (a[in] > l / 2) {
            System.out.println(a[in]);
        } else System.out.println("no max value");
    }

    public static void leaders(int a[]) {
        for (int i = 0; i < a.length; i++) {
            boolean val = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    val = false;
                }
            }
            if (val) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void natrual_sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void quick_srt(int a[]) {
        if (a.length == 1) {
            if (a[a.length - 1] > 0) {
                System.out.print(a[a.length - 1] + " ");
                return;
            }
        }
        if (a.length == 0) {
            return;
        }
        int p = a[a.length - 1];
        int al[] = new int[a.length];
        int ar[] = new int[a.length];
        int c1 = 0, c2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == p) {
                break;
            } else {
                if (a[i] > p) {
                    ar[c2] = a[i];
                    c2++;
                }
                if (a[i] < p) {
                    al[c1] = a[i];
                    c1++;
                }
            }
        }
        quick_srt(al);
        quick_srt(ar);
    }

    public static void the_clelbrity(int a[][]) {
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != 0) {
                    break;
                }

            }
        }
    }

    public static void main(String args[]) {
        int a[] = {16, 17, 4, 3, 5, 2};
        //System.out.println(maxeqbsum(a));
        //majority(a);
        //leaders(a);
        //quick_srt(a);
        Scanner sc = new Scanner(System.in);
        int ab[][] = new int[2][2];
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab.length; j++) {
                ab[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            boolean b=true;
            for (int j = 0; j < a.length; j++) {
                if (ab[i][j] != 0) {
                    b=false;
                    break;
                }
                System.out.println("test1");
            }

            if(b=true){
                for (int k = 0; i < ab.length; i++) {
                    for (int j = 0; j < ab.length; j++) {
                        if(k==j){
                            break;
                        }
                        if(ab[j][k]!=1){
                            b=false;
                            break;
                        }
                    }
                }
            }
            if(b){
                System.out.println("i");

            }

        }
    }
}
