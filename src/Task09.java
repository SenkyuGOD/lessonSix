import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во эл-ов в массиве: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }

        Arrays.sort(arr);


        int min = arr[0];
        int max = arr[n - 1];

        arr[0] = max;
        arr[n - 1] = min;



        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
