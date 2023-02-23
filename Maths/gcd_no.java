import java.util.*;
public class gcd_no {
    public static int gcd_num(int a,int b){
        if(b == 0) return a;
        return gcd_num(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd_num(a, b));
    }
}
