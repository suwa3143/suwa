package basic;

public class Person {

    private static int count = 0;

    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    // コンストラクタ
    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

    // フルネームを返す
    public String fullName() {
        return this.firstName + this.lastName;
    }

    // buyメソッド（Car）
    public void buy(Car car) {
        car.setOwner(this.fullName());
        System.out.println(car.getOwner() + "が購入しました");
    }

    // buyメソッド（Bicycle）
    public void buy(Bicycle bicycle) {
        bicycle.setOwner(this.fullName());
        System.out.println(bicycle.getOwner() + "が購入しました");
    }
}

