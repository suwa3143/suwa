package curiculum_B;

import java.util.Random;
import java.util.Scanner;

/**********************************************************************************
 * [概要] ユーザー名チェックおよびじゃんけん処理
 * [詳細] ユーザー名を入力・チェック後、じゃんけんを行い勝つまでループする。
 **********************************************************************************/
public class Qes1_3 {

    // メインメソッド（プログラムの開始地点）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザー名の入力を促す
        System.out.println("ユーザー名を入力してください：");
        String username = scanner.nextLine();

        // 入力チェック（nullまたは空文字）
        if (username == null || username.length() == 0) {
            System.out.println("名前を入力してください");
            return;
        }

        // 入力チェック（10文字より多い）
        if (username.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
            return;
        }

        // 半角英数字かどうかのチェック
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("半角英数字のみで名前を入力してください");
            return;
        }

        // 正常なユーザー名の場合
        System.out.println("ユーザー名「" + username + "」を登録しました");

        // じゃんけん開始
        playJanken(scanner, username);

        scanner.close();
    }

    /**********************************************************************************
     * [概要] じゃんけんゲーム処理
     * [詳細] ユーザーが勝つまでじゃんけんを繰り返す処理を行う
     **********************************************************************************/
    public static void playJanken(Scanner scanner, String username) {
        Random random = new Random();
        int attempts = 0; // 試行回数

        while (true) {
            // 入力案内
            System.out.println("\nじゃんけんをしましょう！ 0:グー, 1:チョキ, 2:パー を入力してください：");

            int userHand;
            try {
                userHand = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("無効な入力です。数字で入力してください。");
                continue;
            }

            // 入力チェック
            if (userHand < 0 || userHand > 2) {
                System.out.println("0〜2の数字を入力してください。");
                continue;
            }

            int enemyHand = random.nextInt(3);
            attempts++; // 試行回数をカウント

            String[] hands = {"グー", "チョキ", "パー"};

            // 自分と相手の手を出力
            System.out.println(username + "の手は「" + hands[userHand] + "」");
            System.out.println("相手の手は「" + hands[enemyHand] + "」");

            // 勝敗判定
            if (userHand == enemyHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
            } else if ((userHand == 0 && enemyHand == 1) || 
                       (userHand == 1 && enemyHand == 2) || 
                       (userHand == 2 && enemyHand == 0)) {
                // ユーザーが勝った場合
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                break;
            } else {
                // ユーザーが負けた場合
                System.out.println("俺の勝ち！");
                switch (enemyHand) {
                    case 0: // 相手がグー
                        System.out.println("負けは次につながるチャンスです！");
                        System.out.println("ネバーギブアップ！");
                        break;
                    case 1: // 相手がチョキ
                        System.out.println("たかがじゃんけん、そう思ってないですか？");
                        System.out.println("それやったら次も、俺が勝ちますよ");
                        break;
                    case 2: // 相手がパー
                        System.out.println("なんで負けたか、明日まで考えといてください。");
                        System.out.println("そしたら何かが見えてくるはずです");
                        break;
                }
            }
        }

        // 勝利までの試行回数を出力
        System.out.println("勝つまでにかかった合計回数は" + attempts + "回です");
    }
}