package mainPackage;

import java.util.Scanner;

import stausPackage.Hero;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 名前を入力
        System.out.print("名前を入力してください：");
        String name = scanner.nextLine();

        // Heroクラス（サブクラス）をインスタンス化
        Hero hero = new Hero(name);

        // 結果を出力
        System.out.println();
        System.out.println("こんにちは 「" + hero.getName() + "」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hero.getHp());
        System.out.println("MP：" + hero.getMp());
        System.out.println("攻撃力：" + hero.getAttack());
        System.out.println("素早さ：" + hero.getSpeed());
        System.out.println("防御力：" + hero.getDefense());
        System.out.println();
        System.out.println("さあ冒険に出かけよう！");

        scanner.close();
    }
}
