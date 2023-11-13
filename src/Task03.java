import java.util.Random;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во элементов в массиве: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }

        for (int i : arr) {
            if (i < 0) {
                System.out.println("Первое число отрицательное");
                break;
            }
            if (i > 0) {
                System.out.println("Первое число положительное");
                break;
            }
        }

    }
}