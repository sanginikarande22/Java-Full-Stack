package abstractclass;

public class FoodApp {

    public static void main(String[] args) {

        FoodOrder order; 

        order = new DineInOrder("Tandoori Palace");
        order.prepareFood("Paneer Butter Masala");
        order.orderStatus();

        System.out.println();

        order = new OnlineDeliveryOrder("Pizza Hub");
        order.prepareFood("Cheese Burst Pizza");
        order.orderStatus();
    }
}

