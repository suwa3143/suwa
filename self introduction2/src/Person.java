class Person {

  // ---------- クラスフィールド（全インスタンス共通） ----------
  // 人数をカウントする変数（問題1）
  static int count = 0;

  // ---------- インスタンスフィールド（1人が持つ情報） ----------
  private String name;
  private int age;
  private double height;
  private double weight;

  // ---------- コンストラクタ ----------
  Person(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;

    // インスタンスが1つ作成されるたびにcountを増やす（問題2）
    Person.count++;
  }

  // ---------- BMI計算メソッド ----------
  public double bmi() {
    return this.weight / (this.height * this.height);
  }
  
  // ---------- 個人情報を表示 ----------
  public void print() {
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");
    System.out.printf("BMIは%.2fです\n", this.bmi());
  }

  // ---------- クラスメソッド（問題4〜5） ----------
  public static void printCount() {
    // クラスフィールドcountを使用する
    System.out.println("合計" + Person.count + "人です");
  }
}
  