import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во эл-ов в массиве: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }

        System.out.print("Введите число z: ");
        int z = scanner.nextInt();

        int changes = 0;

        for (int i = 0; i < arr.length; i++) {
            if (z > arr[i]) {
                arr[i] = z;
                changes++;
            }
        }
        System.out.println("Количество замено равно " + changes);
    }
}
