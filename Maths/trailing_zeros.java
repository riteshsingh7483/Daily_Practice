import java.util.*;
public class trailing_zeros {
    public static int trails_zeros(int n){
        int c = 0;
        for(int i=5;i<=n;i=i*5){
            c = c+n/i;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trails_zeros(n));
    }
}
