import java.util.*;
public class a {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = Integer.min(n,m);
            int b = Integer.max(n,m);
            int ans;
            if(a == 1 && b == 1){
                ans = 0;
            }
            else if(a==1){
                ans = b;
            }
            else if(b == 1){
                ans = a;
            }
            else if(a%2 == 0){
                ans = a/2 + b-2 + a/2 + a/2 + a/2 ;
            }
            else{
                ans = a/2 + b-1 + a/2 + a/2 +1 + a/2;
            }
            System.out.println(ans);

        }
    }
}
