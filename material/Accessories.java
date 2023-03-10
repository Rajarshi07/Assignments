package material;

import stock.Inventory;

public class Accessories extends Inventory{
	@Override
	public String toString() {
		return "Accessories [uId=" + uId + ", type=" + type + ", brand=" + brand + ", model=" + model + ", price="
				+ price + ", quantity=" + getQuantity() + ", lowLevelOrderQuantity=" + getLowLevelOrderQuantity() + "]";
	}
	int uId;
	String type,brand,model;
	double price;
	public Accessories(int quantity, int uId, String type, String brand, String model,
			double price) {
		super(quantity, 5);
		this.uId = uId;
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	@Override
	public void printInvoice(int qty) {
		// TODO Auto-generated method stub
		super.printInvoice(qty);
		System.out.print("Invoice for Accessory\n"+brand+" "+model+" " +" "+type+" \t rs."+price+" x"+qty);
		System.out.println("  Total:"+price*qty);
	}
	@Override
	public void generateRFM() {
		// TODO Auto-generated method stub
		super.generateRFM();
		System.out.println("GENERATING RFM\n"+this.toString());
	}

}
