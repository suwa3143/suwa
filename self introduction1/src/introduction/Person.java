package introduction;

class Person {

  // フィールド（インスタンスが持つデータ）
  String name;    // 名前
  int age;        // 年齢
  double height;  // 身長（m）
  double weight;  // 体重（kg）

  // 全インスタンス共通で人数をカウントするためのフィールド（static）
  static int count = 0;

  // コンストラクタ
  // インスタンス生成時にフィールドへ値をセットする
  Person(String name, int age, double height, double weight) {

    // thisは「自分自身のインスタンス」を指すキーワード
    this.name = name;         // 渡された名前をセット
    this.age = age;           // 渡された年齢をセット
    this.height = height;     // 渡された身長をセット
    this.weight = weight;     // 渡された体重をセット

    // インスタンスが作られたら人数を1増やす
    count++;
  }

  // BMIを計算して返すメソッド
  // 戻り値：double（BMIの数値）
  double bmi() {
	  
	    // BMI = 体重(kg) / (身長(m) × 身長(m))
    return this.weight / (this.height * this.height);
  }

  // Person の情報をまとめて出力するメソッド
  void print() {

    // thisを使ってフィールドの値を参照する
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");

    // BMIは小数点2桁表示（printfを使用）
    System.out.printf("BMIは%.2fです\n", this.bmi());

    // 作成されたPersonの人数を表示
    System.out.println("合計" + count + "人です");
  }
}
	  
  