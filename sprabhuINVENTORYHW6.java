//This is an abstract class which maintains the inventory
public abstract class sprabhuINVENTORYHW6 {
private String inventory_name; //captures the name of the inventory
private int quantity_initial_availability; //captures the initial quantity available for the inventory
private int no_items_sold; //captures the no. of items sold
private double item_price; //captures the item price for each inventory

abstract double calcRevenue(); //This is an abstract class to be implemented by the subclasses

//default constructor
public sprabhuINVENTORYHW6() 
{
        this.inventory_name = "";
        this.quantity_initial_availability = 0;
        this.no_items_sold = 0;
        this.item_price = 0;
}

//parameterized constructor
public sprabhuINVENTORYHW6(String inv_name, int qty_availability, double itemPrice,int no_of_items )
{ 
       this.inventory_name = inv_name;
       this.quantity_initial_availability = qty_availability;
       this.item_price = itemPrice;
       this.no_items_sold = no_of_items ;
}


//This method provides the quantity available for the inventory
public int getAvailability() 
{
	return quantity_initial_availability-no_items_sold; //calculates the available quantity
}

//getter method for item_price
public double getItem_price()
{
	return item_price;
}

//setter method for item_price
public void setItem_price(double item_price)
{
	this.item_price = item_price;
}

//getter method for no_items_sold
public int getNo_items_sold()
{
	return no_items_sold;
}

//setter method for no_items_sold
public void setNo_items_sold(int no_items_sold)
{
	this.no_items_sold = no_items_sold;
}

//getter method for quantity_initial_availability
public int getQuantity_initial_availability()
{
	return quantity_initial_availability;
}

//setter method for quantity_initial_availability
public void setQuantity_initial_availability(int quantity)
{
	this.quantity_initial_availability = quantity;
}

//getter method for inventory_name
public String getInventory_name()
{
	return inventory_name;
}

//setter method for inventory_name
public void setInventory(String inventory)
{
	this.inventory_name = inventory;
}

//This method displays general details the inventory
public void display()
{
System.out.println("Inventory Name: "+ getInventory_name());
System.out.println("Item price: $"+getItem_price() );
System.out.println("No of items sold: "+ getNo_items_sold());
}
}
