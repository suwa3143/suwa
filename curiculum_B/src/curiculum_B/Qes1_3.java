package curiculum_B;

import java.util.Scanner;

/**********************************************************************************
 * [概要] ユーザー名の入力チェック処理
 * [詳細] ユーザー名を入力し、文字数・半角英数字のバリデーションを行い、正しければ登録完了メッセージを出力する。
 **********************************************************************************/
public class Qes1_3 {
    public static void main(String[] args) {
        // ユーザーからの入力を受け取るScannerオブジェクトを作成
        Scanner scanner = new Scanner(System.in);

        // ユーザー名の入力を求めるメッセージを出力
        System.out.println("ユーザー名を入力してください：");

        // 入力されたユーザー名を取得
        String name = scanner.nextLine();

        // 入力されたユーザー名が null または空文字かチェック
        if (name == null || name.isEmpty()) {
            // ユーザー名が未入力の場合のエラーメッセージを出力
            System.out.println("名前を入力してください");
        }
        // 入力されたユーザー名の文字数が10文字を超えるかチェック
        else if (name.length() > 10) {
            // 文字数が多すぎる場合のエラーメッセージを出力
            System.out.println("名前を10文字以内にしてください");
        }
        // 入力されたユーザー名が半角英数字のみで構成されているかチェック
        else if (!name.matches("^[a-zA-Z0-9]+$")) {
            // 半角英数字以外が含まれている場合のエラーメッセージを出力
            System.out.println("半角英数字のみで名前を入力してください");
        } else {
            // 条件をすべて満たすユーザー名が入力された場合、登録完了のメッセージを出力
            System.out.println("ユーザー名「" + name + "」を登録しました。s");
        }

        // Scannerオブジェクトをクローズ
        scanner.close();
    }
}