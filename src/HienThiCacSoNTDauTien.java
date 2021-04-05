import java.util.Scanner;

public class HienThiCacSoNTDauTien {
    private static Scanner scanner = new Scanner(System.in);
//    Bài Tập: Hiển thị các số nguyên tố đầu tiên
//    public static void main(String[] args) {
//        System.out.print("Enter number n: ");
//        int n = scanner.nextInt();
//        int count = 0;
//        for (int i = 2; true; i++) {
//            if (isPrimeNumber(i)) {
//                count++;
//                System.out.println(i);
//            }
//            if (count == n) {
//                break;
//            }
//        }
//    }
//
//    public static boolean isPrimeNumber(int n) {
//        if (n < 2) {
//            return false;
//        }
//        //int squareRoot= (int) Math.sqrt(n);
//        //for(int i=2;i<=squareRoot;i++){
//        for (int i = 2; i < n; i++)
//            if (n % i == 0) {
//                return false;
//            }
//        return true;
//    }

//    Bài Tập: Hiển thị các số nguyên tố nhỏ hơn 100

    public static void main(String[] args) {

        int n = 100;
        for (int i = 2; i<100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
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



