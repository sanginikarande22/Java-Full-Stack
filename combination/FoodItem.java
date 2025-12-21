package combination;

public class FoodItem {
	private String itemName;
	private double price;
	
	FoodItem(String itemName,double price){
		 this.itemName = itemName;
	        this.price = price;
	    }
	public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
    void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
    }
}


