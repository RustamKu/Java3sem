package laba;

public class lab1_4 {
    public static void main(String[] args) {
        int  a[] = new int[(int) (Math.random() + 10 )]; // Массив рандомного размера
        int n = 0, m = 1, count, t;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100); //  Инициализируем массив рандомными числами
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for(int j = 1; j < a.length; j++) {
            count = a[j];
            while (a[j] < a[j-1] && j > 0) { // {2 2 1} {2 1 2}
                a[j] = a[j-1]; //{2 2 2}  {2 2 2}
                a[j-1] = count; // {2 1 2} {1 2 2}
                if (j  > 1 ) j--;;// j = 1;
            }
        }
        for(int h = 0; h < a.length; h++) {
            System.out.print(a[h] + " ");
        }
    }
}