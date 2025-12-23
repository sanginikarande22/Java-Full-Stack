package abstractclass;

abstract class FoodOrder {

    String restaurantName;

   
    FoodOrder(String restaurantName) {
        this.restaurantName = restaurantName;
        System.out.println("Order placed at: " + restaurantName);
    }

    abstract void prepareFood(String item);

    void orderStatus() {
        System.out.println("Order is being processed");
    }
}

