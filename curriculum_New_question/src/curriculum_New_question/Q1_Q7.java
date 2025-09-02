package curriculum_New_question;

import java.util.Random;

public class Q1_Q7 {

    // ==============================
    // Q1：文字列と整数を受け取って出力するメソッド
    // ==============================
    public static void printHello(String text, int number) {
        System.out.println(text + " " + number);
    }

    // ==============================
    // Q2：整数2つを掛け算して出力するメソッド
    // ==============================
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    // ==============================
    // Q3：整数の配列を受け取り、順番に出力するメソッド
    // ==============================
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    // ==============================
    // Q4：小数2つを受け取り、足し算して出力するメソッド
    //      （Q2と同じ名前 multiply を使ってオーバーロード）
    // ==============================
    public static void multiply(double a, double b) {
        System.out.println(a + b);
    }

    // ==============================
    // Q5：1～100までのランダムな数字を「引数の回数分」生成
    //      配列に格納 → 出力 → 最後に配列を返す
    // ==============================
    public static int[] generateRandomNumbers(int count) {
        Random rand = new Random();
        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            int randomNum;
            do {
                randomNum = rand.nextInt(100) + 1; // 1〜100の乱数
            } while (randomNum == 0);

            nums[i] = randomNum;
            System.out.println(randomNum);
        }
        return nums;
    }

    // ==============================
    // Q6：整数の配列を受け取り、平均値を計算して出力
    // ==============================
    public static double calcAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / nums.length;
        System.out.println("平均値: " + avg);
        return avg;
    }

    // ==============================
    // Q7：平均値を受け取り、50以上ならtrue、それ以外はfalseを返す
    // ==============================
    public static boolean checkAbove50(double value) {
        boolean result = value >= 50;
        System.out.println(result);
        return result;
    }

    // ==============================
    // mainメソッド：メソッドの呼び出しテスト
    // ==============================
    public static void main(String[] args) {
        // Q1の実行
        printHello("Hello JavaSE", 11);

        // Q2の実行（整数：掛け算）
        multiply(3, 5);    // → 15

        // Q3の実行
        int[] sampleArray = {1, 2, 3, 4, 5};
        printArray(sampleArray);

        // Q4の実行（小数：足し算）※オーバーロード
        multiply(3.5, 4.2); // → 7.7

        // Q5の実行（乱数を5回生成）
        int[] randomNums = generateRandomNumbers(5);

        // Q6の実行（乱数の平均値を計算）
        double average = calcAverage(randomNums);

        // Q7の実行（平均値が50以上か判定）
        checkAbove50(average);
    }
}