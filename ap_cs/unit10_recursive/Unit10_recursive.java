package ap_cs.unit10_recursive;

public class Unit10_recursive {
    public static int mystery(int n) {
        if(n == 1) {
            return 1;
        }else {
            return 3 * mystery(n-1);
        }
        
    }
    public static int product(int n) {
        if(n <= 1) {
            return 1;
        }else {
            return n * product(n-2);
        }
        
    }
    public static int f(int n) {
        if(n <= 1) {
            return 1;
        }else {
            return f(n-1) + f(n-2);
        }
        
    }
    public static void main(String[] args) {
        // System.out.print(Unit10_recursive.mystery(3));
        // System.out.print(Unit10_recursive.product(5));
        System.out.print(Unit10_recursive.f(30));
    }
}
