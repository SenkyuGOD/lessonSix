import java.util.Random;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во эл-ов в массиве: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы");
        for (int x : arr) {
            System.out.print(">");
            x = sc.nextInt();
        }
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                check = false;
                break;
            }
        }

        if (check == true) {
            System.out.println("Последовательность является возрастающей.");
        } else {
            System.out.println("Последовательность не является возрастающей.");
        }
    }
}