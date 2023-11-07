import java.util.Scanner;

public class CyclesExe1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите целое число: ");
        int number = in.nextInt();
        int factorial = number;

        for(int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Результат: " + factorial);
    }
}
