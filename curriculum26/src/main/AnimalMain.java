package main;

import java.util.Scanner;

import model.Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");
        // 入力例：ライオン:2.1:80,ゾウ:3.2:40
        String input = scanner.nextLine();

        // 複数の動物を分割
        String[] animals = input.split(",");

        for (String data : animals) {
            String[] parts = data.split(":");

            // 3つ未満ならエラー文を出力して終了
            if (parts.length < 3) {
                System.out.println("入力データが不完全です。形式は『動物名:体長:速度』で入力してください。");
                System.out.println("例）ライオン:2.1:80,ゾウ:3.2:40");
                return; // プログラム終了
            }

            String name = parts[0];
            double length = 0;
            int speed = 0;

            try {
                length = Double.parseDouble(parts[1]);
                speed = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("数値の形式が不完全です：" + data);
                continue;
            }

            String scientificName;

            // switch文の表記を「:」に統一
            switch (name) {
                case "ライオン":
                    scientificName = "パンテラ・レオ";
                    break;
                case "ゾウ":
                    scientificName = "ロキソドンタ・サイクロティス";
                    break;
                case "パンダ":
                    scientificName = "アイルロポダ・メラノレウカ";
                    break;
                case "チンパンジー":
                    scientificName = "パン・トゥログロディテス";
                    break;
                case "シマウマ":
                    scientificName = "チャップマンシマウマ";
                    break;
                default:
                    scientificName = "不明";
            }

            Animal animal = new Animal(name, length, speed, scientificName);
            animal.printInfo();
        }

        scanner.close();
    }
}
