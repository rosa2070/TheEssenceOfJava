package ch7.sec23;

public class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    Product() {
        price = 0;
        bonusPoint = 0;
    }
}
