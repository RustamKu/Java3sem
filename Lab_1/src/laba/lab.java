package laba;
import java.util.Scanner;
public class lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mas = new int[10], mas2 = {1, 2, 3, 4, 5}, mas3 = {6, 7, 8, 9, 10}; //
        int n = 0, m = 0, k = 0, p = 0, t = 0;
        System.out.println("Введите 10 чисел массива ");
        for (int i = 0; i < 10; i++) {
            mas[i] = input.nextInt(); //
            n += mas[i];
        }
        while (m < mas2.length) { //
            k += mas2[m];
            m++;
        }
        do {
            p += mas3[t];
            t++;
        } while (t < mas3.length);
        System.out.println("Сумма элементов первого массива " + n);
        System.out.println("Сумма элементов второго массива " + k);
        System.out.println("Сумма элементов третьего массива " + p);

    }
}



