
public class Main {

	public static void main(String[] args) {

    // 苗字＋名前の両方を受け取るコンストラクタを使用
    Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
    person1.print();

    Person person2 = new Person("山田", "花子", 22, 1.5, 40);
    person2.print();

    // 人数カウント表示（クラスメソッド呼び出し）
    Person.printCount();
  }
}
	