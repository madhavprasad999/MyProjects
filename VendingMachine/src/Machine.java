import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray; //Get jar from https://jar-download.com/artifacts/org.json
import org.json.JSONObject;

public class Machine {
	
	public void start() {
		Cons.allInventories=new ArrayList<Inventory>();
		FileReader inventoryFile=readFile();
		String jsonString=parseFile(inventoryFile);
		populateInventories(jsonString);
	}
	
	FileReader readFile() {
		FileReader inventoryFile=null;
		try {
			inventoryFile = new FileReader(Cons.FILE_PATH);
			if(!inventoryFile.ready()) return null;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return inventoryFile;
	}
	
	String parseFile(FileReader inventoryFile) {
		if(inventoryFile==null) return "";
		String contentOfFile="";
		Scanner sc= new Scanner(inventoryFile);
		while(sc.hasNext()) {
			contentOfFile +=sc.next();
		}
		
		sc.close();
		return contentOfFile;
	}
	
	void populateInventories(String jsonString) {
		JSONArray jsonArray=new JSONArray(jsonString);
		for(int i=0;i<jsonArray.length();i++) {
			JSONObject jo=jsonArray.getJSONObject(i);
			String nameOfProduct=jo.getString("name");
			Integer availableUnits=jo.getInt("unitsAvailable");
			Float unitPrice=jo.getFloat("price");
			Inventory item=new Inventory(nameOfProduct,availableUnits,unitPrice);
			Cons.allInventories.add(item);
		}
	}
	
	public void showMenu() {
		Menu.showMenu();
		writeIntoFile();
	}
	
	public void writeIntoFile() {
		String stringToWrite="[";
		List<String> allInvAsString=new ArrayList<String>();
		for(Inventory inv:Cons.allInventories) {
			String s="{";
			s+="\"name\":"+inv.nameOfProduct+",";
			s+="\"unitsAvailable\":"+inv.availableUnits+",";
			s+="\"price\":"+inv.unitPrice+",";
			s+="\"soldUnits\":"+inv.soldUnits;
			s+="}";
			s=new JSONObject(s).toString(4);
			allInvAsString.add(s);
		}
		stringToWrite="[\n"+String.join(",\n",allInvAsString)+"\n]";
		
		try {
			FileWriter fw=new FileWriter(Cons.FILE_PATH);
			fw.write(stringToWrite);
			fw.close();
		} catch (IOException e) {
			System.out.println("Could not write into the inventory file. Please use the above text to update the inventory file manually.");
			e.printStackTrace();
		}
		
		
	}
}
