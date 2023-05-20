import java.util.Scanner;

public class JavaRushPractice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();
            System.out.print(console[i]);
        }
    }
}
