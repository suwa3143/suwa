package japan.logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JapanInfo {
    // フィールド
    private String greeting;
    private String sushiComment;
    private String sushiType;

    // コンストラクタ
    public JapanInfo() {
        this.greeting = "こんにちは！ここは日本です！";
        this.sushiComment = "この寿司はうまい";
        this.sushiType = "寿司は和食です";
    }

    // メッセージ出力メソッド
    public void printMessages() {
        System.out.println(this.greeting);
        System.out.println(this.sushiComment);
        System.out.println(this.sushiType);

        // 現在日時の取得
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println("今の現在日時は" + formattedDateTime + "です");
    }
}
