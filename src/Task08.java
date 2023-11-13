import java.util.Random;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во эл-ов в массиве: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble();
        }

        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0;

        for (double i : arr) {
            if (i > 0) {
                positiveNum++;
            }
            if (i < 0) {
                negativeNum++;
            }
            if (i == 0) {
                zeroNum++;
            }
        }

        System.out.println("В данном массиве: ");
        System.out.println(positiveNum + " положительных чисел");
        System.out.println(negativeNum + " отрицательных чисел");
        System.out.println(zeroNum + " чисел которые равны 0");
    }
}
