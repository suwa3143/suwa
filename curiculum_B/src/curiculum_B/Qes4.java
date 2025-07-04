package curiculum_B;

/******************************************************************************************
 * [概要] 九九の掛け算表を出力する処理（すべての数値を2桁表示、区切りに||を使用）
 * [詳細] 掛ける数・掛けられる数・答えをすべて2桁で表示。区切り文字に「||」を使用。
 ******************************************************************************************/
public class Qes4 {

    public static void main(String[] args) {

        // タイトルの出力
        System.out.println("【九九の表示】\n");

        // 外側のfor文：掛ける数（段）1～9
        for (int i = 1; i <= 9; i++) {

            // 内側のfor文：掛けられる数 1～9
            for (int j = 1; j <= 9; j++) {

                // 掛ける数と掛けられる数、結果をそれぞれ2桁で表示（1桁の場合は先頭に0をつける）
                String num1 = (i < 10) ? "0" + i : String.valueOf(i);
                String num2 = (j < 10) ? "0" + j : String.valueOf(j);
                int result = i * j;
                String formattedResult = (result < 10) ? "0" + result : String.valueOf(result);

                // 例：01×01=01 || 01×02=02 ...
                System.out.print(num1 + "*" + num2 + "=" + formattedResult);

                // 各行の最後以外は || を表示
                if (j != 9) {
                    System.out.print(" || ");
                }
            }

            // 1行終わったら改行
            System.out.println();
        }
    }
}