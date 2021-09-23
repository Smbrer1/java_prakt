package prakt5;

public class SimpleDigit {
    int divider = 0;
    public String simpler(int digit){
        if (divider==0) divider = digit / 2;
        if (divider>=2) {
            if (digit % divider == 0) return "NO";
            else{
                divider-=1;
                simpler(digit);
            }
        }
        return "YES";
    }
}
