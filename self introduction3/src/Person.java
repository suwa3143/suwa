
public class Person {

	// --------- クラスフィールド（全インスタンス共通） ---------
  private static int count = 0;

  // --------- インスタンスフィールド（個々の人が持つ値） ---------
  private String firstName;   // 苗字
  private String lastName;    // ←【問題1】追加
  private int age;
  private double height;
  private double weight;

  // --------- コンストラクタ①（従来のもの）---------
  // ※ firstName しか無い旧バージョン（オーバーロード用に残す）
  Person(String firstName, int age, double height, double weight) {
    this.firstName = firstName;
    this.age = age;
    this.height = height;
    this.weight = weight;

    // 人数カウント
    Person.count++;
  }
  
   // --------- コンストラクタ②（オーバーロード）---------
  // 【問題2】苗字（lastName）も受け取るバージョン
  Person(String firstName, String lastName, int age, double height, double weight) {

    // 苗字 → firstName  
    this.firstName = firstName;

    // 名前 → lastName（問題3）
    this.lastName = lastName;

    this.age = age;
    this.height = height;
    this.weight = weight;

    // 人数カウント（問題3）
    Person.count++;
  }

  // --------- 氏名を結合するメソッド ---------
  public String fullName() {
    return this.firstName + this.lastName;
  }

  // --------- 表示メソッド ---------
  public void print() {
    System.out.println("名前は" + this.fullName() + "です");
    System.out.println("年は" + this.age + "です");
    System.out.printf("BMIは%.2fです\n", this.bmi());
  }
  
  // --------- BMI計算 ---------
  public double bmi() {
    return this.weight / (this.height * this.height);
  }

  // --------- クラスメソッド（合計人数の表示） ---------
  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}