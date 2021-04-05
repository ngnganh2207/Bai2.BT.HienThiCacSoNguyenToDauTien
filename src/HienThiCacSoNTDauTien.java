import java.util.Scanner;

public class HienThiCacSoNTDauTien {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number n: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 2; true; i++) {
            if (isPrimeNumber(i)) {
                count++;
                System.out.println(i);
            }
            if (count == n) {
                break;
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        //int squareRoot= (int) Math.sqrt(n);
        //for(int i=2;i<=squareRoot;i++){
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }

}



