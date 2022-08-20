import java.util.*;
public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        for (double f = 0; f < t; f++) {
            double n = sc.nextDouble();
            double k = sc.nextDouble();
            double b = sc.nextDouble();
            double s = sc.nextDouble();
            if (s / k == b) {
                for (double i = 0; i < n - 1; i++) {
                    System.out.print(0 + " ");
                }
                System.out.println(s);
            } else {
                double c = 0;
                while (true) {
                    s = s - (k - 1);
                    c += 1;
                    if (s / k == b && c<=n) {
                        for (double i = 0; i < n - 1 - c; i++) {
                            System.out.print(0 + " ");
                        }
                        for (double i = 0; i < c; i++) {
                            System.out.print(n - 2 + " ");
                        }
                        System.out.println(s);
                        break;
                    }
                    if (s / k < b) {
                        System.out.println(-1);
                        break;
                    }
                }
            }
        }
    }
}
