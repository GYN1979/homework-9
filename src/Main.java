public class Main {
    public static void main(String[] args) {

        // Task1
        System.out.println("Task1");
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        double[] numbers = {1.57, 7.654, 9.986};
        for (int a = 0; a < numbers.length; a++) {
            System.out.println(numbers[a]);
        }
        System.out.println();
        double[] numbers1 = {3, 4, 3.57};
        for (int a = 0; a < numbers1.length; a++) {
            System.out.println(numbers1[a]);
        }
        // Task2
        System.out.println("Task2");
        int[] arr2 = new int[]{1, 2, 3};
        for (int i = 0; i < arr2.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(arr2[i]);
        }
        System.out.println();
        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int a = 0; a < numbers2.length; a++) {
            if (a > 0) {
                System.out.print(",");
            }
            System.out.print(numbers2[a]);
        }
        System.out.println();
        double[] numbers3 = {3, 4, 3.57};
        for (int a = 0; a < numbers3.length; a++) {
            if (a > 0) {
                System.out.print(",");
            }
            System.out.print(numbers3[a]);
        }
        System.out.println();
        // Task3
        System.out.println("Task3");
        int[] arr3 = new int[]{1, 2, 3};
        for (int c = arr3.length - 1; c >= 0; c--) {
            if (c < arr3.length - 1) {
                System.out.print(",");
            }
            System.out.print(arr3[c]);
        }
        System.out.println();
        double[] numbers4 = {1.57, 7.654, 9.986};
        for (int d = numbers4.length - 1; d >= 0; d--) {
            if (d < numbers4.length - 1) {
                System.out.print(",");
            }
            System.out.print(numbers4[d]);
        }
        System.out.println();
        double[] numbers5 = {3, 4, 3.57};
        for (int f = numbers5.length - 1; f >= 0; f--) {
            if (f < numbers5.length - 1) {
                System.out.print(",");
            }
            System.out.print(numbers5[f]);
        }
        System.out.println();
        // Task4
        System.out.println("Task4");
        int[] arr4 = {1, 2, 3};
        for (int h = 0; h < arr4.length; h++) {
            if (arr4[h] % 2 != 0) {
                arr4[h] += 1;
            }
            System.out.print(arr4[h]);
        }
    }
}

