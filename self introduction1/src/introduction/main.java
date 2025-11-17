package introduction;

class Main {
  public static void main(String[] args) {

    // Personクラスのインスタンスを1人作成する
    // 引数：名前, 年齢, 身長, 体重
    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

    // Personクラスのprintメソッドを実行して、情報をまとめて表示する
    person1.print();
  }
}