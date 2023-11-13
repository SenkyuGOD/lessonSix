import java.util.Scanner;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во эл-ов в массиве: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int k = n / 3;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        int max = Math.max(arr[1], Math.max(arr[3], Math.max(k, arr[2 * k])));
        int min = Math.min(arr[0], Math.min(arr[2], Math.min(k, arr[2 * k + 1])));

        int sum = min + max;

        System.out.println("Сумма равна: " +sum);
    }
}
