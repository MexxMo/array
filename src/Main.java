public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int [] array1 = new int[]{1,2,3};
        double[] array2 = new double[]{1.57, 7.654, 9.986};
        int [] array3 = {123,123,213123,123};

        System.out.println("Задание 2");


        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }



    }
}