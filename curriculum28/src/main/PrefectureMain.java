package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import model.Prefecture;

public class PrefectureMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 都道府県データの定義
        Prefecture[] prefectures = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        // 入力
        System.out.println("番号をカンマ区切りで入力してください（例：8,5,9）");
        String numInput = scanner.nextLine();
        System.out.println("昇順 or 降順 を入力してください");
        String order = scanner.nextLine().trim();

        // 数字を分割してリストに変換
        String[] numStrings = numInput.split(",");
        List<Prefecture> selectedList = new ArrayList<>();

        for (String numStr : numStrings) {
            int index = Integer.parseInt(numStr.trim());
            if (index >= 0 && index < prefectures.length) {
                selectedList.add(prefectures[index]);
            } else {
                System.out.println("番号 " + index + " は無効です。");
            }
        }

        // ソート（昇順 or 降順）
        if (order.equals("昇順")) {
            selectedList.sort(Comparator.comparingDouble(Prefecture::getArea));
        } else if (order.equals("降順")) {
            selectedList.sort(Comparator.comparingDouble(Prefecture::getArea).reversed());
        } else {
            System.out.println("ソート順が正しくありません（昇順 または 降順 を入力してください）");
            scanner.close();
            return;
        }

        // 結果出力
        System.out.println();
        for (Prefecture p : selectedList) {
            p.printInfo();
        }

        scanner.close();
    }
}
