package abstractclass;

class DineInOrder extends FoodOrder {

    DineInOrder(String restaurantName) {
        super(restaurantName);
    }

    @Override
    void prepareFood(String item) {
        System.out.println("Preparing " + item + " for dine-in");
    }
}

