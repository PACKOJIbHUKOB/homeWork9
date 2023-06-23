import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();}
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
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");


    }
    private static void task2() {
        System.out.println("задача 2");
        int[ ] arr = generateRandomArray();
        int maxPay = -1;
        for (int j : arr) {
            int current = j;
            if (current > maxPay) {
                maxPay = current;
            }
        }
        int minPay= Arrays.stream(arr).filter(i -> i <= 200_001).min().orElse(200_001);
        System.out.println("Минимальная сумма трат за день составила "+minPay+" рублей. Максимальная сумма трат за день составила "+maxPay+" рублей");
    }
    private static void task3() {
        System.out.println("задача 3");

    }
    private static void task4() {
        System.out.println("задача 4");}

    private static void task5() {
        System.out.println("задача 5");}

    private static void task6() {
        System.out.println("задача 6");}

    private static void task7() {
        System.out.println("задача 7");}

    private static void task8() {
        System.out.println("задача 8");}
}