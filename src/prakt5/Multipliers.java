package prakt5;

public class Multipliers {
    public static void Multiplier(int k, int n){
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            Multiplier(n / k, k);
        }
        else {
            Multiplier(n, ++k);
        }
    }
    public static void main(String[] args) {
        Multiplier(150, 2);
    }
}
