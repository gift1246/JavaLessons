import java.util.Scanner;

public class metaCyclesExe6 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Введите первое число: ");
            int value1 = in.nextInt();
            System.out.print("Введите второе число: ");
            int value2 = in.nextInt();
            System.out.println("Результат: " + value1 * value2);
            System.out.println("Для завершения введите 1: ");
            n = in.nextInt();

        }
        while (n!= 1);
        in.close();

    }
}
