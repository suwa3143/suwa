package curiculum_B;

/***************************************************************************************************
 * [概要] 九九の掛け算表を拡張for文で表示する（1〜20×1〜9）
 * [条件] 掛ける数・掛けられる数・結果をすべて3桁表示。区切りに「||」を使用。
 ***************************************************************************************************/
public class Qes_5 {

    public static void main(String[] args) {

        // タイトル出力
        System.out.println("【九九の表示（拡張for文・1〜20×1〜9）】\n");

        // 掛ける数（1～20）
        int[] nums1 = new int[20];
        for (int i = 0; i < 20; i++) {
            nums1[i] = i + 1;
        }

        // 掛けられる数（1～9）
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 外側：掛ける数
        for (int i : nums1) {

            // 内側：掛けられる数
            for (int j : nums2) {

                // それぞれの数値と結果を3桁表示に整形
                String num1 = String.format("%03d", i);
                String num2 = String.format("%03d", j);
                String result = String.format("%03d", i * j);

                // 出力（例：001×001=001）
                System.out.print(num1 + "*" + num2 + "=" + result);

                // 最後の列でなければ「||」を追加
                if (j != 9) {
                    System.out.print(" || ");
                }
            }

            // 行末で改行
            System.out.println();
        }
    }
}