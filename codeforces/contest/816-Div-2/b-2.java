import java.util.*;
public class b {
    public static boolean helper(long n, long k, long b, long s) {
        if (s / k == b) {
            for (long i = 0; i < n - 1; i++) {
                System.out.print(0 + " ");
            }
            System.out.println(s);
        }
        else {
            long c = 0;
            while (s / k >= b) {
                s = s - (k - 1);
                c += 1;

                if (s / k == b && c <= n) {
                    for (long i = 0; i < n - 1 - c; i++) {
                        System.out.print(0 + " ");
                    }

                    for (long i = 0; i < c; i++) {
                        System.out.print(n - 2 + " ");
                    }
                    System.out.println(s);
                    return true;
                }
                else if (s / k < b) {
                    break;
                }
            }
            if (s / k < b) {
                System.out.println(-1);
                return true;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long f = 0; f < t; f++) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();
            helper(n,k,b,s);
            }
        }
    }
