package laba;
import java.util.Scanner;
public class lab1_5 {
    public static void main(String[] args) {
        int count = 0, a = 1;
        System.out.print("Enter num: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        for (int i = 0; i < number; i++) {
            count++;
            a *= count;
        }
        System.out.println("Factorial = " + a);
    }
}
