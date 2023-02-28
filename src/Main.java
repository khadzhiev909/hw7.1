public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }


    public static void task1 () {
        System.out.println("Первая задача");

        double salary = 15_000;


        double month = 0;
        int i = 0;

        while (month < 2_459_000) {
            month = month + salary;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + month + " рублей");
        }

    }


    private static void task2 () {
        System.out.println("Задача вторая");
        int n = 1;


        while (n <= 10) {
            System.out.print(n++ + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }


    private static void task3 () {
        System.out.println("Задача третья");

        int people = 12_000_000;

        int doGuruganlIk = 17;

        int olulmlulk = 8;

        for(int i = 0; i <= 10; i++) {
           people = people + people / 1000 * doGuruganlIk - people / 1000 * olulmlulk;
            System.out.println("Год " + i + " численность населения составляет " + people);
        }

    }


        private static void task4 () {
        double pr = 0.7;
        double salary = 15_000;

        double n = salary * pr;
        int month = 0;

        while (salary < 12_000_000) {
            salary = salary + n;
            month++;
            System.out.println("Месяц " + month + ", суммы вклада равна: " + salary);
        }


    }
    private static void task5() {
        double pr = 0.7;
        double salary = 15_000;

        double n = salary * pr;
        int month = 0;

        while (salary < 12_000_000) {
            salary = salary + n;
            month++;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + ", суммы вклада равна: " + salary);

            }
        }
    }
    private static void task6() {
        int durationInMonths = 9;
        double salary = 15_000;

        double percent = 0.7;

        for (int i = 0; i <= durationInMonths; i++) {
            salary = salary * percent;
            durationInMonths += 12;
            if (durationInMonths % 6 == 0) {

                System.out.println("Месяц " + durationInMonths + " сумма будет равна: " + salary);
            }
        }
    }

    private static void task7() {

    }
    private static void task8() {

    }

}
