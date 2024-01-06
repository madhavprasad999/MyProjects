import java.util.Scanner;

public class Menu {
	static Scanner sc;
	public static void showMenu() {
		Integer inputByUser;
		do {
			System.out.println("\n\nItems available in the inventory");
			
			int counter=1;
			for(Inventory inv: Cons.allInventories) {
				System.out.println((counter++)+". Product "+inv.nameOfProduct+" has "+inv.availableUnits+" available at "+inv.unitPrice+" per unit.");
			}
			System.out.println("0. Exit and see summary.");
			System.out.print("Enter item number to purchase: ");
			inputByUser=getEntryFromUser();
			showChoice(inputByUser);
		}while(inputByUser>0);
	}
	
	public static Integer getEntryFromUser() {
		sc=new Scanner(System.in);
		Integer input=sc.nextInt();
		return input;
	}
	
	public static void showChoice(Integer choiceMade) {
		if(choiceMade==0) {
			System.out.println("\n\nYou chose 0. Here is the summary of the products.");
			Float totalProfit=0.0f;
			for(Inventory inv: Cons.allInventories) {
				System.out.println(inv.nameOfProduct+": In-Stock("+inv.availableUnits+") and Sold("+ inv.soldUnits+").");
				totalProfit+=(inv.unitPrice*inv.soldUnits);
			}
			System.out.print("Total profit since last time machine started: ");
			System.out.printf("%.2f", totalProfit);
			sc.close();
		}
		else {
			Inventory chosenInventory=Cons.allInventories.get(choiceMade-1);
			System.out.println("You chose the product "+chosenInventory.nameOfProduct+". Enter 0 to Cancel. Please enter the number of units you want to purchase.");
			Integer numberOfUnits=getEntryFromUser();
			if(numberOfUnits<=0) {
				System.out.println("We now cancel the selling process. Returning to previous menu.");
			}
			else if(numberOfUnits>chosenInventory.availableUnits) {
				System.out.println("The entered quantity is more than available units. Returning to the previous menu.");
			}
			else {
				chosenInventory.sell(numberOfUnits);
			}
		}
	}

}
