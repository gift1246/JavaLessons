import java.util.Scanner;

public class CyclesExe2 {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = in.nextInt();
        int sum = 0;
        while (value != 0){
             sum += (value % 10);
            value/=10;
        }
        System.out.println("Результат: " + sum);


    }

}
