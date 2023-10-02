public class Main {
    public static void main(String[] args) {

        // Задание 1

        float money = 15000F;
        float resultBank = money;
        int i = 0;

        while (resultBank < 2459000) {
            i++;
            System.out.printf("В %d месяц сумма накоплений в банке равна %,.2f \n", i, resultBank);
            resultBank += money + resultBank * 0.01;

        }
        // Задание 2

        i = 1;

        while (i <= 10) {
            System.out.printf("%d ", i);
            i++;

        }
        System.out.println("");

        for (i = 10; i >= 1; i--) {
            System.out.printf("%d ", i);
        }

        // Задание 3
        System.out.println("");

        int population = 12000000;
        int birthPer1000 = 17;
        int deathPer1000 = 8;


        for (i = 1; i <= 10; i++) {
            System.out.printf("В %d году численность населения составит %d \n", i, population);
            population += population * (birthPer1000 - deathPer1000) / 1000;
        }

        // Задание 4


        // Можно узнать адрес банка с таким процентом в месяц, плз.?))):
        float percent = 0.07F;
        resultBank = money;
        i = 1;

        while (resultBank <= 12000000) {
            resultBank += resultBank * percent;
            System.out.printf("В %d месяце сумма накопления %,.2f \n", i, resultBank);
            i++;
        }

        // Задание 5

        resultBank = money;
        i = 1;

        while (resultBank <= 12000000) {
            resultBank += resultBank * percent;
            if (i % 6 == 0) {
                System.out.printf("В %d месяце сумма накопления %,.2f \n", i, resultBank);
            }
            i++;
        }

        // Задание 6
        int term = 9*12;
        resultBank = money;
        i = 1;
        while (i <= term)
        {
            resultBank += resultBank * percent;
            if (i % 6 == 0) {
                System.out.printf("В %d месяце сумма накопления %,.2f \n", i, resultBank);
            }
            i++;

        }


        // Задаине 7
        System.out.println("");
        int date = 2;

        for ( i = date; i <= 31; i += 7)
        {
                System.out.printf("Сегодня пятница  - %d число. Надо отправить отчёт.\n", i);

        }

        // Задание 8
        int period = 79;
        int lastYear = 2023;
        int previosYear = 200;
        int futureYear = 100;
        int year = 0;

        while (year <= (lastYear + futureYear))
        {
            if (year >= (lastYear - previosYear) && year <= (lastYear + futureYear))
            {
                System.out.println(year);
            }

            year += period;

        }




    }
}