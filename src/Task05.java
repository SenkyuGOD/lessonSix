import java.util.Random;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во эл-ов в массиве: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int evenNum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i : arr) {
            if (i % 2 == 0) {
                evenNum++;
            }
        }

        if (evenNum == 0) {
            System.out.println("В данном массиве нет четных чисел");
            return;
        }

        int[] evenArr = new int[evenNum];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[j++] = arr[i];
            }
        }

        System.out.println();

        for (int i : evenArr) {
            System.out.print(i + " ");
        }
    }
}
