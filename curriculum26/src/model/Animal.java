package model;

// 動物の情報を保持するクラス
public class Animal {
    private String name;     // 動物名
    private double length;   // 体長（m）
    private int speed;       // 速度（km/h）
    private String scientificName; // 学名

    // コンストラクタ
    public Animal(String name, double length, int speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        this.scientificName = getScientificNameByName(name);
    }

    // 学名を動物名に応じて返すメソッド
    private String getScientificNameByName(String name) {
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            default:
                return "不明";
        }
    }

    // getter
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }

    public String getScientificName() {
        return scientificName;
    }
}
