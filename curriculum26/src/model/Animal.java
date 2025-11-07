package model;

public class Animal {
    private String name;
    private double length;
    private int speed;
    private String scientificName;

    public Animal(String name, double length, int speed, String scientificName) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        this.scientificName = scientificName;
    }

    public void printInfo() {
        System.out.println("動物名：" + name);
        System.out.println("体長：" + length + "m");
        System.out.println("速度：" + speed + "km/h");
        System.out.println("学名：" + scientificName);
        System.out.println();
    }
}
