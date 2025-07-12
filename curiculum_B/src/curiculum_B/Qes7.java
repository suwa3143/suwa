package curiculum_B;
import java.util.Scanner;

public class Qes7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students;

        // 生徒人数が2以上になるまで繰り返し入力
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            students = scanner.nextInt();
        } while (students < 2);

        int[] totalSubjects = new int[4]; // 英語・数学・理科・社会
        double[] studentAverages = new double[students]; // 各生徒の平均点保存

        for (int i = 0; i < students; i++) {
            int[] scores = new int[4]; // 各教科の点数

            System.out.print((i + 1) + "人目の『英語』の点数を入力してください :");
            scores[0] = scanner.nextInt();

            System.out.print((i + 1) + "人目の『数学』の点数を入力してください :");
            scores[1] = scanner.nextInt();

            System.out.print((i + 1) + "人目の『理科』の点数を入力してください :");
            scores[2] = scanner.nextInt();

            System.out.print((i + 1) + "人目の『社会』の点数を入力してください :");
            scores[3] = scanner.nextInt();

            double avg = (scores[0] + scores[1] + scores[2] + scores[3]) / 4.0;
            studentAverages[i] = avg;

            for (int j = 0; j < 4; j++) {
                totalSubjects[j] += scores[j];
            }
        }

        // 平均点出力：生徒ごと（まとめて表示）
        for (int i = 0; i < students; i++) {
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverages[i]);
        }
        System.out.println(); // 改行

        // 教科ごとの平均点
        String[] subjectNames = {"英語", "数学", "理科", "社会"};
        for (int i = 0; i < 4; i++) {
            double subjectAvg = totalSubjects[i] / (double) students;
            System.out.printf("%sの平均点は%.2f点です。\n", subjectNames[i], subjectAvg);
        }

        // 全体の平均点
        double totalAvg = 0;
        for (double avg : studentAverages) {
            totalAvg += avg;
        }
        double overallAvg = totalAvg / students;
        System.out.printf("全体の平均点は%.2f点です。\n", overallAvg);

        scanner.close();
    }
}
