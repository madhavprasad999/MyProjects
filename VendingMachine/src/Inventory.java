
public class Inventory {
	String nameOfProduct;
	Integer availableUnits;
	Float unitPrice;
	Integer soldUnits;
	
	Inventory(String nameOfProduct,Integer availableUnits,Float unitPrice){
		this.nameOfProduct=nameOfProduct;
		this.availableUnits=availableUnits;
		this.unitPrice=unitPrice;
		this.soldUnits=0;
	}
	
	public Boolean sell(Integer numberOfItems) {
		if(numberOfItems>availableUnits) {
			return false;
		}
		
		soldUnits+=numberOfItems;
		availableUnits-=numberOfItems;
		System.out.println("Despensing "+ numberOfItems+". Please collect.");
		return  true;
	}
	
	
}
