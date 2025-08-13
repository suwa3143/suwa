package curriculum_New_question;

import java.util.Random;

public class Q1_Q7 {

    // Q1
    public static void printHello(String text, int number) {
        System.out.println(text + " " + number);
    }

    // Q2
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    // Q3
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    // Q4（Q2のオーバーロード）
    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    // Q5
    public static int[] generateRandomNumbers(int count) {
        Random rand = new Random();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            int randomNum;
            do {
                randomNum = rand.nextInt(100) + 1; // 1〜100
            } while (randomNum == 0);
            nums[i] = randomNum;
            System.out.println(randomNum);
        }
        return nums;
    }

    // Q6
    public static double calcAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / nums.length;
        System.out.println("平均値: " + avg);
        return avg;
    }

    // Q7
    public static boolean checkAbove50(double value) {
        boolean result = value >= 50;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        // Q1
        printHello("Hello JavaSE", 11);

        // Q2
        multiply(3, 5);

        // Q3
        int[] sampleArray = {1, 2, 3, 4, 5};
        printArray(sampleArray);

        // Q4
        add(3.5, 4.2);

        // Q5
        int[] randomNums = generateRandomNumbers(5);

        // Q6
        double average = calcAverage(randomNums);

        // Q7
        checkAbove50(average);
    }
}