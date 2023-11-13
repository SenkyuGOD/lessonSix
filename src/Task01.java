import java.util.Scanner;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во элементов в массиве: ");
        int N = scanner.nextInt();

        int[] A = new int[N];

        for (int x : A) {
            x = random.nextInt(100);
            System.out.print(x + " ");
        }

        System.out.print("Введите число К: ");
        int K = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            if (i % K == 0) {
                sum += A[i];
            }
        }

        System.out.println("Сумма элементов в массиве которые кратны " + K + " = " + sum);
    }
}
