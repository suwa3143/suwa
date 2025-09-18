package basicClass;

public class Dog {
    String name;   // 動物の名前
    int number;    // 動物の数

    // 引数なし
    public Dog() {
        this.name = "犬";
    }

    // 引数あり
    public Dog(int number) {
        this.name = "犬";
        this.number = number;
    }
}
