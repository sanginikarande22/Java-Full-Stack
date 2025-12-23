package abstractclass;

class OnlineDeliveryOrder extends FoodOrder {

    OnlineDeliveryOrder(String restaurantName) {
        super(restaurantName);
    }

    @Override
    void prepareFood(String item) {
        System.out.println("Preparing " + item + " for home delivery");
    }
}
