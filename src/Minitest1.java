import java.util.Scanner;

public class Minitest1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n:");
        int n = input.nextInt();
        System.out.println("Cac so nguyen to nho hon n:");
        for (int i = 0; i < n; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkPrime(int number) {
        if (number < 2)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }
}
