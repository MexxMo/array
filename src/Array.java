public class Array {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int j : arr) {
            sum += j;

        }
        System.out.printf("Сумма трат за месяц составила %d рублей%n", sum);
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maxCosts = arr[0];
        int minCosts = arr[0];

        for (int j : arr) {
            if (j < minCosts) {
                minCosts = j;
            }
        }

        for (int j : arr) {
            if (j > maxCosts) {
                maxCosts = j;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей%n", minCosts);
        System.out.printf("Максимальная сумма трат за день составила %d рублей%n", maxCosts);

    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] arr = generateRandomArray();
        float sum = 0;

        for (int j : arr) {
            sum += j;
        }
        sum = sum / arr.length;
        System.out.println("Сумма трат за месяц составила " +sum+ " рублей");
    }

}
