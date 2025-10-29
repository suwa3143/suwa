package model;

// 都道府県データを保持するクラス
public class Prefecture {
    private String name;         // 都道府県名
    private String capital;      // 県庁所在地
    private double area;         // 面積 (km2)

    // コンストラクタ
    public Prefecture(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    // 出力用メソッド
    public void printInfo() {
        System.out.println("都道府県名：" + name);
        System.out.println("県庁所在地：" + capital);
        System.out.println("面積：" + area + "km2");
        System.out.println();
    }
}

