package combination;

class Order extends FoodItem {
    private int quantity;

   
    Order(String itemName, double price, int quantity) {
        super(itemName, price);
        this.quantity = quantity;
    }

    
    void calculateBill() {
        double total = getPrice() * quantity;

        if (total >= 500) {
            total = total - 50;
            System.out.println("Discount Applied (₹50)");
        } else {
            System.out.println("No Discount");
        }

        System.out.println("Total Bill: Rs" + total);
    }
}

