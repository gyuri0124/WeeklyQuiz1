package interfa;
public class Product implements Promotion {
    String name;
    int price;
    int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;       // 자식 클래스에 할인 금액을 이미 리턴해줬기 때문에 0으로 리턴
    }

    @Override
    public int getDiscountedPrice() {
        return price - getDiscountAmount();
    }
}