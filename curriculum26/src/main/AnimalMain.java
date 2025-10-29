package main;

import java.util.Scanner;

import model.Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");
        String input = scanner.nextLine(); 
        // 例: ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,...

        // カンマで区切って1匹ずつ処理
        String[] animalsData = input.split(",");

        for (String data : animalsData) {
            String[] parts = data.split(":");
            String name = parts[0];
            double length = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);

            Animal animal = new Animal(name, length, speed);

            // 出力
            System.out.println("\n動物名：" + animal.getName());
            System.out.println("体長：" + animal.getLength() + "m");
            System.out.println("速度：" + animal.getSpeed() + "km/h");
            System.out.println("学名：" + animal.getScientificName());
        }

        scanner.close();
    }
}
