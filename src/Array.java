public class Array {


    public static void main(String[] args) {
        task1();
        task2();
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
        int[] arr = generateRandomArray();

        System.out.println("Задание 1");

        int sum = 0;

        for (int j : arr) {
            sum += j;

        }
        System.out.printf("Сумма трат за месяц составила %d рублей",sum);
    }
        public static void task2(){

        int[] arr = generateRandomArray();




        }

}
