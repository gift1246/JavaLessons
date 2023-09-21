public class metaCyclesExe2 {
    public static void main(String[] args) {
        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death;
        for (int year = 1; year <= 10; year++) {
            population += population * dif / 1000;
            if (born > 8 || death > 6)
                --born;
            --death;

            System.out.println("Количество населения в " + year + " год: " + population);
        }
    }
}
