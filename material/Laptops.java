package material;

import stock.Inventory;

public class Laptops extends Inventory {
	int uId;
	String brand,model,processor;
	int ram,storage;
	double price;



	public Laptops(int quantity, int uId, String brand, String model, String processor,
			int ram, int storage,double price) {
		super(quantity,3);
		this.uId = uId;
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
	}
	@Override
	public void printInvoice(int qty) {
		// TODO Auto-generated method stub
		super.printInvoice(qty);
		System.out.print("Invoice for "+brand+" "+model+" " +"("+processor+", "+ram+"GB/"+storage+"GB) x"+qty);
		System.out.println("  Total: "+price*qty);
	}
	@Override
	public String toString() {
		return "Laptops [uId=" + uId + ", brand=" + brand + ", model=" + model + ", processor=" + processor + ", ram="
				+ ram + ", storage=" + storage + ", price=" + price + ", quantity=" + getQuantity()
				+ ", lowLevelOrderQuantity=" + getLowLevelOrderQuantity() + "]";
	}
	@Override
	public void generateRFM() {
		// TODO Auto-generated method stub
		super.generateRFM();
		System.out.println("GENERATING RFM\n"+this.toString());
	}

}
