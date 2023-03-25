import java.util.Scanner;

public class Minitest3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang:");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + i + " cua mang:");
            array[i] = input.nextInt();
        }
        for (int i : array){
            System.out.println(i);
        }
    }
}
