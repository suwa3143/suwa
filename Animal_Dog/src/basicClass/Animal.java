package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
    public static void main(String[] args) {
        Dog d1 = new Dog();          // 名前だけ
        System.out.println("動物の名前: " + d1.name);

        Dog d2 = new Dog(3);         // 数を指定
        System.out.println("動物の数: " + d2.number);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        System.out.println("現在の日時: " + now.format(fmt));
    }
}
