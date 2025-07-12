package curiculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        // Scannerで入力受付
        Scanner scanner = new Scanner(System.in);
        System.out.print("商品を「、」区切りで入力してください：");
        String input = scanner.nextLine();

        // 入力された商品名を「、」で分割
        String[] products = input.split("、");

        // ランダムインスタンス
        Random rand = new Random();

        // 拡張for文で商品ごとに処理
        for (String product : products) {
            int stock = rand.nextInt(12); // 0〜11のランダムな残り台数

            // Switch文で商品名に応じた処理
            switch (product) {
                case "テレビ":
                case "ディスプレイ":
                    // 条件演算子を使って表示名を変える（Switch内）
                    String displayName = product.equals("ディスプレイ") ? "ディスプレイ" : "テレビ";
                    System.out.println(displayName + "の残り台数は" + stock + "台です");
                    break;
                case "パソコン":
                    System.out.println("パソコンの残り台数は" + stock + "台です");
                    break;
                case "冷蔵庫":
                    System.out.println("冷蔵庫の残り台数は" + stock + "台です");
                    break;
                case "扇風機":
                    System.out.println("扇風機の残り台数は" + stock + "台です");
                    break;
                case "洗濯機":
                    System.out.println("洗濯機の残り台数は" + stock + "台です");
                    break;
                case "加湿器":
                    System.out.println("加湿器の残り台数は" + stock + "台です");
                    break;
                default:
                    // 指定外の商品名の対応
                    System.out.println("『 " + product + " 』は指定の商品ではありません");
                    break;
            }
        }

        scanner.close();
    }
}