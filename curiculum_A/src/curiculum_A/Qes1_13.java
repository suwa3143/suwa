package curiculum_A;

/**********************************************************************************
 * Qes1_13 課題1〜13まとめプログラム
 * 【概要】各課題ごとにメソッドを分けて処理を行う
 * 【詳細】課題1〜13の処理を別々のメソッドに分けて、mainから順に実行する
 **********************************************************************************/
public class Qes1_13 {

    public static void main(String[] args) {
        assignment1();
        assignment2();
        assignment34();
        assignment5();
        assignment6();
        assignment7();
        assignment8();
        assignment9();
        assignment10();
        assignment11();
        assignment12();
        assignment13();
    }

    /**************************************************************************
     * [概要] 課題1：データ型ごとのローカル変数宣言処理
     * [詳細]各データ型(byte,short,int,long,float,double,char,String,boolean)の
     *　　　 変数をローカルで宣言する 
     *************************************************************************/
    public static void assignment1() {
        // バイト型の変数を宣言
        byte byteVal;
        
        // 短整数型の変数を宣言
        short shortVal;
        
        // 整数型の変数を宣言
        int intVal;
        
        // 長整数型の変数を宣言
        long longVal;
        
        // 単精度浮動小数点型の変数を宣言
        float floatVal;
        
        // 倍精度浮動小数点型の変数を宣言
        double doubleVal;
        
        // 文字型の変数を宣言
        char charVal;
        
        // 文字列型の変数を宣言
        String stringVal;
        
        // ブーリアン型の変数を宣言
        boolean boolVal;
    }

    /**************************************************************************
     * [概要] 課題2：初期値代入・初期化
     * [詳細] 9個の変数に初期値を代入して初期化する
     **************************************************************************/
    public static void assignment2() {
        byte byteVal = 0;
        short shortVal = 0;
        int intVal = 0;
        long longVal = 0L;
        float floatVal = 0.0f;
        double doubleVal = 0.0d;
        char charVal = '\u0000';
        String stringVal = "null";
        boolean booleanVal = false;
    }

    /**************************************************************************
     * [概要] 課題3,4：コンソール出力
     * [詳細] 指定の計算や出力を行う
     **************************************************************************/
    public static void assignment34() {
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 9.5f;
        double d = 10.5;
        char c = 'a';
        String str = "ハロー";
        boolean bool = true;

        // 11110 (すべて足す)
        System.out.println(b + s + i + l);

        // 20 (単精度と倍精度の合計)
        System.out.println(f + d);

        // a ハロー true
        System.out.println(c + " " + str + " " + bool);

        // 11130 (数字を足す)
        System.out.println(b + s + i + l + 20);

        // 10000000000 (小数点以外の数字をかける)
        System.out.println((long)b * s * i * l);

        // 0.105 (10.5割る100)
        System.out.println(d / 100);

        // -90 (10引く100)
        System.out.println(b - s);
    }

    /**************************************************************************
     * [概要]  課題5：文字列と数値の連結修正
     * [詳細]  文字列連結を数値計算に修正する
     **************************************************************************/
    public static void assignment5() {
    	 String num = "20";
         int num1 = 23;

         // 数値計算に直すため、numを整数に変換して足す
         System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
    }

    /**************************************************************************
     * [概要]  課題6：自己紹介情報変数に格納し出力
     * [詳細]  指定のフォーマットで出力する
     **************************************************************************/
    public static void assignment6() {
    	 String name = "山田太郎";
         int age = 18;
         double height = 170.5;
         double weight = 62.2;
         String favoriteFood = "寿司";

         System.out.println("初めまして" + name + "です");
         System.out.println("年齢は" + age + "歳です");
         System.out.println("身長は" + height + "cmです");
         System.out.println("体重は" + weight + "kgです");
         System.out.println("好きな食べ物は" + favoriteFood + "です");
    }

    /**************************************************************************
     * [概要] 課題7：BMI計算と出力
     * [詳細] BMIを変数を使って計算し出力する
     **************************************************************************/
    public static void assignment7() {
         double height = 170.5;
         double weight = 62.2;

         double heightM = height / 100; // cm → m
         double bmi = weight / (heightM * heightM);

         System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
    }

    /**************************************************************************
     * [概要] 課題8：変数に再代入し自己紹介を出力
     * [詳細] 新しい値に変数を再代入して出力する
     **************************************************************************/
    public static void assignment8() {
    	String name = "鈴木一郎";
        int age = 24;
        double height = 168.5;
        double weight = 64.2;
        String favoriteFood = "オムライス";

        double heightM = height / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
    }

    /**************************************************************************
     * [概要] 課題9：数値和算の自己代入と出力
     * [詳細] 変数の数値部分を自己代入し出力
     *************************************************************************-*/
    public static void assignment9() {
    	String name = "鈴木一郎";
        int age = 24;
        double height = 168.5;
        double weight = 64.2;
        String favoriteFood = "オムライス";

        // 自己代入
        age += age;          // 24 + 24 = 48
        height += height;    // 168.5 + 168.5 = 337.0
        weight += weight;    // 64.2 + 64.2 = 128.4

        double heightM = height / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
    }

    /**************************************************************************
     * [概要] 課題10：年齢判定（if文なし）
     * [詳細] 年齢が25以上ならtrueを出力する（if文使わず）
     **************************************************************************/
    public static void assignment10() {
    	 int age = 24;
         System.out.println(age >= 25);
    }

    /**************************************************************************
     * [概要] 課題11：年齢・身長・体重を文字列に変換して連結し出力
     * [詳細] それぞれ文字列に変換しつなげて出力する
     **************************************************************************/
    public static void assignment11() {
    	 int age = 24;
         double height = 168.5;
         double weight = 64.2;

         String s = String.valueOf(age) + String.valueOf(height) + String.valueOf(weight);
         System.out.println(s);
    }

    /**************************************************************************
     * [概要] 課題12：文字列から整数型に変換して出力
     * [詳細] 文字列を整数に変換し出力する
     **************************************************************************/
    public static void assignment12() {
    	String ageStr = "24";
        String heightStr = "168";

        int ageInt = Integer.parseInt(ageStr);
        int heightInt = Integer.parseInt(heightStr);

        System.out.println(ageInt);
        System.out.println(heightInt);
    }

    /**************************************************************************
     * [概要] 課題13：条件判定の論理演算出力（if文禁止）
     * [詳細] 年齢が25以上または身長が160以上の条件判定を行い出力
     **************************************************************************/
    public static void assignment13() {
        int age = 48;
        int height = 337;

        System.out.println((age >= 25) || (height >= 160));
    }
}

