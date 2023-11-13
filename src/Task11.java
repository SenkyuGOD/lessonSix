import java.util.Scanner;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во эл-ов в массиве: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Введите число М: ");
        int m = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Числа у которых отсаток от деления на " + m + " равен " + (m-1) + ":");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % m == m-1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
