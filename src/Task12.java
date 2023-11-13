import java.util.Scanner;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во эл-ов в массиве: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (isTrue(i)) {
                sum += arr[i - 1];
            }
        }

        System.out.println("Сумма чисел с простым порядковым номером равна: " + sum);
    }

    private static boolean isTrue(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
