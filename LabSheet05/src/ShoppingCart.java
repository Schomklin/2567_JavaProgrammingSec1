
public class ShoppingCart {

	public static void main(String[] args) {
		// ทดสอบระบบ Shopping Cart
		displayItemsAndTotal("Apple",10.5, "Banana",5.75, "Orange",7.3);	
		displayItemsAndTotal("Milk",20.0, "Bread",15.0);
		displayItemsAndTotal();
	}//end of main() Method
	
	//เมธอดในการรับสินค้าในตะกร้าและคำนวณราคาสินค้า
	public static void displayItemsAndTotal(Object... items) {
		if(items.length == 0) {
			System.out.println("No items in the cart.");
			return;			
		}
		double totalPrice = 0.0;
		System.out.println("Items in the cart:");
		for(int i=0;i<items.length;i+=2) {
			String itemName = (String)items[i];
			double itemPrice = (double)items[i+1];
			totalPrice += itemPrice;			
			System.out.printf("- %s: $%.2f%n", itemName, itemPrice);
			
		}//end for
		System.out.printf("Total Price: $%.2f%n",totalPrice);
		System.out.println();		
	} //end of displayItemsAndTotal()
}
