public class Order {
    private int quantity;
    private double totalCost;

    public Order(int quantity, double totalCost) {
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }
}