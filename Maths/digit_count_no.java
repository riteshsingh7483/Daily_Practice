import java.util.*;
public class digit_count_no {
    public static int digit_count(int n){
        if(n == 0) return 0;
        return 1+digit_count(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Recursive Approch
        System.out.println(digit_count(n));
        // Logarithmic approch
        System.out.println(1+(int)Math.log10(n));
    }
}
