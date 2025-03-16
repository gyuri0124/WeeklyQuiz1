package interfa;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;

        for (int i = 0; i < products.length; i++) {
            totalWeight += products[i].weight;
            totalPrice += products[i].getDiscountedPrice();
        }

        int deliveryCharge;

        if (totalWeight < 3) {
            deliveryCharge = 1000;
        } else if (totalWeight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        if (totalPrice >= 100000) {
            deliveryCharge = 0;
        } else if (totalPrice >= 30000) {
            deliveryCharge -= 1000;
        }

        return deliveryCharge;
    }
}