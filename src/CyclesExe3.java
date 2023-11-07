import java.util.Scanner;

public class CyclesExe3 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        int lenght = in.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int width = in.nextInt();
        in.close();
        String horizontLine = " ";
        for (int i = 0; i<lenght; i++){
            horizontLine += "-";
        }
        horizontLine += " \n";
        String verticalLine = "|";
        for (int i = 0; i<lenght; i++){
            verticalLine += " ";
        }
        verticalLine += "|\n";
        System.out.println(horizontLine + verticalLine);

    }
}
