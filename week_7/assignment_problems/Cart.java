package week_7.assignment_problems;

public class Cart {
    private final String cartId;
    private final int[] prices;
    private int itemCount;

    public Cart(String cartId, int capacity) {
        if (cartId == null || cartId.isBlank()) {
            throw new IllegalArgumentException("Cart ID cannot be blank.");
        }
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative.");
        }

        this.cartId = cartId;
        this.prices = new int[capacity];
    }

    public void addItem(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (itemCount == prices.length) {
            throw new IllegalStateException("Cart is full.");
        }

        prices[itemCount] = price;
        itemCount++;
    }

    public int getTotal() {
        int total = 0;

        for (int i = 0; i < itemCount; i++) {
            total = Math.addExact(total, prices[i]);
        }

        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getCartId() {
        return cartId;
    }
}