import java.util.*;
public class facto_no {
    // Itrative approch
    public static int fact_num(int n){
        int p = 1;
        for(int i=1;i<=n;i++){
            p = p*i;
        }
        return p;
    }
    // Recursive approch
    public static int fact_no(int n){
        if(n==1) return 1;
        return (n*fact_no(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact_num(n));
        System.out.println(fact_no(n));
    }
}
