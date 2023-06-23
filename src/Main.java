public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("задача 1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int monthPay : arr) {
            total += monthPay;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    private static void task2() {
        System.out.println("задача 2");
        int[] arr = generateRandomArray();
        int maxPay = arr[0];
        int minPay = arr[0];
        for (int monthPay : arr) {
            if (monthPay > maxPay) {
                maxPay = monthPay;}
            if (monthPay<minPay) {
                minPay = monthPay;}
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей. Максимальная сумма трат за день составила " + maxPay + " рублей");
    }
    private static void task3() {
        System.out.println("задача 3");
        int[] arr = generateRandomArray();
        int totalPay = 0;
        for (int monthPay : arr) {
            totalPay += monthPay;
        }
        double averageTotal = (double) totalPay / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageTotal);
        System.out.println();
    }

    private static void task4() {
        System.out.println("задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}