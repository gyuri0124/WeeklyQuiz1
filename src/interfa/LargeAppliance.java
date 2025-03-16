package interfa;

public class LargeAppliance extends Product {
    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 0;       // 할인금액
    }
}

