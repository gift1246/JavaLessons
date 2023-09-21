import java.util.Scanner;

public class metaCyclesExe3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float sum = in.nextFloat();
        System.out.println("Введите срок вклада в месяцах: ");
        int months = in.nextInt();
        int percent = 7/100;
        for (int i = 1; i <= months; i++){
            sum += sum * 0.07;
        }
        System.out.println("После " + months + " месяцев сумма вклада составит: " + sum);
    }
}
