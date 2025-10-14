package curriculum23;

public class Animal {
    // フィールド（動物名・体長・速度）
    private String name;
    private double length;
    private int speed;

    // setter（フィールドに値を代入するメソッド）
    public void setName(String name) {
        this.name = name;  // thisで自分自身のフィールドを指定
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // getter（フィールドの値を取得するメソッド）
    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.length;
    }

    public int getSpeed() {
        return this.speed;
    }

    // mainメソッド
    public static void main(String[] args) {
        // Animalクラスをインスタンス化
        Animal lion = new Animal();

        // setterを使って値を代入
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        // getterを使って値を出力
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
