public class Minitest2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Tong cac phan tu trong mang = " + totalValue(array));
        System.out.println("Phan tu lon nhat trong mang la: " + maxValue(array));
    }

    public static int totalValue(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
