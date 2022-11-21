package objectOrientedProgramming;


class Phone {
    String model;
    String color;
    int price;

    Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Phone01 galaxy = new Phone01("Galaxy10", "Black", 100);

        Phone01 iphone =new Phone01("iPhoneX", "Black", 200);

        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
    }
}