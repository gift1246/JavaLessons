public class GeekBrainsLesson2 {
    public static void main(String[] args) {
        //checkSumSign(1,2);
        //checkSumSign(3,-4);
        System.out.println(pow3(2.0));
    }
    public static double pow3 (double number) {
        return number * number * number;
    }
    public static void checkSumSign (int a, int b) {
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
